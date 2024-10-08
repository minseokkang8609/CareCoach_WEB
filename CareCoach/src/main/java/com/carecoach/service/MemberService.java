package com.carecoach.service;

import com.carecoach.vo.UsersVO;
import java.security.NoSuchAlgorithmException;

public interface MemberService {

    UsersVO loginCheck(String userId);

    UsersVO userCheck(String email);

    UsersVO findId(String email);

    void changepw(UsersVO m);

    void del_mem(String id);

    void updatebio(UsersVO bio);

    boolean isUserIdAvailable(String userId);

    void registerUser(UsersVO user) throws Exception;

    void updateProfilePicPath(UsersVO fileName);

    String hashPassword(String password) throws NoSuchAlgorithmException;
    
    boolean verifyPassword(String password, String storedHash) throws NoSuchAlgorithmException;
	

	

}