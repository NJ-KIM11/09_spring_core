package com.ohgiraffers.section03.annotationconfig.subsection01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection03")
@ComponentScan(basePackages = "com.ohgiraffers.common") //경로 하위에 설정된 Bean은 모두 가져올 수 있다..
public class ContextConfiguration {
}
