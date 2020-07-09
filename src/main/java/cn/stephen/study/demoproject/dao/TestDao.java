package cn.stephen.study.demoproject.dao;

import cn.stephen.study.demoproject.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

    int insert(TestEntity testEntity);

    int del(Integer id);

    int update(TestEntity testEntity);

}