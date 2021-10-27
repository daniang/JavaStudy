package study.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class MyDataSourceConfig implements WebMvcConfigurer {

    /**
     * 当向容器中添加了Druid数据源
     * 使用@ConfigurationProperties将配置文件中spring.datasource开头的配置与数据源中的属性进行绑定
     * @return
     * @throws SQLException
     */

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException{
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}