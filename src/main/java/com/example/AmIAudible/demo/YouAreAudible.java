package com.example.AmIAudible.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test/")
@RestController
public class YouAreAudible {
	
	@GetMapping("/yes")
	public static String yes() {
		return "You are Audible";
	}

}
