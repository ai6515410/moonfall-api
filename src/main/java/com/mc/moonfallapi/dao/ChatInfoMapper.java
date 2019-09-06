package com.mc.moonfallapi.dao;

import com.mc.moonfallapi.vo.ChatInfo;
import com.mc.moonfallapi.vo.ChatInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatInfoMapper {
    int countByExample(ChatInfoExample example);

    int deleteByExample(ChatInfoExample example);

    int insert(ChatInfo record);

    int insertSelective(ChatInfo record);

    List<ChatInfo> selectByExample(ChatInfoExample example);

    int updateByExampleSelective(@Param("record") ChatInfo record, @Param("example") ChatInfoExample example);

    int updateByExample(@Param("record") ChatInfo record, @Param("example") ChatInfoExample example);
}