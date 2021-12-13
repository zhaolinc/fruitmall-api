package glut.fruitmall.controller;

import glut.fruitmall.model.User;
import glut.fruitmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 赵林
 * @date 2021/12/8 9:36
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/selectByopenid") // /user/selectByopenid
    public User selectByopenid(String openid){
        //System.out.println(openid);
        User user = this.userService.selectByopenid(openid);
        return user;
    }

    @ResponseBody
    @RequestMapping("/saveuser") // /user/saveuser
    public int saveuser(User user){
        //System.out.println("user----"+user);
        User user1 = this.userService.selectByopenid(user.getOpenid());
        //System.out.println("user1----"+user1);
        if (user1 == null){
            int i = this.userService.saveuser(user);
            if(i != 0){
                return  1;//插入成功
            }else {
                return 0;//插入失败
            }
        }else {
            return 1;
        }
    }
}
