package com.taotao.service;

import com.taotao.common.projo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	/**通过id查询商品*/
	TbItem findItemById (long itemId);
	
	/**根据分页信息查询商品*/
	EUDataGridResult findItemByPageRows(int page,int rows);
}
