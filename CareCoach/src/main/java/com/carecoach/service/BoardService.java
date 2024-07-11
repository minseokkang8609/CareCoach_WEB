package com.carecoach.service;

import java.util.List;

import com.carecoach.vo.LikesVO;
import com.carecoach.vo.PostsVO;

public interface BoardService {

    public List<PostsVO> selectPostList(PostsVO postsVO) throws Exception;
    
    public int selectPostCnt(Integer categoryId) throws Exception;
 
	void insertPost(PostsVO postsVO) throws Exception;
	
	void updatePost(PostsVO postsVO) throws Exception;
	
	void deletePost(PostsVO postsVO) throws Exception;
	
	PostsVO selectPostsById(PostsVO postsVO) throws Exception;
	
	void addViewCnt(Integer postsId) throws Exception;
	
	 //좋아요 총 개수 조회
	 void selectLikeCnt(Integer postsId) throws Exception;
	
	    //좋아요 추가
	 void addLike(LikesVO likesVO) throws Exception;
	    
	    //좋아요 삭제
	 void delLike(LikesVO likesVO) throws Exception;
    
}
