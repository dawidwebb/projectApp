package com.dockerfile.microservice.dockermicroservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DockerController {

	@GetMapping("/")
	public String dockerHello() {
		return "I'm working docker container's micsrservice controller!!!";
	}
}
