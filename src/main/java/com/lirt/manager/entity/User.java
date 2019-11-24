package com.lirt.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -2548168508194958814L;
    private String id;
    private String userName;
    private String nickName;
    private String address;

}
