package com.invoicely.invoice.controller;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoicely.invoice.model.User;
import com.invoicely.invoice.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserControler {
	
	@Autowired
	private UserRepository userRepository;
	
	// create user
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody User user) throws JSONException {
		User exist= this.userRepository.findByEmail(user.getEmail());
		if (exist != null) {
            return new ResponseEntity<>(returnJsonString(false, "Email already exist please try with new mail","null"),
                    HttpStatus.FORBIDDEN);
        } else {
            this.userRepository.save(user);
            return new ResponseEntity<>(returnJsonString(true, "user created successfully ","null"),
                    HttpStatus.CREATED);
        }
	}
	
	// login 
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) throws JSONException {
		User res_data = this.userRepository.findByEmail(user.getEmail());
		JSONObject jsonObject = new JSONObject();
		  if(res_data==null) {
			  return new ResponseEntity<>(returnJsonString(false, "Login Failed","null"),
	                  HttpStatus.FORBIDDEN); 
			  }
		  else {
			  if(res_data.getPassword().equals(user.getPassword())){
				  jsonObject.put("email", user.getEmail());
			  return new ResponseEntity<>(returnJsonString(true, "Login Success",jsonObject.toString()),
	                  HttpStatus.OK);
			  }
		  }
		  return new ResponseEntity<>(returnJsonString(false, "Login Failed","null"),
            HttpStatus.FORBIDDEN); 
	}	
	
	// sample get all users
	@GetMapping("/all")
	public List<User> getAllUSers(){
		return this.userRepository.findAll();
	}

	public String returnJsonString(boolean status, String response,String cred) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("status", status);
        jsonObject.put("message", response);
        jsonObject.put("data", cred);
        return jsonObject.toString();
    }
}
