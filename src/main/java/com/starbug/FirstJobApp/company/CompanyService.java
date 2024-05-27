package com.starbug.FirstJobApp.company;

import com.starbug.FirstJobApp.job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> getAllComapnies();
    boolean updateCompany(Long id, Company updatedCompany);
    void createCompany(Company company);
    Company getCompanyById(Long id);
    boolean deleteCompany(Long id);
}
