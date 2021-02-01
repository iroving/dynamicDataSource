package com.iroving.dynamicdatasource.service;

import com.iroving.dynamicdatasource.annotation.DbSource;
import com.iroving.dynamicdatasource.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

//    @DbSource("master")
    public void test() {
        System.out.println(testMapper.listUserTable());
    }

//    @DbSource("slave")
    public void test2() {
        System.out.println(testMapper.listUserTable2());
    }
}
