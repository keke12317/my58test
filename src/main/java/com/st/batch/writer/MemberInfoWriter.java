package com.st.batch.writer;

import com.st.batch.entity.MemberInfo;
import com.st.mapper.MfPushMemberDMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 2016/12/30.
 */
public class MemberInfoWriter implements ItemWriter<MemberInfo> {
    private static Logger logger = LoggerFactory.getLogger(MemberInfoWriter.class);
    @Autowired
    private MfPushMemberDMapper mfPushMemberDMapper;

    @Override
    public void write(List<? extends MemberInfo> list) throws Exception {
        logger.info("[PosCountersDsWriter write] run list size:" + list.size());
    //    if (!list.isEmpty())
    //    mfPushMemberDMapper.addMemberInfoBatch(list);
    }
}
