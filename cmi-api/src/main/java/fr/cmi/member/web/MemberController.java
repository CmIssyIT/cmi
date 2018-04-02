package fr.cmi.member.web;

import fr.cmi.inscription.domain.Inscription;
import fr.cmi.jooq.tables.pojos.EnsTPersonne;
import fr.cmi.member.domain.MemberService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/members")
@Validated
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<EnsTPersonne> findAll() {
        return memberService.findAllMembers();
    }

    @PostMapping
    public EnsTPersonne createMember(@Valid @RequestBody EnsTPersonne member) {
        return memberService.save(member);
    }

}
