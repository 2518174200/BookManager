package com.book.dao.category;

import java.util.List;

import com.book.pojo.BookCategory;

public interface CategoryMapper {
	List<BookCategory> getCategoryList();
	int saveCategory(BookCategory category);
}
