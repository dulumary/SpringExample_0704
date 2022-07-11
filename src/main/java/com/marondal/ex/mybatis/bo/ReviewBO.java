package com.marondal.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.mybatis.dao.ReviewDAO;
import com.marondal.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// id가 3인 리뷰 가져오기 
	public Review getReview(int id) {
		
		Review review = reviewDAO.selectReview(id);
		
		return review;
		
	}
	
	// storeId, menu, userName, point, review
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		
		return reviewDAO.insertReview(storeId, menu, userName, point, review);
	}
	
	public int addReviewByObject(Review review) {
		return reviewDAO.insertReviewByObject(review);
	}

}
