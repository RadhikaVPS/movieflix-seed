package io.egen.rs.movieflix.rs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.egen.rs.movieflix.rs.entity.User;
import io.egen.rs.movieflix.rs.service.UserService;


@Controller
@RestController
@ResponseBody
@RequestMapping(path = "user")
public class UserController {

	
	@Autowired
	UserService service;
	
	//Add User
	@RequestMapping(method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User signUpUser(@RequestBody User user) {
		return service.signUpUser(user);
	}
	
	//Edit User
	@RequestMapping(method = RequestMethod.PUT, path = "{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public User editMovie(@PathVariable("id") String userEmail, @RequestBody User user) {
		return service.editUser( user);

	}
	
	//Delete User
	@RequestMapping(method = RequestMethod.DELETE, path = "{id}")	
	public void deleteUser(@PathVariable("id") User user) {
		 service.deleteUser(user);

	}
	
	//Find by Email
	@RequestMapping(method = RequestMethod.GET, path = "/email", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User findByType(@PathVariable ("email") String userEmail){
		return service.findByEmail(userEmail);
	}
	
	//User login
	@RequestMapping(method=RequestMethod.POST,path="/login", produces = MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE )
	public User loginUser(@PathVariable ("login")String userName, String password, @RequestBody User user){
		return service.loginUser(userName, password, user);
	}
	
}
