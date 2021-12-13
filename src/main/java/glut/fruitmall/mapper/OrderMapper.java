package glut.fruitmall.mapper;

import com.sun.org.apache.xpath.internal.operations.Or;
import glut.fruitmall.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @Entity glut.fruitmall.model.Order
*/
@Mapper
public interface OrderMapper{

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
    int update2(String openid);//待发货
    int update3(String openid);//待收货
    int update4(String openid);//待评价
    int update5(String openid);//订单完成


}
