package spring.tendinous.school.repository;

import spring.tendinous.school.dto.User;

public interface UserRepository {

	// 사용자 정보 얻어오기
	User getUserinfo(String userid);
}
