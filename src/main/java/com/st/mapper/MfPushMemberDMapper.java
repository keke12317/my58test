package com.st.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MfPushMemberDMapper {
    //int insert(MfPushMemberD record);
    //
    //int insertByBatch(List list);
    //
    //int insertUserByBatch(List list);
    //
    //MfPushMemberD selectByMemberId(String id);
    //
    //List<MfPushMemberD> selectForSendData();
    //
    //int updateByMemberId(MfPushMemberD record);

    List<Map> selectForSendInfoUpdate();

    List<Map> selectForSendBlindPhone();

    List<Map> selectForSendMemUp();

    void setPushFlag(Map map);

    void setLevelUpdateFlag(Map map);

    void setFirstFlag(Map map);

    List<Map> selectForSplitPush(@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    Map selectForSplitPushByKey(String ifMemberId);

    Integer getAllCount();
}