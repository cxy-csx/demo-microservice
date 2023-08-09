package com.csx.author.controller;

import com.csx.author.service.impl.AuthorServiceImpl;
import com.csx.model.R;
import com.csx.model.dtos.LoginDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "登录授权模块")
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorServiceImpl authorService;

    @ApiOperation("登录")
    @PostMapping("login")
    public R doLogin(@RequestBody LoginDto dto) {
        return authorService.doLogin(dto);
    }

}
