package me.xueyao.mybatis.mapper;

import me.xueyao.mybatis.pojo.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author XueYao
 * @date 2017-12-08
 */
public interface OrderMapper {

    /**
     * 根据订单号查询订单信息，并查询出下单人的信息
     * @param number 订单号
     * @return 订单结果对象
     */
    Order queryOrderWithUser(@Param("number") String number);

    /**
     * 查询订单，并查询出订单人信息并且查询订单详情
     * @param number 订单号
     * @return 订单对象
     */
    Order queryOrderWithUserDetail(@Param("number") String number);

    /**
     * 查询订单，并查询出订单人信息并且查询订单详情中的商品数据
     * @param number 订单号
     * @return 订单对象
     */
    Order queryOrderWithUserDetailItem(@Param("number") String number);

    /**
     * 查询订单，启用延迟加载
     * @param number 订单号
     * @return 订单对象
     */
    Order queryOrderLazy(@Param("number") String number);
}
