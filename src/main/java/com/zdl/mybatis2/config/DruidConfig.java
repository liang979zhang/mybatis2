package com.zdl.mybatis2.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {
    //绑定数据源
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    public DataSource druids() {
//        return new DruidDataSource();
//    }

    /*
     *
     * 配置 Druid 的监控
     * 1.配置一个管理后台的servlet
     * */

    @Bean
    public ServletRegistrationBean stateViewServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        Map<String, String> map = new HashMap<>();
        map.put("loginUsername", "admin");  //登陆用户名
        map.put("loginPassword", "123456");  //登陆用户密码
        map.put("allow", "");  //不写就是默认所有用户可以访问
        map.put("deny", "");  //拒绝某个地址访问
        bean.setInitParameters(map);
        return bean;
    }



    //配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatewServlet() {

        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String, String> map = new HashMap<>();
        map.put("exclusions", "*.js,*.html,*.css,/druid/*");//添加类型不拦截
        bean.setInitParameters(map);

//        bean.setUrlPatterns(Arrays.asList("/*"));//拦截所以请求


        return bean;
    }
}
