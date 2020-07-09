package cn.stephen.study.demoproject.controller;

import cn.stephen.study.demoproject.entity.TestEntity;
import cn.stephen.study.demoproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demoproject/test")
public class TestController {

    @Autowired
    private TestService testService ;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public TestEntity test(@PathVariable Integer id){
        System.out.println("id:" + id);
        return testService.getById(id);
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public int insert(@RequestBody TestEntity testEntity){
        System.out.println("testEntity:" + testEntity);
        return testService.insert(testEntity);
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.GET)
    public int del(@PathVariable Integer id){
        System.out.println("id:" + id);
        return testService.del(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public int update(@RequestBody TestEntity testEntity){
        System.out.println("testEntity:" + testEntity);
        return testService.update(testEntity);
    }

}