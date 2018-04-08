package fr.cmi.member.domain;

import fr.cmi.jooq.tables.daos.EnsTPersonneDao;
import fr.cmi.jooq.tables.pojos.EnsTPersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private EnsTPersonneDao ensTPersonneDao;
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAllMembers() {
        return this.memberRepository.findAllMembers();
    }

    public EnsTPersonne save(EnsTPersonne member) {
        ensTPersonneDao.insert(member);
        return ensTPersonneDao.findById(member.getIdPersonne());
    }
}
