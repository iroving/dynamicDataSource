package com.iroving.dynamicdatasource.mapper;

import com.iroving.dynamicdatasource.annotation.DbSource;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {
    @DbSource("master")
    List<Map<String, Object>> listUserTable();

    @DbSource("slave")
    List<Map<String, Object>> listUserTable2();
}
