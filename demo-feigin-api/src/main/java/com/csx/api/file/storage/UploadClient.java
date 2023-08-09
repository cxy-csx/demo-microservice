package com.csx.api.file.storage;

import com.csx.model.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "demo-file-storage")
public interface UploadClient {

    /**
     * 对外提供接口
     * @param file
     * @return
     */
    @PostMapping("/api/v1/upload")
    R upload(MultipartFile file) ;

}
