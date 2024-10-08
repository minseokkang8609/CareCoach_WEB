package com.carecoach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carecoach.dao.CommentDAO;
import com.carecoach.vo.CommentsVO;

@Service("commentServiceImpl")
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDAO commentDAO;

    @Override
    public List<CommentsVO> commentList(Integer postId) throws Exception {
        List<CommentsVO> commentList;
        commentList = commentDAO.commentList(postId);
        return commentList;
    }

    @Override
    public void commentInsert(CommentsVO commentsVO) throws Exception {
        commentDAO.commentInsert(commentsVO);
    }

    @Override
    public void commentUpdate(CommentsVO commentsVO) throws Exception {
        commentDAO.commentUpdate(commentsVO);
    }

    @Override
    public void commentDelete(Integer postId) throws Exception {
        commentDAO.commentDelete(postId);
    }


}