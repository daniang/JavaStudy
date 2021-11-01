package study.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import study.dto.LoginDto;
import study.model.User;
import study.utils.PassToken;
import study.utils.ResultVo;

import java.util.Base64;


@Slf4j
@Api(tags = "登录接口")
@RequestMapping("Login")
public class LoginController {

    @ApiOperation("登录")
    @PassToken
    @PostMapping("authorizeLogin")
    public ResultVo<User> authorizeLogin(@RequestBody LoginDto loginDto){
        



        return ResultVo.success();
    }


}
