package com.arilsondev;

import io.awspring.cloud.autoconfigure.cache.ElastiCacheAutoConfiguration;
import io.awspring.cloud.autoconfigure.context.*;
import io.awspring.cloud.autoconfigure.jdbc.AmazonRdsDatabaseAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.messaging.MessagingAutoConfiguration;

@EnableAutoConfiguration(exclude = {
        AmazonRdsDatabaseAutoConfiguration.class,
        MessagingAutoConfiguration.class,
        ElastiCacheAutoConfiguration.class,
        ContextCredentialsAutoConfiguration.class,
        ContextInstanceDataAutoConfiguration.class,
        ContextRegionProviderAutoConfiguration.class,
        ContextResourceLoaderAutoConfiguration.class,
        ContextStackAutoConfiguration.class,
        MailSenderAutoConfiguration.class,
})
@SpringBootApplication
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}
