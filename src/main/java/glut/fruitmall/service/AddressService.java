package glut.fruitmall.service;


import glut.fruitmall.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public interface AddressService{
    /**
     * 查询用户地址
     * @param openid
     * @return
     */
    List<Address> selectAll(String openid);

    /**
     * 选择默认地址
     * @param openid
     * @return
     */
    Address selectDefault(String openid);

    /**
     * 设置默认地址
     * @param openid
     * @return
     */
    int updateDefault(String openid);

    /**
     * 新增用户地址
     * @param address
     * @return
     */
    int saveAddress(Address address);
}
