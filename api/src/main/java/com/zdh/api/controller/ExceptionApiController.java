package com.zdh.api.controller;

import com.google.common.collect.Maps;
import com.zdh.api.Entity.UserInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhangdahu
 */
@RestController
@RequestMapping("api/1.0/exception")
public class ExceptionApiController {

    @ApiOperation(value = "index", tags = "exception", notes = "返回一个字符串")
    @GetMapping()
    public String runtimeExcetption() {
        throw new RuntimeException("test");
    }

}
