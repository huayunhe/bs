package com.example.bs.controller;

import com.example.bs.entity.UserRole;
import com.example.bs.service.UserRoleInfoRelationService;
import com.example.bs.service.UserRoleService;
import com.example.bs.core.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/role")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @Autowired
    UserRoleInfoRelationService userRoleInfoRelationService;

    @RequestMapping("/addRoleToUser")
    @ResponseBody
    public Result addRoleToUser(@RequestParam("userId") Integer userId,
                            @RequestParam("roleId") Integer roleId){
        Result result = new Result();
        try {
            int r = userRoleInfoRelationService.addUserToRole(userId,roleId);
            result.setData(r);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/delRoleToUser")
    @ResponseBody
    public Result delRoleToUser(@RequestParam("userId") Integer userId,
                                @RequestParam("roleId") Integer roleId){
        Result result = new Result();
        try {
            int r = userRoleInfoRelationService.deleteUserToRole(userId,roleId);
            result.setData(r);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/list")
    @ResponseBody
    public Result listRoles(){
        Result result = new Result();
        try {
            List<UserRole> userRoles = userRoleService.listAllRoles();
            result.setData(userRoles);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @PostMapping("/addNewRole")
    @ResponseBody
    public Result addNewJob(@RequestBody UserRole userRole){
        Result result = new Result();
        try {
            userRoleService.addNewRole(userRole);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @RequestMapping("/delRole")
    @ResponseBody
    public Result delJob(@RequestParam("roleId") Integer id){
        Result result = new Result();
        try {
            userRoleService.delRole(id);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }

    @PostMapping("/editRole")
    @ResponseBody
    public Result editJob(@RequestBody UserRole userRole){
        Result result = new Result();
        try {
            userRoleService.editRole(userRole);
            result.setCode(200);
            return result;
        } catch (Exception e){
            result.setMsg(e.getMessage());
            result.setCode(400);
            return result;
        }
    }
}
