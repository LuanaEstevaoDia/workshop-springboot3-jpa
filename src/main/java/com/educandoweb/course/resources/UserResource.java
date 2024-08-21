package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")

public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria", "maria@.com", "999999999","12345");
		return ResponseEntity.ok().body(u);
		
	}
	
	

}
