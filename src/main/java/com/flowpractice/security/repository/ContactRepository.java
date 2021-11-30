package com.flowpractice.security.repository;

import com.flowpractice.security.model.entity.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
