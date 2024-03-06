package com.example.inflearn_srping_basic.discount;

import com.example.inflearn_srping_basic.member.Grade;
import com.example.inflearn_srping_basic.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP 10%")
    void vip_o(){
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

//    @Test
//    @DisplayName("BASIC 10% X")
//    void vip_x(){
//        //given
//        Member memberB = new Member(2L, "memberB", Grade.BASIC);
//        //when
//        int discount = discountPolicy.discount(memberB, 10000);
//        //then
//        Assertions.assertThat(discount).isEqualTo(1000);
//    }

}