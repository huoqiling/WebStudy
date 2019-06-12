package com.zhangxin.shopcar.controller;

import com.zhangxin.shopcar.domain.entity.ResponseBean;
import com.zhangxin.shopcar.domain.entity.UserBean;
import com.zhangxin.shopcar.domain.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    UserRepository repository;

    /**
     *
     * @param name 用户名
     * @param password 密码
     * @param payPassword 支付密码
     * @param phone 手机号码
     * @return 注册
     */
    @PostMapping(value = "/user/register")
    public ResponseBean register(@RequestParam String name, @RequestParam String password, @RequestParam String payPassword, @RequestParam String phone){
        if(null != repository.findByName(name)){
            return new ResponseBean(ResponseBean.FAIL,"用户名已经被使用");
        }
        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);
        userBean.setPhone(phone);
        userBean.setPayPassword(payPassword);
        ResponseBean bean = new ResponseBean(ResponseBean.SUCCESS, repository.save(userBean));

        return bean;
    }

    @PostMapping(value = "user/login")
    public ResponseBean login(@RequestParam String name, @RequestParam String password){
        UserBean userBean = repository.findByName(name);
        if(null != userBean){
            if(userBean.getPassword().equals(password)){
                return new ResponseBean(ResponseBean.SUCCESS,userBean);
            }else{
                return new ResponseBean(ResponseBean.FAIL,"密码错误,请重新输入");
            }
        }else{
            return new ResponseBean(ResponseBean.FAIL,"没有此用户");
        }
    }
}
