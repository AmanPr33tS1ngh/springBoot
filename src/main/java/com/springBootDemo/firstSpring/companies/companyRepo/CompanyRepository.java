package com.springBootDemo.firstSpring.companies.companyRepo;

import com.springBootDemo.firstSpring.companies.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {}
