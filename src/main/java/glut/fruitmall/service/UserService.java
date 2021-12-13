package glut.fruitmall.service;

import glut.fruitmall.model.Fruit;
import glut.fruitmall.model.User;

/**
*
*/
public interface UserService{
    /**
     * 查询单个用户
     * @param openid
     * @return
     */
    User selectByopenid(String openid);

    /**
     * 插入用户信息
     * @param user
     * @return
     */
    int saveuser(User user);

}
