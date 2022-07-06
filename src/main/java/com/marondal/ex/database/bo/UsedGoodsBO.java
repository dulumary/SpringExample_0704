package com.marondal.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.database.dao.UsedGoodsDAO;
import com.marondal.ex.database.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	// used goods 데이터 모두 가져오는 메소드 
	public List<UsedGoods> getUsedGoodsList() {
		List<UsedGoods> list = usedGoodsDAO.selectUsedGoodsList();
		// 데이터 조작 
		// 조작 조작 조작
		
		return list;
	}
	

}
