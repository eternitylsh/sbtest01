package com.ds.t01.co2;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:8090")
public class CO2VIewController {
	
	private final CO2ViewService co2viewService;
	
	@GetMapping("co2view/list")
	public List<CO2DB> list() {
		return this.co2viewService.getList();
	}
}
