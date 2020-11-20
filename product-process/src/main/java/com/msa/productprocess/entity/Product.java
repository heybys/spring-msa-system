package com.msa.productprocess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name", length = 200, nullable = false, unique = true)
	private String name;

	@Column(name = "category", length = 50, nullable = true)
	private String category;

	@Column(name = "price", nullable = true)
	private Integer price;

}
