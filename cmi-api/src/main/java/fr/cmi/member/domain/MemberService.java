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

    public  List<EnsTPersonne> findAllMembers(){
        return ensTPersonneDao.findAll();

    }

    public EnsTPersonne save(EnsTPersonne member) {
        ensTPersonneDao.insert(member);
       return ensTPersonneDao.findById(member.getIdPersonne());
    }
}
