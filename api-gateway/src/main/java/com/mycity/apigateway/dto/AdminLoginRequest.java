package com.mycity.apigateway.dto;

import lombok.Data;

@Data
public class AdminLoginRequest {
	   
	
	    private String username;

	 
	    private String email;

	   
	    public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		private String password;

	
	
}
