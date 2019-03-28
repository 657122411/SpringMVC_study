package com.tjh.dao;

import com.tjh.entity.Class;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ClassDao {
    private Map<Integer, Class> classMap = new HashMap<Integer, Class>();

    /*新增课程*/
    public void add(Class mclass){
        classMap.put(mclass.getId(),mclass);
    }
    /*查询全部课程*/
    public Collection<Class> getAll(){
        return classMap.values();
    }

    /*通过id查询课程*/
    public Class getById(int id){
        return classMap.get(id);
    }

    /*修改课程*/
    public void update(Class mclass){
        classMap.put(mclass.getId(),mclass);
    }

    /*删除*/
    public void deleteById(int id){
        classMap.remove(id);
    }
}
