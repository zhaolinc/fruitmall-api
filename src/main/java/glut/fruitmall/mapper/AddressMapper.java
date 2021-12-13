package glut.fruitmall.mapper;

import glut.fruitmall.model.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @Entity glut.fruitmall.model.Address
*/
@Mapper
public interface AddressMapper{
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
