package cn.stephen.study.demoproject.service;

import cn.stephen.study.demoproject.dao.TestDao;
import cn.stephen.study.demoproject.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }

    public int insert(TestEntity testEntity){
        return testDao.insert(testEntity);
    }

    public int del(Integer id){
        return testDao.del(id);
    }

    public int update(TestEntity testEntity){
        return testDao.update(testEntity);
    }
}