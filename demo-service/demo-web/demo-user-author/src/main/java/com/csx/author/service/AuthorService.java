package com.csx.author.service;

import com.csx.model.R;
import com.csx.model.dtos.LoginDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface AuthorService {

    /**
     * 登录
     */
    R doLogin(@RequestBody LoginDto dto);


}
