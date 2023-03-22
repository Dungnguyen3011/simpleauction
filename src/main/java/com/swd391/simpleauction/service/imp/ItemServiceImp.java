package com.swd391.simpleauction.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.swd391.simpleauction.entities.Item;
import com.swd391.simpleauction.model.dto.ItemDTO;
import com.swd391.simpleauction.model.mapper.ItemMapper;
import com.swd391.simpleauction.repositories.ItemRepository;
import com.swd391.simpleauction.service.ItemService;

public class ItemServiceImp implements ItemService{

	@Autowired
	ItemRepository itrp;
	
	@Override
	public List<ItemDTO> getAll() {
		List<Item> result = itrp.findAll();
		List<ItemDTO> listdto = new ArrayList<>();
		result.forEach(v-> listdto.add(ItemMapper.toItemDTO(v)));
		return listdto;
	}

	@Override
	public ItemDTO save(ItemDTO itemdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemDTO getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
