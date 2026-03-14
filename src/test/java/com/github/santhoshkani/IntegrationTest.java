package com.github.santhoshkani;

import com.github.santhoshkani.config.AsyncSyncConfiguration;
import com.github.santhoshkani.config.EmbeddedSQL;
import com.github.santhoshkani.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        LmsApp.class,
        JacksonConfiguration.class,
        AsyncSyncConfiguration.class,
        com.github.santhoshkani.config.JacksonHibernateConfiguration.class,
    }
)
@EmbeddedSQL
public @interface IntegrationTest {}
