package com.example.bs.controller;
import com.example.bs.core.Result;
import com.example.bs.entity.UserInfo;
import com.example.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
        Result result = new Result();
        UserInfo exsitUser = userService.selectUserByName(userName);
        if (exsitUser == null) {
            result.setMsg("该用户未注册");
            result.setCode(400);
            return result;
        }
        if (!exsitUser.getUserPassword().equals(userPassword)) {
            result.setMsg("密码错误,请重新输入");
            result.setCode(400);
            return result;
        }
        result.setCode(200);
        result.setMsg("登录成功");
        return result;
    }
}
