package com.zdh.api.controller;

import com.google.common.collect.Maps;
import com.zdh.api.Entity.UserInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangdahu
 */
@RestController
@RequestMapping("api/1.0/rest")
public class RestApiController {

    @ApiOperation(value = "index", tags = "restApi", notes = "返回一个字符串")
    @GetMapping()
    public String intdex(){
        return "hello world";
    }

    @ApiOperation(value = "getparam", tags = "restApi", notes = "返回一个Map")
    @GetMapping("param")
    public Map<String, Object> getParam(
            @RequestParam("name") String name
    ){
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", name);
        return map;
    }

    @ApiOperation(value = "通知Id获取资源", tags = "restApi", notes = "id路由取一个object")
    @GetMapping("param/{id}")
    public UserInfo getById(
            @PathVariable("id") long id
    ){
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName("zhangdahu");
        return userInfo;
    }
}
