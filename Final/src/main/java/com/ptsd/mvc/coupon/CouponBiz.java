package com.ptsd.mvc.coupon;

import java.util.List;

public interface CouponBiz {
	
public List<CouponDto> selectList(); 
	
	public int insert(CouponDto dto);
	public int update(CouponDto dto);
	public int delete(String couponno);


}
