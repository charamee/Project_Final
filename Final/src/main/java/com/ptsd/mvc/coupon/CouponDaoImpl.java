package com.ptsd.mvc.coupon;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class CouponDaoImpl implements CouponDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<CouponDto> selectList() {
		
		List<CouponDto> list = new ArrayList<CouponDto>();
		
		try {
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insert(CouponDto dto) {
		
		int res = 0 ; 
		
		try {
			res = sqlSession.insert(NAMESPACE+"insert",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(CouponDto dto) {
		
		int res = 0 ; 
		try {
			res = sqlSession.update(NAMESPACE+"update",dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int delete(String couponno) {
		
		int res = 0 ; 
		
		res = sqlSession.delete(NAMESPACE+"delete",couponno);
		return res;
	}

}
