package com.example.inflearn_srping_basic;

import com.example.inflearn_srping_basic.discount.FixDiscountPolicy;
import com.example.inflearn_srping_basic.member.*;
import com.example.inflearn_srping_basic.order.Order;
import com.example.inflearn_srping_basic.order.OrderService;
import com.example.inflearn_srping_basic.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order : " + order.toString());
//      System.out.println("order : " + order.calculatePrice());
    }
}
