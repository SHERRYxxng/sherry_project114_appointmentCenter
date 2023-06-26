package sherry.project114.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: SHERRY
 * @email: <a href="mailto:SherryTh743779@gmail.com">TianHai</a>
 * @Date: 2023/6/26 18:30
 */
@Configuration
@EnableTransactionManagement
@MapperScan("sherry.project114.hosp.mapper")
public class HospConfig {

}