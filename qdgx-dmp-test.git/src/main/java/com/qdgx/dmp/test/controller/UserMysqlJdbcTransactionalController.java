package com.qdgx.dmp.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qdgx.dmp.comm.ResponseData;
import com.qdgx.dmp.test.entity.User;
import com.qdgx.dmp.test.service.IUserService;

@RestController
@RefreshScope
public class UserMysqlJdbcTransactionalController {
	@Autowired
    private IUserService userService;

	@Value("${content}")
	private String content;

    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable Long id) {
        return this.userService.findUserById(id);
    }
    
    @PostMapping("/addUser")
    @ResponseBody
    public int addUser(@RequestBody User reqUser){
    	userService.saveJPA(reqUser);
    	return 0;
    }
    
    @GetMapping("/findUserByAge/{age}")
    @ResponseBody
    public List<User> findUserByAge(@PathVariable Integer age){
    	return userService.findUserByAge(age);
    }
    
    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable Integer id) {
    	System.out.println(" content-------" + content);
        return this.userService.getUserById(id);
    }
    
    @PostMapping("/sysAddType")
    @ResponseBody
    public ResponseData sysAddType(@RequestBody String json){
    	return userService.sysAddType(json);
    }
    
    @PostMapping("/findMenuByRoles")
    @ResponseBody
    public ResponseData findMenuByRoles(){
    	return userService.findMenuByRoles();
    }
    
    @PostMapping("/login")
    @ResponseBody
    public ResponseData login(@RequestBody String json){
    	return userService.login(json);
    }
    
    @GetMapping("/getTypeById/{id}")
    public ResponseData getTypeById(@PathVariable String id){
    	return userService.getTypeById(id);
    }
    
}
