package com.example.inflearn_srping_basic.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
