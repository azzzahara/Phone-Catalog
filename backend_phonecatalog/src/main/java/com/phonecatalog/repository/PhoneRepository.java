package com.phonecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonecatalog.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
	
	
}
