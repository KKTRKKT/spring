package me.kktrkkt.spring.ioc_container.bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component @Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {
}
