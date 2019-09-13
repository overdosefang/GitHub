package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 	商品参数控制层
 * @author 风雨声
 *
 */
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.service.ItemParamItemService;
@Controller
public class ItemParamItemController {
	@Autowired
	private ItemParamItemService itemParamItemService;
	
	@RequestMapping("/showItem/{itemId}")
	public String getItemParam(@PathVariable Long itemId,Model model) {
		String itemPara = itemParamItemService.getItemParaByItemId(itemId);
		model.addAttribute("itemPara",itemPara);
		System.out.println(itemPara);
		return "item";
		
	}
}
