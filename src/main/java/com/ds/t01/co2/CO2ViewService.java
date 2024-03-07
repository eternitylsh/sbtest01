package com.ds.t01.co2;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CO2ViewService {
	
	private final CO2ViewRepository co2viewRepository;
	
	public List<CO2DB> getList() {
		// TODO Auto-generated method stub
		return this.co2viewRepository.findAll();
	}

}
