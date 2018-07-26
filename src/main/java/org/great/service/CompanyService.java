package org.great.service;

import org.great.domain.Company;

import java.util.List;

public interface CompanyService {

    /**
     *  插入一条公司信息
     * @param company 公司信息
     * @return
     */
    Company insert(Company company);

    List<Company> findAll();

    Company findByCode(String code);

    Company update(Company company);


}
