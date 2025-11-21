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
                registry.addMapping("/**")  // ✅ ALL endpoints include karo
                        .allowedOrigins(
                            //"http://localhost:5173",  // Vite dev server
                          //  "http://localhost:3000",  // Alternative port
                            //"https://your-frontend.vercel.app"  // Production
                           "https://mechyam-frontend-2ikueeyfc-likithroshans-projects.vercel.app"
                        )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH")
                        .allowedHeaders("*")
                        .exposedHeaders("Authorization")
                        .allowCredentials(true)
                        .maxAge(3600);  // ✅ Preflight cache time
            }
        };
    }
}