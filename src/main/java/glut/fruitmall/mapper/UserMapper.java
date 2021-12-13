package glut.fruitmall.mapper;

import glut.fruitmall.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @Entity glut.fruitmall.model.User
*/
@Mapper
public interface UserMapper{
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
