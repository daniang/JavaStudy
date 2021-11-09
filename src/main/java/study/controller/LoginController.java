package study.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import study.dto.LoginDto;
import study.model.User;
import study.service.LogService;
import study.utils.PassToken;
import study.utils.ResultVo;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Base64;


@Slf4j
@Api(tags = "登录接口")
@RequestMapping("Login")
@RestController
public class LoginController {

    @Resource
    private LogService logService;

    @ApiOperation("登录")
    @PassToken
    @PostMapping("authorizeLogin")
    public ResultVo<User> authorizeLogin(@RequestBody LoginDto loginDto){



        return ResultVo.success();
    }

    @ApiOperation(value = "excel")
    @GetMapping(value = "logDownload")
    public void logDownload( String name, HttpServletResponse response) throws Exception {
        logService.logDownload(name,response);

    }




}
