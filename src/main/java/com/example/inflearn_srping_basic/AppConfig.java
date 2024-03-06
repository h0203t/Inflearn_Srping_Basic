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

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
//      return new RateDiscountPolicy();
    }
}
