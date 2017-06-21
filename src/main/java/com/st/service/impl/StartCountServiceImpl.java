package com.st.service.impl;

import com.st.mapper.StartCountMapper;
import com.st.service.StartCountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by admin on 2016/11/22.
 */
@Service
class StartCountServiceImpl implements StartCountService {
    private Logger logger = LoggerFactory.getLogger(StartCountServiceImpl.class);
    @Autowired
    private StartCountMapper startCountMapper;

    @Override
    public Integer getCount(Map map) {
        return startCountMapper.getCount(map);
    }


}
