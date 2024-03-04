package com.ds.t01.user;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User_info2 {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long idnum;
	
	@Column(unique = true, length = 30)
	private String id;
	
	@Column(length = 50)
	private String pwd;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 30)
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date birth;
	
	@Column(length = 30)
	private String sns;
	
	@Temporal(TemporalType.DATE)
	private Date reg_date;
}
