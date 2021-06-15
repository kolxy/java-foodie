package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;

import java.util.List;

public interface CategoryMapperCustom extends MyMapper<Category> {
    public List<CategoryVO> getSubCatList(Integer rootCatid);
}