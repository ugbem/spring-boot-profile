package com.eugbem.eugbem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.eugbem.eugbem.model.ClientModel;
import com.eugbem.eugbem.service.ClientModelService;

@Controller
public class ApplicationController {
	
	@Autowired
	private ClientModelService service;
	
	@GetMapping("/home")
	public String goHome(Model model) {
		String message = "Thank you, Your message has been received!";
		model.addAttribute("msg", message);
		return "index";
	}
	
	@PostMapping("/sendMessage")
	public String getClientPost(ClientModel client) {
		service.addPost(client);
		return "redirect:/home";
	}
	
	@GetMapping("/getMessages")
	private ResponseEntity<List<ClientModel>>findAll(){
		return new ResponseEntity<List<ClientModel>>(service.findAll(), HttpStatus.OK);
	}
}
