package com.example.demospringbootmybatisoracle.processor;

import com.example.demospringbootmybatisoracle.model.UserModel;
import com.example.demospringbootmybatisoracle.service.UserService;
import com.example.demospringbootmybatisoracle.transformer.UserTransformer;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 23, 2021
 */
@Component
public class UserProcessor {
    private final UserService service;
    private final UserTransformer transformer;

    public UserProcessor(UserService service, UserTransformer transformer) {
        this.service = service;
        this.transformer = transformer;
    }

    public List<UserModel> query(String keyword) {
        return service.query(keyword).stream()
                .map(transformer::toModel)
                .collect(Collectors.toList());
    }

    public List<UserModel> list() {
        return service.list().stream()
                .map(transformer::toModel)
                .collect(Collectors.toList());
    }

    public void create(String name) {
        service.create(name);
    }
}
