package com.company.project.core.exception;

import com.company.project.core.result.Result;
import com.company.project.core.result.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    public Result handler(Exception e){
        if( e instanceof ServiceException){
            ServiceException studentException = (ServiceException) e;
            return ResultUtil.failure( studentException.getCode(), studentException.getMessage());
        }else {
            log.info("[系统异常] {}",e);
            return ResultUtil.failure();
        }
    }
}
