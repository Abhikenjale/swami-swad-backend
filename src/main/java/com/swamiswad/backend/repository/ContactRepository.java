package com.swamiswad.backend.repository;


import com.swamiswad.backend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}

