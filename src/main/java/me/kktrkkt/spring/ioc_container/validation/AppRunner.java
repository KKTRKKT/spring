package me.kktrkkt.spring.ioc_container.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.Objects;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Post post = new Post();
        Errors errors = new BeanPropertyBindingResult(post, "post");
        validator.validate(post, errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            Arrays.stream(Objects.requireNonNull(e.getCodes())).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });

    }
}
