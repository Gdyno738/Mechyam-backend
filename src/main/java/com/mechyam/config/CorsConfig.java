package com.mechyam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOriginPatterns(
                        		" https://mechyam-frontend-mgdpfols3-gdyno738s-projects.vercel.app",
                        		"https://mechyam-frontend-beige.vercel.app/",
                                "http://localhost:5173/",
                                "https://*.vercel.app",
                                "https://mechyam-frontend-2ikueeyfc-likithroshans-projects.vercel.app",
                                "https://mechyam-frontend-oqdzi4bpg-likithroshans-projects.vercel.app"
                        )
                       
                        .allowedMethods("*")
                        .allowedHeaders("*")
                        .exposedHeaders("Authorization")
                        .allowCredentials(true);
            }
        };
    }
}
