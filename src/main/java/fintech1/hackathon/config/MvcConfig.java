package fintech1.hackathon.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/signup").setViewName("signup");
        registry.addViewController("/setting").setViewName("setting");
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/fin_rec").setViewName("fin_rec");
        registry.addViewController("/product_rec").setViewName("product_rec");
        registry.addViewController("/helper").setViewName("helper");
        registry.addViewController("/analysis_report").setViewName("analysis_report");
        registry.addViewController("/community").setViewName("community");




    }

}