package com.dmall.ws.newdao.mapper;

import com.dmall.ws.newdao.model.AppealOrder;
import com.dmall.ws.newdao.model.AppealOrderCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppealOrderMapper {
    int countByCondition(AppealOrderCondition example);

    int deleteByCondition(AppealOrderCondition example);

    int deleteById(Long id);

    int insert(AppealOrder record);

    int insertSelective(AppealOrder record);

    List<AppealOrder> selectByCondition(AppealOrderCondition example);

    AppealOrder selectById(Long id);

    int updateByConditionSelective(@Param("record") AppealOrder record, @Param("example") AppealOrderCondition example);

    int updateByCondition(@Param("record") AppealOrder record, @Param("example") AppealOrderCondition example);

    int updateByIdSelective(AppealOrder record);

    int updateById(AppealOrder record);
}