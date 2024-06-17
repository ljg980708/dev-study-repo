package com.lune.spring_bean;

import com.lune.spring_bean.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanController {
    public static void main(String[] args) {
        // Spring 컨테이너 생성 및 설정 파일 로드
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Bean 가져오기
        MyBean myBean = context.getBean(MyBean.class);

        // Bean 사용
        myBean.doSomething();
    }
}
