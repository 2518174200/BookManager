package com.book.dao.order;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.book.pojo.BookOrders;

/**
 * 操作订单表的接口
 * @author lindy
 * @创建时间 2020年4月10日下午4:48:27
 */
public interface BookOrdersMapper {
	
	int saveOrder(BookOrders order);
	
	List<BookOrders> getOrderList(@Param("uid") String uid);

	int updateOrders(@Param("oid")String oid,@Param("count") int count,@Param("curPrice") double curPrice);
}
