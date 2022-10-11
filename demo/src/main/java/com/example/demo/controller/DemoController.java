package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class DemoController {

	@GetMapping("/test")
	public String test() {
		System.out.println("测试");
		return "finished";
	}
}
