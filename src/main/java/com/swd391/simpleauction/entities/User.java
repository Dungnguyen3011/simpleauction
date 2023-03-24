package com.swd391.simpleauction.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tbl_user")
@Entity
@Data
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id", nullable = false, updatable = false)
	private Integer userId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phone_number")
	private Integer phoneNumber;
	
	@Column(name="address")
	private String address;
	
	@Column(name="role")
	private Boolean role;	
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<Transaction> transaction ;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<Item> item ;
}
