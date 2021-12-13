package glut.fruitmall.model;
import lombok.Data;
import lombok.ToString;

/**
 * 
 * @TableName fruit
 */
@Data
@ToString
public class Fruit{
    /**
     * 商品唯一标识
     */
    private String fruitid;

    /**
     * 水果标题
     */
    private String title;

    /**
     * 水果详细信息
     */
    private String detail;

    /**
     * 库存量
     */
    private Integer stock;

    /**
     * 水果类型
     */
    private Integer type;

    /**
     * 水果价格
     */
    private Integer price;

    /**
     * 状态（0：下架、1：上架）
     */
    private Integer status;

    /**
     * 浏览次数
     */
    private Integer viewnum;

    /**
     * 水果图片
     */
    private String filepath;
}