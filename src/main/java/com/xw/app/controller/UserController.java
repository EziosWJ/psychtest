package com.xw.app.controller;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xw.app.model.UserModel;
import com.xw.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        logger.debug("param => id = " + userId ,userId);
        UserModel user = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }

    @RequestMapping(value = "/putUser",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> putUser(UserModel userModel){
        int putUser = userService.putUser(userModel);
        Map<String,Object> map = new HashMap<>();
        if(putUser == 1){
            map.put("msg","success!");
        }else {
            map.put("msg","error!");
        }
        return map;
    }

    @ResponseBody
//    @RequestMapping(value = "/findUserById",produces = "application/json;charset=UTF-8")
    @RequestMapping(value = "/findUserById")
    public List<?> findUserById(Integer id){

        List<UserModel> list = new ArrayList<>();
        list.add(userService.findUserById(id));
        return list;
    }
}
