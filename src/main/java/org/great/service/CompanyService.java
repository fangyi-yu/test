package org.great.service;

import org.great.domain.Company;

import java.util.List;

public interface CompanyService {

    Company insert(Company company);

    List<Company> findAll();

    Company findByCode(String code);


}
