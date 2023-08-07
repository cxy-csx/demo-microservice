package com.csx.http.service;

import com.csx.model.R;
import com.dtflys.forest.Forest;

public class HttpService {

    /**
     * get请求
     * @param url
     * @return
     */
    public R get(String url){
        return R.SUCCESS(Forest.get(url).execute());
    }


}
