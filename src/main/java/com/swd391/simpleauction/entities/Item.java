package com.swd391.simpleauction.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "tbl_item")
@NoArgsConstructor
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="item_id", nullable = false, updatable = false)
	private Integer itemId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="starting_price")
	private Float startingPrice;
	
	@Column(name="end_time")
	private Date endTime;
	
	@Column(name="published")
	private Boolean published;	
	
	private Integer userId;
}
