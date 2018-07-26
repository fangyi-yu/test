package org.great.service.impl;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.great.domain.Company;
import org.great.domain.CompanyRepository;
import org.great.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class CompanyServiceImpl  implements CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public Company insert(Company company) {
        if (StringUtils.isNotBlank(company.getId())) {
            throw new IllegalArgumentException("id 要为空");
        }
        company.setCreateTime(new Timestamp(System.currentTimeMillis()));
        return companyRepository.save(company);
    }

    @Override
    public List<Company> findAll() {
        return Lists.newArrayList(companyRepository.findAll());
    }

    @Override
    public Company findByCode(String code) {
        return companyRepository.findByCode(code);
    }
}
