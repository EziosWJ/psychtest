package com.xw.app.controller;

import com.xw.app.dao.WxListModelMapper;
import com.xw.app.model.WxListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName WxListController
 * @Description TODO
 * @Date 2018/12/30 19:29
 * @Creaded By Wangj
 */
@Controller
@RequestMapping("wxList")
public class WxListController extends WBaseController {

    @Resource
    private WxListModelMapper wxListModelMapper;

    @ResponseBody
    @RequestMapping("insert")
    public Map<String,Object> insert(WxListModel wxListModel){
        int insert = wxListModelMapper.insert(wxListModel);
        Map<String,Object> map = new HashMap<>();
        map.put("complete",insert);
        return map;
    }

    @ResponseBody
    @RequestMapping("deleteByPrimaryKey")
    public Map<String,Object> deleteByPrimaryKey(Integer id){
        int i = wxListModelMapper.deleteByPrimaryKey(id);
        Map<String,Object> map = new HashMap<>();
        map.put("complete",i);
        return map;
    }

    @ResponseBody
    @RequestMapping("updateByPrimaryKey")
    public Map<String,Object> updateByPrimaryKey(WxListModel wxListModel){
        int i = wxListModelMapper.updateByPrimaryKey(wxListModel);
        Map<String,Object> map = new HashMap<>();
        map.put("complete",i);
        return map;
    }

    @ResponseBody
    @RequestMapping("selectListByCustom")
    public Map<String,Object> selectListByCustom(String custom){
        List<?> i = wxListModelMapper.selectListByCustom(custom);
        Map<String,Object> map = new HashMap<>();
        map.put("result",i);
        return map;
    }
}
