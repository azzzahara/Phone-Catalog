package com.phonecatalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phonecatalog.model.Phone;
import com.phonecatalog.repository.PhoneRepository;

@Service
public class PhoneService {
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	public Optional<Phone> findById(long id) {
		return phoneRepository.findById(id);
	}
	
	public boolean exist(long id) {
		return phoneRepository.existsById(id);
	}

	public List<Phone> findAll() {
		return phoneRepository.findAll();
	}

	public void save(Phone book) {
		phoneRepository.save(book);
	}
}
