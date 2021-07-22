package com.example.demospringbootmybatisoracle.transformer;

import com.example.demospringbootmybatisoracle.entity.User;
import com.example.demospringbootmybatisoracle.model.UserModel;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 23, 2021
 */
@Component
public class UserTransformer {
    public UserModel toModel(User entity) {
        if(Objects.isNull(entity)) {
            return null;
        }

        UserModel model = new UserModel();
        model.setId(entity.getId());
        model.setName(entity.getName());

        return model;
    }
}
