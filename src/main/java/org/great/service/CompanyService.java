package org.great.service;

import org.great.domain.Company;

import java.util.List;

public interface CompanyService {

    List<Company> findAll();

    Company findByCode(String code);
}
