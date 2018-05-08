package com.company.project.core.exception;

import com.company.project.core.result.Result;
import com.company.project.core.result.ResultCode;
import com.company.project.core.result.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.List;

@RestControllerAdvice
@Slf4j
public class ExceptionHandle {

    /**
     * 参数错误：返回第一个参数错误的提示
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result handleIllegalParamException(MethodArgumentNotValidException e) {
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String tips = "参数不合法";
        if (errors.size() > 0) {
            tips = errors.get(0).getDefaultMessage();
        }
        Result result = ResultUtil.failure(ResultCode.PARAMETER_ERROR);
        result.setMessage(tips);
        return result;
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result handleMethodNotSupported(HttpRequestMethodNotSupportedException e) {
        return ResultUtil.failure(ResultCode.METHOD_NOT_SUPPORTED);
    }

    @ExceptionHandler(value = Exception.class)
    public Result handler(Exception e) {
        if (e instanceof ServiceException) {
            ServiceException studentException = (ServiceException) e;
            return ResultUtil.failure(studentException.getCode(), studentException.getMessage());
        } else if (e instanceof NoHandlerFoundException) {
            return ResultUtil.failure(ResultCode.NOT_FOUND);
        } else {
            log.info("[系统异常] {}", e);
            return ResultUtil.failure();
        }
    }
}
