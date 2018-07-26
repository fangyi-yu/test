package org.great.service;

import java.util.List;
import org.great.domain.Company;


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
