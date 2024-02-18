package com.springBootDemo.firstSpring.companies.companyService;

import com.springBootDemo.firstSpring.companies.model.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company updateCompanyById(Company reqCompany, Long id);
    Company getCompanyById(Long id);
    boolean deleteCompanyById(Long id);
    boolean createCompany(Company company);
}
