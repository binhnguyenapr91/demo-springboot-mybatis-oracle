package com.example.demospringbootmybatisoracle.controller;

import com.example.demospringbootmybatisoracle.model.UserModel;
import com.example.demospringbootmybatisoracle.processor.UserProcessor;
import com.example.demospringbootmybatisoracle.model.UserCreateModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: ntbinh10@cmc.com.vn
 * Jul 22, 2021
 */
@RestController
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping("/api/v1/users")
public class UserApi {

    UserProcessor processor;

    @GetMapping("")
    public List<UserModel> list() {
        return processor.list();
    }

    @PostMapping("")
    public void create(@RequestBody UserCreateModel model) {
        processor.create(model.getName());
    }

    @GetMapping ("/{keyword}")
    public List<UserModel> query(@PathVariable String keyword) {
        return processor.query("%" + keyword + "%");
    }
}
