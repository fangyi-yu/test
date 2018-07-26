package org.great.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "company")
public class Company {

    @Id
    private String id;

    @Field(value = "companyCode")
    private String code;

    @Field(value = "companyName")
    private String name;

    private Timestamp createTime;
}
