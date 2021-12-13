package glut.fruitmall.service;

import glut.fruitmall.model.Order;

import java.util.List;

/**
*
*/
public interface OrderService{
    /**
     * 查询用户所有订单
     * @param order
     * @return
     */
    List<Order> selectAll(Order order);

    /**
     * 插入水果订单
     * @param order
     * @return
     */
    int insert(Order order);

    /**
     * 修改订单状态
     * @return
     */
    int update2(String orderid);//待发货
    int update3(String orderid);//待收货
    int update4(String orderid);//待评价
    int update5(String orderid);//订单完成
}
