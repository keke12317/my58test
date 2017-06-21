package com.st.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface StartCountMapper {
    Integer getCount(Map map);

}