package org.great.domain;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {

    Company findByCode(String code);
}
