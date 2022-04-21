package com.example.bs.controller;
import com.example.bs.core.*;
import com.example.bs.entity.UserInfo;
import com.example.bs.service.UserLoginService;
import com.example.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    UserLoginService userLoginService;

    @GetMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("userPhone") String userPhone, @RequestParam("userPassword") String userPassword) {
        Result result = new Result();
        try {
            UserLoginView re = userLoginService.userLogin(userPhone,userPassword);
            result.setData(re);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result userRegister(@RequestBody(required=false) UserInfo userInfo){
        Result result = new Result();
        try {
            userService.addUser(userInfo);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping(value = "/editInfo",method = RequestMethod.POST)
    @ResponseBody
    public Result userEditor(@RequestBody(required=false) UserInfo userInfo){
        Result result = new Result();
        try {
            int a = userService.editUserInfo(userInfo);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/del")
    @ResponseBody
    public Result delUser(@RequestParam("userId") Integer userId){
        Result result = new Result();
        try {
            userService.delUser(userId);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @PostMapping("/editPassword")
    @ResponseBody
    public Result editPassword(@RequestBody UserInfo userInfo){
        Integer userId = userInfo.getUserId();
        String userPassword = userInfo.getUserPassword();
        Result result = new Result();
        try {
            userService.editUserPassword(userId,userPassword);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @PostMapping("/list")
    @ResponseBody
    public Result listAllUsers(@RequestBody(required = false) UserSearch2View userSearch2View){
        Result result = new Result();
        try {
            List<UserBaseInfoView> userBaseInfoViews = userService.listAllUsers(userSearch2View);
            result.setCode(200);
            result.setData(userBaseInfoViews);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/listAllRepairUsers")
    @ResponseBody
    public Result listAllRepairUsers(){
        Result result = new Result();
        try {
            List<UserSearchView> r = userService.listAllRepairUsers();
            result.setCode(200);
            result.setData(r);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/listAllUsersWithRole")
    @ResponseBody
    public Result listAllUsersWithRole(){
        Result result = new Result();
        try {
            List<UserSearchView> r = userService.listAllUsersWithRole();
            result.setCode(200);
            result.setData(r);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/listAllCheckUsers")
    @ResponseBody
    public Result listAllCheckUsers(){
        Result result = new Result();
        try {
            List<UserSearchView> r = userService.listAllCheckUsers();
            result.setCode(200);
            result.setData(r);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }
}
