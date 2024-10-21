package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20, "110-223-2222");
    }

    // 위에 메소드를 Bean으로 지정해 주지 않으면 밑에 MemberDTO bean이 생성될 때 마다 새로운 객체 생성
    // Bean으로 설정해줘야 singletone 으로 관리 가능 (메모리 낭비 방지)

    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = new MemberDTO(30, "홍석천", "010-2222-3333", "hong@gmail.com", accountGenerator());
        return member;
    }
}
