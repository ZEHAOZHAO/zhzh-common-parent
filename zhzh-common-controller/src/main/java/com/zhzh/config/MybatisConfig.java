package com.zhzh.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * ${Author}: jason.zhao
 * 2018/7/28 22:10
 **/
@Configuration
public class MybatisConfig {

//    @Bean
//    public SqlSessionFactoryBean getSqlSessionFactory(DataSource dataSource) {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        PathMatchingResourcePatternResolver path = new PathMatchingResourcePatternResolver();
//        Resource resource = path.getResource("classpath:mapper/**/*.xml");
//        bean.setMapperLocations(new Resource[]{resource});
//        return bean;
//    }
}
