package com.gt.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 创建时间：2018年/11月/13日
 *
 * @author 张政[zhang_zheng@sinosoft.com.cn]
 * 类名：EspJenkinsAutoConfiguration
 * 描述：jenkins 交互处理模块自动配置
 */
@Slf4j
@Configuration
@ComponentScan("com.gt.esp.jenkins")
public class EspJenkinsAutoConfiguration {
}
