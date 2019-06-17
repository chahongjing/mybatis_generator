package com.dmall.ws.newdao.mapper;

import com.dmall.ws.newdao.model.WsWorkOrder;
import com.dmall.ws.newdao.model.WsWorkOrderCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WsWorkOrderMapper {
    int countByCondition(WsWorkOrderCondition example);

    int deleteByCondition(WsWorkOrderCondition example);

    int deleteById(Long id);

    int insert(WsWorkOrder record);

    int insertSelective(WsWorkOrder record);

    List<WsWorkOrder> selectByCondition(WsWorkOrderCondition example);

    WsWorkOrder selectById(Long id);

    int updateByConditionSelective(@Param("record") WsWorkOrder record, @Param("example") WsWorkOrderCondition example);

    int updateByCondition(@Param("record") WsWorkOrder record, @Param("example") WsWorkOrderCondition example);

    int updateByIdSelective(WsWorkOrder record);

    int updateById(WsWorkOrder record);
}