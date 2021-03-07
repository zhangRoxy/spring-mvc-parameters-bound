package com.zrs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address implements Serializable {
    private static final long serialVersionUID = -1381619276962105303L;

    private String provinceName;
    private String cityName;

}
