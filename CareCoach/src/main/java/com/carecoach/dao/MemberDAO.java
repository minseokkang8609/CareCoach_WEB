package com.carecoach.dao;

import com.carecoach.vo.UsersVO;

public interface MemberDAO {

	UsersVO loginCheck(String user_id);
	UsersVO usersCheck(String email);
	UsersVO findId(String email);
	void changepw(UsersVO m);
	void del_mem(String id);
	
	

}
