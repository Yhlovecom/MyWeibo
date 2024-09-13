package com.tedu.shopping.mapper;

import com.tedu.shopping.pojo.entity.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {//收货地址地址表操作接口
    int addAddress(Address address);//添加收货地址
    List<Address> selectAllAddress();//查看所有收货地址信息
    int deleteAddress(Integer id);//删除收货地址
    int updateAddress(Address address);//更新收货地址
}
