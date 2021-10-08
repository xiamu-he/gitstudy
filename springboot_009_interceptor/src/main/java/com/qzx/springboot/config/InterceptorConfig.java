package com.qzx.springboot.config;

import com.qzx.springboot.interceptor.Myinterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author qzx
 * @create 2021-10-07 15:02
 * @function
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPathPatterns={
                "/user/**"
        };
        String[] excludePathPatterns={
                "/user/out",
                "/user/error",
                "/user/login"
        };
        registry.addInterceptor(new Myinterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
