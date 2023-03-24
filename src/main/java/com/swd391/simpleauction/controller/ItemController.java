package com.swd391.simpleauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swd391.simpleauction.model.dto.ItemDTO;
import com.swd391.simpleauction.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	ItemService isv;
	
	@GetMapping("/item")
	public ResponseEntity<?> getAll(){
		List<ItemDTO> listdto = isv.getAll();
		return ResponseEntity.ok(listdto);
	}
	
	@PostMapping("/item")
	public ResponseEntity<?> saveNew(ItemDTO dto){
		return ResponseEntity.ok(isv.save(dto));
	}
	
	@GetMapping("/itembyid")
	public ResponseEntity<?> getById(@Param("id") int id){
		return ResponseEntity.ok(isv.getById(id));
	}
}
