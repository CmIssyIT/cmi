package fr.cmi.inscription.domain;

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
    public void should_find_all_inscriptions() throws Exception {
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

    @Test
    public void should_find_inscription_by_uuid(){
        //given
        Inscription inscriptionOne = new Inscription("firstName1", "lastName1");
        testEntityManager.persist(inscriptionOne);

        // when
        Inscription result = repository.findByUuid(inscriptionOne.getUuid()).get();

        // then
        assertThat(result).isEqualTo(inscriptionOne);
    }

}
