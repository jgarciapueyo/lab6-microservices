package apigateway;

import apigateway.filters.SimpleFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class Server {

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }

    @Bean
    public SimpleFilter simpleFilter() {
         return new SimpleFilter();
    }
}
