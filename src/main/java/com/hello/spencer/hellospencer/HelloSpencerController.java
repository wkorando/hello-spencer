package com.hello.spencer.hellospencer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloSpencerController {

	@GetMapping()
	public String helloMessage(@RequestParam(name="msg", required = false) String msg){
		if(msg == null || msg.isEmpty()) {
			return "Hello World!";
		}
		return "Hello " + msg;
	}

}
