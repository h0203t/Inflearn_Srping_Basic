package com.example.inflearn_srping_basic;

import com.example.inflearn_srping_basic.discount.DiscountPolicy;
import com.example.inflearn_srping_basic.discount.FixDiscountPolicy;
import com.example.inflearn_srping_basic.discount.RateDiscountPolicy;
import com.example.inflearn_srping_basic.member.MemberRepository;
import com.example.inflearn_srping_basic.member.MemberService;
import com.example.inflearn_srping_basic.member.MemberServiceImpl;
import com.example.inflearn_srping_basic.member.MemoryMemberRepository;
import com.example.inflearn_srping_basic.order.OrderService;
import com.example.inflearn_srping_basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
//      return new RateDiscountPolicy();
    }
}
