package com.tao.springboot.controller;

import com.tao.springboot.bean.SysUsers;
import com.tao.springboot.bean.SysUsersExample;
import com.tao.springboot.mapper.SysUsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class UserInfoController {

    private Logger logger=LoggerFactory.getLogger(UserInfoController.class);

    @Autowired
    private SysUsersMapper sysUsersMapper;

    @RequestMapping("/info")
    @ResponseBody
    public List<SysUsers> getInfo(String username){
        logger.debug("username={}",username);

//        SysUsersExample example=new SysUsersExample();
//        SysUsersExample.Criteria criteria = example.createCriteria();
//        criteria.andUsernameEqualTo(username);

        List<SysUsers> info = sysUsersMapper.selectByUsername(username);
        logger.debug("info={}", info);
        return info;
    }

    @RequestMapping("/123")
    public List<SysUsers> getInfo1(String username){
        logger.debug("username={}",username);

        SysUsersExample example=new SysUsersExample();
        SysUsersExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<SysUsers> info = sysUsersMapper.selectByExample(example);
        logger.debug("info={}", info);
        return info;
    }
}
