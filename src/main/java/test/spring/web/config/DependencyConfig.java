package test.spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test.spring.web.service.ForecastService;

@Configuration
public class DependencyConfig {
    @Bean
    public ForecastService forecastService() {
        return new ForecastService();
    }
}
