package com.ds.t01.co2;

import java.util.Date;

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
public class CO2DB {
	
	@Column
	private Date mmdate;
	
	@Column
	private Integer CO2;
	
	@Column(name="ss1_h")
	private Integer SS1H;
	
	@Column(name="ss1_t")
	private Integer SS1T;
	
	@Column(name="ss2_h")
	private Integer SS2H;
	
	@Column(name="ss2_t")
	private Integer SS2T;
	
	@Id
	@Column(name="")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
