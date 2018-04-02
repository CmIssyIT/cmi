package fr.cmi.member.domain;

import fr.cmi.AppITConfig;
import fr.cmi.jooq.tables.pojos.EnsTPersonne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@AppITConfig
@RunWith(SpringRunner.class)
@Sql(scripts = {
    "classpath:sql/reset.sql",
    "classpath:sql/membersTest/members.sql"
})
public class MemberServiceIT {

    @Autowired
    private MemberService memberService;

    @Test
    public void should_find_all_members() throws Exception {
        //given members are already inserted in start up
        EnsTPersonne personneOne = new EnsTPersonne(1, 1,"lastName1",  "firstName1",  null, 1, 1, null, null,
            0);
        EnsTPersonne personneTwo = new EnsTPersonne(2, 1,"lastName2", "firstName2",  null, 1, 1, null, null,
            0);

        // when
        List<EnsTPersonne> result = memberService.findAllMembers();

        // then
        assertThat(result)
            .hasSize(2)
            .containsExactlyInAnyOrder(personneOne, personneTwo)
            .extracting(EnsTPersonne::getIdPersonne).doesNotContainNull();
    }

}
