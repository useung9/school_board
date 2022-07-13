package spring.tendinous.school.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.tendinous.school.dto.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private SqlSession session;
	String path = "spring.tendinous.school.UserMapper.";
	
	// 사용자 정보 가져오기
	@Override
	public User getUserinfo(String userid) {
		// TODO Auto-generated method stub
		return session.selectOne(path+"getUserinfo", userid);
	}

}
