package com.zdh.api.controller;

import com.zdh.api.Entity.UserInfo;
import com.zdh.api.repository.UserInfoRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @GetMapping("/list")
    public List<UserInfo> get() {
        List<UserInfo> userInfoList = userInfoRepository.findAll();
        return userInfoList;
    }

    @ApiOperation(value = "index", tags = "user", notes = "返回一个字符串")
    @PostMapping("/save")
    public UserInfo save() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("zhang");
        return userInfoRepository.save(userInfo);
    }
}
