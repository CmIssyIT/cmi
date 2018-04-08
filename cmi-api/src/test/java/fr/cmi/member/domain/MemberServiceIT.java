package fr.cmi.member.domain;

import fr.cmi.AppITConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
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

        final Member memberOne =  Member.builder().id("1").firstName("firstName1").lastName("lastName1").role(Role.ELEVE).status(Status
            .ACTIF).gender(Gender.MALE).age(4l).birthDay(LocalDate.parse("2014-04-02")).classe("Arabe rawdati").build();
        final Member memberTwo =  Member.builder().id("2").firstName("firstName2").lastName("lastName2").role(Role.ENSEIGNANT).status
            (Status.ACTIF).gender(Gender.MALE).age(33l).birthDay(LocalDate.parse("1984-04-11")).build();
        final Member memberThree =  Member.builder().id("3").firstName("firstName3").lastName("lastName3").role(Role.RESPONSABLE_ELEVE)
            .status(Status.ACTIF).gender(Gender.MALE).age(37l).birthDay(LocalDate.parse("1981-04-02")).build();

        // when
        List<Member> result = memberService.findAllMembers();

        // then
        assertThat(result)
            .hasSize(3)
            .containsExactlyInAnyOrder(memberOne, memberTwo, memberThree)
            .extracting(Member::getId).doesNotContainNull();
    }

}
