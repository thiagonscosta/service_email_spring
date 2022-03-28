package com.ms.service_mail.repositories;

import java.util.UUID;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, UUID> {

}
