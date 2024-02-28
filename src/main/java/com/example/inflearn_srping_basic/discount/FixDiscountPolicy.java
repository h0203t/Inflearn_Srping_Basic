package com.example.inflearn_srping_basic.discount;

import com.example.inflearn_srping_basic.member.Grade;
import com.example.inflearn_srping_basic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
