package fr.cmi.inscription.domain;

import fr.cmi.AppITConfig;
import fr.cmi.inscription.domain.Inscription;
import fr.cmi.inscription.domain.InscriptionRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@DataJpaTest
@RunWith(SpringRunner.class)
public class InscriptionRepositoryIT {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private InscriptionRepository repository;

    @Test
    public void should_find_all_users() throws Exception {
        //given
        Inscription inscriptionOne = new Inscription("firstName1", "lastName1");
        testEntityManager.persist(inscriptionOne);
        Inscription inscriptionTwo = new Inscription("firstName2", "lastName2");
        testEntityManager.persist(inscriptionTwo);

        // when
        Iterable<Inscription> result = repository.findAll();

        // then
        assertThat(result)
            .hasSize(2)
            .containsOnly(inscriptionOne, inscriptionTwo)
            .extracting(Inscription::getId).doesNotContainNull();
    }

}
