package glut.fruitmall.controller;

import glut.fruitmall.model.Address;
import glut.fruitmall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author 赵林
 * @date 2021/12/9 14:21
 **/
@ResponseBody
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    /**
     * 查询用户所有地址
     * @param openid
     * @return
     */
    @RequestMapping("/selectAll")
    public List<Address> selectAll(String openid){
        return this.addressService.selectAll(openid);
    }

    /**
     * 选择默认地址
     * @param openid
     * @return
     */
    @RequestMapping("/selectDefault")
    public Address selectDefault(String openid){
        return this.addressService.selectDefault(openid);
    }

    @RequestMapping("/saveAddress")
    public int saveAddress(Address address){
        address.setAddressid(UUID.randomUUID().toString());
        if(address.getType()==1){//默认地址
            this.addressService.updateDefault(address.getOpenid());
        }
        int i = this.addressService.saveAddress(address);
        if(i!=0){
            return 1;
        }else {
            return 0;
        }
    }
}
