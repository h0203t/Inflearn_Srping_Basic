package com.example.inflearn_srping_basic;

import com.example.inflearn_srping_basic.member.Grade;
import com.example.inflearn_srping_basic.member.Member;
import com.example.inflearn_srping_basic.member.MemberService;
import com.example.inflearn_srping_basic.member.MemberServiceImpl;
import com.example.inflearn_srping_basic.order.Order;
import com.example.inflearn_srping_basic.order.OrderService;
import com.example.inflearn_srping_basic.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order : " + order.toString());
//      System.out.println("order : " + order.calculatePrice());
    }
}
