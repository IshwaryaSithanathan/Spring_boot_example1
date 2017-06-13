package com.userpage.client;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.userpage.entity.User;

public class RestClientUtil {
    public void getUserByIdDemo() {
    	HttpHeaders headers = new HttpHeaders();
    	headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/user/user/{id}";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<User> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, User.class, 1);
        User User = responseEntity.getBody();
        System.out.println("Id:"+User.getUserId()+", Name:"+User.getName()
                 +", Address:"+User.getAddress()+", Dob:"+User.getDob());      
    }
	public void getAllUsersDemo() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/user/users";
        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
        ResponseEntity<User[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, User[].class);
        User[] Users = responseEntity.getBody();
        for(User User : Users) {
        	System.out.println("Id:"+User.getUserId()+", Name:"+User.getName()
            +", Address:"+User.getAddress()+", Dob:"+User.getDob());
        }
    }
    public static void main(String args[]) {
    	RestClientUtil util = new RestClientUtil();
        //util.getUserByIdDemo();
    	util.getAllUsersDemo();
    	//util.addUserDemo();
    	//util.updateUserDemo();
    	//util.deleteUserDemo();
    }    
}
