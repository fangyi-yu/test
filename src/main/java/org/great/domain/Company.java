package org.great.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
//    private Timestamp createTime;
}
