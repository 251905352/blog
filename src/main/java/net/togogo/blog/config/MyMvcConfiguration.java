package net.togogo.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfiguration  implements WebMvcConfigurer {

    /**
     * 设置欢迎叶
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        设置前台首页路径
        registry.addViewController("/").setViewName("index"); // 根目录
        registry.addViewController("/index").setViewName("index"); // index目录
        registry.addViewController("/index.html").setViewName("index"); // index目录
    }
}
