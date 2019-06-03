package com.jt.employee_mis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Auther: Jiangtian
 * @Date: 2019/6/3 13:23
 * @Description:
 */
@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = LocalDB.PACKAGE, sqlSessionFactoryRef = "locationSqlSessionFactory")
public class LocalDB {

    // 精确到 location 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.jt.employee_mis.Dao";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";

    @Value("${location.datasource.url}")
    private String url;

    @Value("${location.datasource.username}")
    private String user;

    @Value("${location.datasource.password}")
    private String password;

    @Value("${location.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "locationDataSource")
    @Primary
    public DataSource locationDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "locationTransactionManager")
    @Primary
    public DataSourceTransactionManager locationTransactionManager() {
        return new DataSourceTransactionManager(locationDataSource());
    }

    @Bean(name = "locationSqlSessionFactory")
    @Primary
    public SqlSessionFactory locationSqlSessionFactory(@Qualifier("locationDataSource") DataSource locationDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(locationDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(LocalDB.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
