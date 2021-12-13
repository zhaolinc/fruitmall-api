package glut.fruitmall.service.impl;

import glut.fruitmall.mapper.AddressMapper;
import glut.fruitmall.model.Address;
import glut.fruitmall.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> selectAll(String openid) {
        return this.addressMapper.selectAll(openid);
    }

    @Override
    public Address selectDefault(String openid) {
        return this.addressMapper.selectDefault(openid);
    }

    @Override
    public int updateDefault(String openid) {
        return this.addressMapper.updateDefault(openid);
    }

    @Override
    public int saveAddress(Address address) {
        return this.addressMapper.saveAddress(address);
    }
}
