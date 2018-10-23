//package com.itmck.springbootweb.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
///**
// * Create by it_mck 2018/10/23 12:57
// *
// * @Description:
// * @Version: 1.0
// */
//@Configuration
//@EnableWebMvc
//public class MyMvcConfig extends WebMvcConfigurerAdapter {
//
//    /**
//     *
//     * 视图解析
//     * @return
//     */
//    @Bean
//    public ViewResolver getViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//    @Override
//    public void configureDefaultServletHandling(
//            DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    /**
//     *
//     * 过滤静态资源
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("/WEB-INF/static/");
//        super.addResourceHandlers(registry);
//        //registry.addResourceHandler("*.css").addResourceLocations("classpath:/static/css/");
//    }
//
//}
