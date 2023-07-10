package com.marondal.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.mybatis.domain.Review;
import com.marondal.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// id가 3인 리뷰 데이터 얻기 
	public Review getReview(int id) {
		
		Review review = reviewRepository.selectReview(id);
		
		return review;		
	}
	
	// storeId, menu, userName, point, review 전달받고 저장하는 기능
	public int addReview(
			int storeId
			, String menu
			, String userName
			, double point
			, String review) {
		
		int count = reviewRepository.insertReview(storeId, menu, userName, point, review);
		
		return count;
		
	}
	
	// 객체로 전달된 데이터 저장
	public int addReviewByObject(Review review) {
		int count = reviewRepository.insertReviewByObject(review);
		return count;
	}
	
	
}
