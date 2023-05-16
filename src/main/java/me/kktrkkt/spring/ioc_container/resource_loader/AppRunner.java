package me.kktrkkt.spring.ioc_container.resource_loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Resource noneTxt = resourceLoader.getResource("classpath:/resource_loader/none.txt");
        Resource textTxt = resourceLoader.getResource("classpath:/resource_loader/text.txt");

        System.out.println(noneTxt.exists());
        System.out.println(textTxt.exists());

        System.out.println(textTxt.getDescription());
        System.out.println(textTxt.getURI());
        System.out.println(Files.readString(Path.of(textTxt.getURI())));
    }
}
