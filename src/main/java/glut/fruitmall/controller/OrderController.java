package glut.fruitmall.controller;

import glut.fruitmall.model.Order;
import glut.fruitmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author 赵林
 * @date 2021/12/12 9:14
 **/
@ResponseBody
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/selectAll")
    public List<Order> selectAll(Order order){
        return this.orderService.selectAll(order);
    }

    @RequestMapping("/insert")
    public int insert(Order order){
        order.setOrderid(UUID.randomUUID().toString());
        //System.out.println(order);
        int i = this.orderService.insert(order);
        if (i != 0){
            return 1;
        }else
            return 0;
    }

    @RequestMapping("/update")
    public int update(String orderid,Integer type){
        if(type==1){
            return this.orderService.update2(orderid);
        }else if(type==2){
            return this.orderService.update3(orderid);
        }else if(type==3){
            return this.orderService.update4(orderid);
        }else if(type==4){
            return this.orderService.update5(orderid);
        }else{
            return 0;
        }

    }

}
