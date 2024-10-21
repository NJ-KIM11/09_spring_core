package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    // pokemon을 상속받는 동일한 클래스 중 제일 우선순위
public class Charmander implements Pokemon{

    @Override
    public void attack() {
        System.out.println("파이리 불꽃");
    }
}
