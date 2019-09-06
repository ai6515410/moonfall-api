package com.mc.moonfallapi.dao;

import com.mc.moonfallapi.vo.Store;
import com.mc.moonfallapi.vo.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);
}