package com.npci.sample_test_project.controllr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPracx {
	
	@GetMapping("/ash")
	public String pracxTest() {
		return "Ashwin";
	}

}
