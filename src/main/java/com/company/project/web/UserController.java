package com.company.project.web;

import com.company.project.core.exception.ServiceException;
import com.company.project.core.result.Result;
import com.company.project.core.result.ResultCode;
import com.company.project.core.result.ResultUtil;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.core.MethodParameter;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by jeikerxiao on 2018/05/07.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/add")
    public Result add(@Valid @RequestBody User user) {
        userService.save(user);
        return ResultUtil.success();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultUtil.success();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultUtil.success();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        User user = userService.findById(id);
        return ResultUtil.success(user);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultUtil.success(pageInfo);
    }

    @GetMapping("/test")
    public Result test() {
        throw new ServiceException(ResultCode.SYSTEM_ERROR);
    }
}
