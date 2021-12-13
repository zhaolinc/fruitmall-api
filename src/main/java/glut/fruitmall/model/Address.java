package glut.fruitmall.model;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @TableName address
 */
@Data
@ToString
public class Address{
    /**
     * 地址唯一标识
     */
    private String addressid;

    /**
     * 用户Code
     */
    private String openid;

    /**
     * 是否为默认1、0不默认
     */
    private Integer type;

    /**
     * 收货人姓名
     */
    private String name;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 国家
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县
     */
    private String county;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 性别
     */
    private Integer gender;
}