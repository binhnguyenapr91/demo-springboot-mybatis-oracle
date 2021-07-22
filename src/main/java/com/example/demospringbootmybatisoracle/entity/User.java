package com.example.demospringbootmybatisoracle.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 22, 2021
 */
@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class User {
    BigDecimal id;
    String name;
}
