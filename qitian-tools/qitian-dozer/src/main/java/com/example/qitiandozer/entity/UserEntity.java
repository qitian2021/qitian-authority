package com.example.qitiandozer.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Create by  StayHungry
 * @Date 2023/3/13 10:23 上午
 * @Description
 */
@Data
public class UserEntity {
    private String id;
    private String name;
    private int age;
    private String address;
    private Date birthday;
}
