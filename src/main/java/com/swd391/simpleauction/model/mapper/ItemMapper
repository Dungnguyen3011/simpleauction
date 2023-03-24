package com.swd391.simpleauction.model.mapper;

import com.swd391.simpleauction.entities.Item;
import com.swd391.simpleauction.model.dto.ItemDTO;

public class ItemMapper {

	public static ItemDTO toItemDTO(Item item) {
		ItemDTO dto = new ItemDTO();
		dto.setItemId(item.getItemId());
		dto.setItemName(item.getItemName());
		dto.setDescription(item.getDescription());
		dto.setStartingPrice(item.getStartingPrice());
		dto.setEndTime(item.getEndTime());
		dto.setPublished(item.getPublished());
		dto.setUserId(item.getUser().getUserId());
		return dto;
	}
}
