package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {
}

