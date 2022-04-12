package com.spring.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
public class LearnSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringBootApplication.class, args);
    }

}
