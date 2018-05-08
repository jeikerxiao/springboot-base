package com.company.project.core.exception;

import com.company.project.core.result.ResultCode;

public class ServiceException extends RuntimeException {

    private Integer code;

    public ServiceException(ResultCode resultCode){
        super(resultCode.getMessage());
        this.code = resultCode.getCode();
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
