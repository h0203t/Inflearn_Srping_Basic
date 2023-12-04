package com.example.inflearn_srping_basic.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
