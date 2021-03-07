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
public class Account implements Serializable {

    private static final long serialVersionUID = 8405232260975148534L;

    private Integer id;
    private String name;
    private Float money;
    private Address address;
}
