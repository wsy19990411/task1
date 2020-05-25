package com.wsy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: miaosha
 * @description:
 * @author: wsy
 * @create: 2020-03-06 21:10
 **/

@Data
public class User {
    private Integer id;
    private String mobile;
    private String password;

}
