package com.boot.mybatisplus.result;

import lombok.Data;

/**
 * @PackageName: com.boot.mybatisplus.result
 * @ClassName: MyResult
 * @Description: This is MyResult class by Skwen.
 * @Author: Skwen
 * @Date: 2021-04-04 17:21
 */
@Data
public class MyResult {
    private Integer code;

    private String msg;

    private long timestamp = System.currentTimeMillis() / 1000;

    private Object data;


    public MyResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;

    }

    public MyResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
