package com.carecoach.service;

import com.carecoach.vo.UsersVO;

public interface MemberService {

    UsersVO loginCheck(String user_id);

    UsersVO userCheck(String email);

    UsersVO findId(String email);

    void changepw(UsersVO m);

    void del_mem(String id);

    void updatebio(UsersVO bio);

    boolean isUserIdAvailable(String user_id);

    void registerUser(UsersVO user) throws Exception;


    void updateProfilePicPath(UsersVO fileName);

}
