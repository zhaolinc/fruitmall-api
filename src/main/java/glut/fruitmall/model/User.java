package glut.fruitmall.model;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @TableName user
 */
@Data
@ToString
public class User{
    /**
     * 用户唯一标识
     */
    private String openid;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 性别（0：女  1：男）
     */
    private Integer gender;

    /**
     * 用户头像
     */
    private String avatarurl;

    /**
     * 国家
     */
    private String country;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;
}