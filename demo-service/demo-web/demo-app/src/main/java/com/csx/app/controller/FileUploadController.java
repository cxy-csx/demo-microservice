package com.csx.app.controller;

import com.csx.api.file.storage.UploadClient;
import com.csx.model.R;
import com.csx.model.dtos.LoginDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("file")
@Api(tags = "文件上传")
public class FileUploadController {

    @Autowired
    private UploadClient uploadClient;

    @PostMapping("upload")
    public R upload(MultipartFile file){
        return R.SUCCESS(uploadClient.upload(file));
    }

}
