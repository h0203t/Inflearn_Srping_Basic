package com.example.inflearn_srping_basic.order;

import com.example.inflearn_srping_basic.discount.DiscountPolicy;
import com.example.inflearn_srping_basic.discount.FixDiscountPolicy;
import com.example.inflearn_srping_basic.member.Member;
import com.example.inflearn_srping_basic.member.MemberRepository;
import com.example.inflearn_srping_basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
