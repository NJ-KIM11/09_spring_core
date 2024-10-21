package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02")
public class ContextConfiguration {

    // 셋 다 가능
//    @Bean(name = "member")
//    @Bean("member")
    @Bean // 이름을 지정 안해주면 자동으로 메소드의 이름이 Bean의 이름으로 설정
    public MemberDTO getMember(){
        return new MemberDTO(1, "user02", "pass02", "홍길동");
    }

}
