package com.baizhi.hjj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ems implements Serializable {
    private Integer id;
    private String name;
    private String salary;
    private String age;


}
