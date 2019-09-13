package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.projo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
/**
 * 	商品管理Service
 * @author 风雨声
 *
 */
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem findItemById(long itemId) {
//		TbItemExample example=new TbItemExample();
//		example.createCriteria().andIdEqualTo(itemId);
//		List<TbItem> itemList = itemMapper.selectByExample(example);
//		if(itemList.size()!=0) {
//			return itemList.get(0);
//		}
//		return null;
		return itemMapper.selectByPrimaryKey(itemId);
	}

	@Override
	public EUDataGridResult findItemByPageRows(int page, int rows) {
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		
		//获取list
		TbItemExample example = new TbItemExample();
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		result.setRows(list);
		
		//获取total
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
