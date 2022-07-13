package spring.tendinous.school.service;

import org.springframework.beans.factory.annotation.Autowired;

import spring.tendinous.school.dto.User;

public interface UserService {

	
	
	User getUserinfo(String userid);
}
