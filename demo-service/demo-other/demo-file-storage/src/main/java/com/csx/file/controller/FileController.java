package com.csx.file.controller;

import cn.xuyanwu.spring.file.storage.FileInfo;
import cn.xuyanwu.spring.file.storage.FileStorageService;
import com.csx.api.file.storage.UploadClient;
import com.csx.model.R;
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
@Api(tags = "文件上传服务")
public class FileController implements UploadClient {

    @Autowired
    private FileStorageService fileStorageService;

    @Override
    public R upload(MultipartFile file) {
        return R.SUCCESS(fileStorageService.of(file).upload());
    }

}
