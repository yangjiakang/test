@Override
    public Map<Object,Object> findTreeData() {
        List<Organizational> list = getDao().selectTreeAll();
        if(list.size()>0){
           return parentNode(list,"first");
        }
        return null;
    }

    /*
    包装节点信息
     */
    public Map<Object,Object> parentNode(List<Organizational> list,String type){
        if("first".equals(type)){
            List recodeList = new ArrayList();
            //顶级节点
            Map<Object,Object> parMap = new HashMap<>();
            List<Map<Object,Object>> childList = new ArrayList<>();
            boolean flag=false;
            //二级节点
            Map<Object,Object> map;
            for(int i =0;i<list.size();i++){
                Organizational org = list.get(i);
                if("0".equals(org.getParentId())){
                    parMap.put("name",org.getName());
                    parMap.put("id",org.getId());
                    parMap.put("parentId",org.getParentId());
                    parMap.put("spread",false);
                    //去掉自己
                    list.remove(i);
                    StringBuffer str = new StringBuffer();
                    for(int j=0;j<list.size();j++){
                        Organizational o1 = list.get(j);
                        if(org.getId().equals(o1.getParentId())){
                            flag=true;
                            map = new HashMap<>();
                            map.put("name",o1.getName());
                            map.put("parentId",o1.getParentId());
                            map.put("id",o1.getId());
                            map.put("spread",false);
                            childList.add(map);
                            //去掉自己
//                            list.remove(j);
                            recodeList.add(o1);
                            str.append(o1.getId()+",");
                        }
                    }
                    if(childList.size()>0 && list.size()>(childList.size()+1)){//判断是否还有下一级节点，父类加上二级节点,递归调用
                        list.removeAll(recodeList);//去掉二级节点
                        List<Map<Object,Object>> list1 = (List)parentNode(list,str.toString()).get("children");
                        List<Map<Object,Object>> chidrenList;
                        List<Map<Object,Object>> countList = new ArrayList<>();
                        for (int o=0;o<childList.size();o++){
                            chidrenList = new ArrayList<>();
                            map = (Map)childList.get(o);
                            for(Map<Object,Object> chMap:list1){
                                if(chMap.get("parentId").equals(map.get("id"))){
                                    chidrenList.add(chMap);
                                }
                            }
                            map.put("children",chidrenList);
                            countList.add(map);
                        }
                        //包含二级和以下的节点
                        flag = false;
                        parMap.put("children",countList);
                    }
                    if (flag){
                        parMap.put("children",childList);
                    }
                    break;
                }
            }
            return parMap;
        }else{
            Map<Object,Object> countMap = new HashMap<>();
            Map<Object,Object> objectMap;
            String[] ids = type.split(",");
            StringBuffer str = new StringBuffer();
            List nodeList = new ArrayList();
            List recodeList = new ArrayList<>();
            if(ids.length>0){
                for(int i=0;i<ids.length;i++){
                    String id = ids[i];
                    for(int j=0;j<list.size();j++){
                        Organizational o2 = list.get(j);
                        if(id.equals(o2.getParentId())){
                            objectMap = new HashMap<>();
                            objectMap.put("id",o2.getId());
                            objectMap.put("parentId",o2.getParentId());
                            objectMap.put("name",o2.getName());
                            objectMap.put("spread",false);
//                            list.remove(j);
                            recodeList.add(o2);//记录使用
                            str.append(o2.getId()+",");
                            nodeList.add(objectMap);
                        }
                    }
                }
                list.removeAll(recodeList);
                if(list.size()>0){//判断是否还有子集（包括多级）
                    List<Map<Object,Object>> list1 = (List)parentNode(list,str.toString()).get("children");
                    List<Map<Object,Object>> chidrenList;
                    List<Map<Object,Object>> countList = new ArrayList<>();
                    for (int o=0;o<nodeList.size();o++){
                        chidrenList = new ArrayList<>();
                        objectMap = (Map)nodeList.get(o);
                        for(Map<Object,Object> chMap:list1){
                            if(chMap.get("parentId").equals(objectMap.get("id"))){
                                chidrenList.add(chMap);
                            }
                        }
                        objectMap.put("children",chidrenList);
                        countList.add(objectMap);
                    }
                    countMap.put("children",countList);
                }else{//只有第三级
                    countMap.put("children",nodeList);
                }
            }
            return countMap;
        }

    }