package org.great.controller;

import org.great.domain.Company;
import org.great.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("companys")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @GetMapping("code/{code}")
    public Company findCode(@PathVariable String code) {
        return companyService.findByCode(code);
    }
}
