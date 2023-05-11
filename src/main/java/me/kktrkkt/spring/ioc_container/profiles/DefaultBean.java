package me.kktrkkt.spring.ioc_container.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultBean {
}
