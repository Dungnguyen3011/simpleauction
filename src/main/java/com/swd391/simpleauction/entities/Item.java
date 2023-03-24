package com.swd391.simpleauction.entities;

import java.sql.Timestamp;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	private Timestamp endTime;
	
	@Column(name="published")
	private Boolean published;	
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;
	
	@OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<Transaction> transaction ;
}
