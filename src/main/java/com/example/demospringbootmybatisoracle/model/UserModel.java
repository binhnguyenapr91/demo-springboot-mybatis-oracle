package com.example.demospringbootmybatisoracle.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 23, 2021
 */
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserModel {
    BigDecimal id;
    String name;
}
