package glut.fruitmall.service.impl;

import glut.fruitmall.mapper.OrderMapper;
import glut.fruitmall.model.Order;
import glut.fruitmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> selectAll(Order order) {
        return this.orderMapper.selectAll(order);
    }

    @Override
    public int insert(Order order) {
        return this.orderMapper.insert(order);
    }

    @Override
    public int update2(String orderid) {
        return this.orderMapper.update2(orderid);
    }

    @Override
    public int update3(String orderid) {
        return this.orderMapper.update3(orderid);
    }

    @Override
    public int update4(String orderid) {
        return this.orderMapper.update4(orderid);
    }

    @Override
    public int update5(String orderid) {
        return this.orderMapper.update5(orderid);
    }
}
