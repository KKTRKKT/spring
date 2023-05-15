package me.kktrkkt.spring.ioc_container.message_source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageSource.getMessage("greeting", new String[]{"kktrkkt"}, Locale.KOREA));
        System.out.println(messageSource.getMessage("greeting", new String[]{"kktrkkt"}, Locale.getDefault()));

        while (true){
            System.out.println(messageSource.getMessage("greeting", new String[]{"kktrkkt"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"kktrkkt"}, Locale.getDefault()));
            Thread.sleep(1000L);
        }
    }
}
