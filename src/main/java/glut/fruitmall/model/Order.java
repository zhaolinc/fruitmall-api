package glut.fruitmall.model;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @TableName order
 */

@Data
@ToString
public class Order{
    /**
     * 订单唯一标识(UUID)
     */
    private String orderid;

    /**
     * 水果id
     */
    private String fruitid;

    /**
     * 用户openid
     */
    private String openid;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 水果图片
     */
    private String filepath;

    /**
     * 水果名称
     */
    private String fruitTitle;

    /**
     * 水果详细描述
     */
    private String fruitDetail;

    /**
     * 数量
     */
    private Integer num;

    /**
     * 总价
     */
    private Double sumprice;

    /**
     * 评价
     */
    private String evaluation;
}