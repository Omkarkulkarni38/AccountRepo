package com.hcl.AccoutManagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	//getAccount list for userId
	@GetMapping("/getAccountList")
	public void getAccountList(@PathVariable String userId ) {
		
		
	}
	//getAccount Balance for login User
	@GetMapping("/getAccountBalance")
	public void getAccountBalance(@PathVariable  String userId, String AccountId) {
		
	}
}
