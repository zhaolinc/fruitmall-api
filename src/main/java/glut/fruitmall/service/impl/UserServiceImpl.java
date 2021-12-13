package glut.fruitmall.service.impl;

import glut.fruitmall.mapper.UserMapper;
import glut.fruitmall.model.Fruit;
import glut.fruitmall.model.User;
import glut.fruitmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByopenid(String openid) {
        return this.userMapper.selectByopenid(openid);
    }

    @Override
    public int saveuser(User user) {
        return this.userMapper.saveuser(user);
    }
}
