package com.ds.t01.temp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Temp01 {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	
	@Column(length = 200)
	private String val;
}
