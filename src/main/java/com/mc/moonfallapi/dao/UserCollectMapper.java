package com.mc.moonfallapi.dao;

import com.mc.moonfallapi.vo.UserCollect;
import com.mc.moonfallapi.vo.UserCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCollectMapper {
    int countByExample(UserCollectExample example);

    int deleteByExample(UserCollectExample example);

    int insert(UserCollect record);

    int insertSelective(UserCollect record);

    List<UserCollect> selectByExample(UserCollectExample example);

    int updateByExampleSelective(@Param("record") UserCollect record, @Param("example") UserCollectExample example);

    int updateByExample(@Param("record") UserCollect record, @Param("example") UserCollectExample example);
}