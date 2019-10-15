package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TravellerDao {
    @Select("select * from traveller where id in ( select travellerId from ORDER_TRAVELLER where id = #{ordersid})")
    public List<Traveller> findByOrdersId(String ordersid);
}
