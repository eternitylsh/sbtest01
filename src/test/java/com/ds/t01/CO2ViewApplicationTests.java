package com.ds.t01;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.ds.t01.co2.CO2DB;
import com.ds.t01.co2.CO2ViewRepository;

@ContextConfiguration(classes = Test01Application.class)
@SpringBootTest
class CO2ViewApplicationTests {
	
	@Autowired
	private CO2ViewRepository co2viewRepository;

	@Test
	public void test1() {
		
		List<CO2DB> datas = CO2ViewData();
		
		System.out.println("data count : " + datas.size());
		assertTrue( 0 < datas.size() );
		
	}
	
	
	private List<CO2DB> CO2ViewData() {
		List<CO2DB> all = this.co2viewRepository.findAll();
        return all;
	}
}
