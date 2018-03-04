package fr.cmi.member.web;

import fr.cmi.member.domain.Member;
import fr.cmi.member.domain.MemberRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/members")
@Validated
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping
    public Iterable<Member> findAll() {
        return memberRepository.findAll();
    }

    @PostMapping
    public Member createMember(@Valid @RequestBody Member member) {
        return memberRepository.save(member);
    }

}
