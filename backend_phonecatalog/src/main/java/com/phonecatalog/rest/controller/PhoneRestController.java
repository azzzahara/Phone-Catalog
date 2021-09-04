package com.phonecatalog.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonecatalog.model.Phone;
import com.phonecatalog.service.PhoneService;

@RestController
@RequestMapping("/phones")
public class PhoneRestController {
	
	@Autowired
	private PhoneService phoneService;
	
	@GetMapping("/") // Show all dishes
	public ResponseEntity<List<Phone>> findPhones() {
		return ResponseEntity.ok(phoneService.findAll());
	}
	
	@GetMapping("/{id}") // Show a dish
	public ResponseEntity<Phone> findDishById(@PathVariable long id) {

		Optional<Phone> phone = phoneService.findById(id);
		
		if (phone.isPresent()) {
			return ResponseEntity.ok(phone.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}