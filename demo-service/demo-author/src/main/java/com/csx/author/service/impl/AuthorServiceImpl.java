package com.csx.author.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.csx.author.mapper.UserMapper;
import com.csx.author.service.AuthorService;
import com.csx.model.R;
import com.csx.model.dtos.LoginDto;
import com.csx.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public R doLogin(LoginDto dto) {


        User user = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getUsername, dto.getUsername()));


        log.info("用户信息:{}", user);

        return R.SUCCESS(user);

    }

}
