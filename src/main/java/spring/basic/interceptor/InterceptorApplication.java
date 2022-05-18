package spring.basic.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("spring.basic")
@Slf4j
public class InterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorApplication.class, args);
    }

}
