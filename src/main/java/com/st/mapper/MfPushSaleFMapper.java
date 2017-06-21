package com.st.mapper;

import com.st.batch.entity.MfPushSaleF;

public interface MfPushSaleFMapper {
    int deleteByPrimaryKey(String integrationId);

    int insert(MfPushSaleF record);

    int insertSelective(MfPushSaleF record);

    MfPushSaleF selectByPrimaryKey(String integrationId);

    int updateByPrimaryKeySelective(MfPushSaleF record);

    int updateByPrimaryKey(MfPushSaleF record);
}