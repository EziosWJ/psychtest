package com.xw.app.dao;

import com.xw.app.model.WxListModel;

import java.util.List;

public interface WxListModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxListModel record);

    int insertSelective(WxListModel record);

    WxListModel selectByPrimaryKey(Integer id);
    
    List<?> selectListByCustom(String custome);

    int updateByPrimaryKeySelective(WxListModel record);

    int updateByPrimaryKey(WxListModel record);
}