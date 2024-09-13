package com.tedu.shopping.controller;

import com.tedu.shopping.mapper.AddressMapper;
import com.tedu.shopping.pojo.dto.AddressDTO;
import com.tedu.shopping.pojo.entity.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {//收货地址数据表控制层

    @Autowired
    private AddressMapper addressMapper;
    @PutMapping("/address/insert")
    public String addAddress(AddressDTO addressDTO) {//添加收货地址
        Address address = new Address();
        BeanUtils.copyProperties(addressDTO, address);
        int num = 0;
        try {
            num = addressMapper.addAddress(address);
        }catch (Exception e){
            //向上传递错误信息
            return e.getMessage();
        }
        return num == 0 ? "添加失败" : "添加成功共" + num + "条数据受影响";
    }

    @GetMapping("/address/select")//查询收货地址
    public List<Address> selectAllAddress() {

        try {
            return addressMapper.selectAllAddress();
        }catch (Exception e){
            System.out.println("查询数据时出现问题");
            return null;
        }
    }

    @DeleteMapping("/address/delete/{id}")//删除收货地址
    public String deleteAddress(@PathVariable("id") Integer id) {
        int num = 0;
        try {
            num = addressMapper.deleteAddress(id);
        }catch (Exception e){
            System.out.println("删除数据时出现问题");
        }
        return num == 0 ? "删除失败" : "删除成功共" + num + "条数据受影响";
    }

    @PatchMapping("/address/update")//修改收货地址
    public String updateAddress(AddressDTO addressDTO) {
        Address address = new Address();
        BeanUtils.copyProperties(addressDTO, address);
        int num = 0;
        try {
            num = addressMapper.updateAddress(address);
        }catch (Exception e){
            System.out.println("修改数据时出现问题");
        }
        return num == 0 ? "修改失败" : "修改成功共" + num + "条数据受影响";
    }
}
