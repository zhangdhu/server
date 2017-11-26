package com.zdh.api.controller;

import com.zdh.api.Entity.UserInfo;
import com.zdh.api.repository.UserInfoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * user info
 *
 * @author zhangdahu
 */
@RestController
@RequestMapping("api/1.0/user")
public class UserInfoController {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @ApiOperation(value = "index", tags = "user", notes = "返回一个字符串")
    @GetMapping()
    public List<UserInfo> intdex() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(11L);
        userInfo.setName("zhang");
        userInfoRepository.save(userInfo);
        List<UserInfo> userInfoList = userInfoRepository.findAll();
//        return userInfoRepository.save(userInfo);
        return userInfoList;
    }
}
