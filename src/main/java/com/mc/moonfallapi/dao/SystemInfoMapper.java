package com.mc.moonfallapi.dao;

import com.mc.moonfallapi.vo.SystemInfo;
import com.mc.moonfallapi.vo.SystemInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemInfoMapper {
    int countByExample(SystemInfoExample example);

    int deleteByExample(SystemInfoExample example);

    int insert(SystemInfo record);

    int insertSelective(SystemInfo record);

    List<SystemInfo> selectByExample(SystemInfoExample example);

    int updateByExampleSelective(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);

    int updateByExample(@Param("record") SystemInfo record, @Param("example") SystemInfoExample example);
}