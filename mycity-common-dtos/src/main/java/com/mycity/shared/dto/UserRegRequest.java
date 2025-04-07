package com.mycity.shared.dto;

import lombok.Data;

@Data
public class UserRegRequest {
 
	
	private String firstname;
	
	
	private String lastname;
	
	
	private String email;

    
    private String password;
    
    private long phoneNumber;
    
}