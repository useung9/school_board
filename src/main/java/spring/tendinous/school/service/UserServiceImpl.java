package spring.tendinous.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.tendinous.school.dto.User;
import spring.tendinous.school.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepo;
	
	// 유저 정보 읽어오기
	@Override
	public User getUserinfo(String userid) {
		// TODO Auto-generated method stub
		return userrepo.getUserinfo(userid);
	}

}
