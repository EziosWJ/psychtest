package com.xw.app.dao;

import com.xw.app.model.BookModel;

public interface BookModelMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookModel record);

    int insertSelective(BookModel record);

    BookModel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookModel record);

    int updateByPrimaryKey(BookModel record);
}