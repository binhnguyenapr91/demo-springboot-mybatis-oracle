package com.example.demospringbootmybatisoracle.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 23, 2021
 */

@Getter @Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateModel {
    String name;
}
