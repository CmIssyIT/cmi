package fr.cmi.member.web;

import fr.cmi.inscription.domain.Inscription;
import fr.cmi.inscription.domain.InscriptionRepository;
import fr.cmi.inscription.web.InscriptionController;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MemberControllerTest {

    private final InscriptionRepository inscriptionRepository = mock(InscriptionRepository.class);

    private final InscriptionController inscriptionController = new InscriptionController(inscriptionRepository);

    @Test
    public void should_delegate_member_list_to_service() throws Exception {

        // given
        List<Inscription> expected = asList(new Inscription(), new Inscription());
        when(inscriptionRepository.findAll()).thenReturn(expected);

        // when
        Iterable<Inscription> result = inscriptionController.findAll();

        // then
        assertThat(result).isSameAs(expected);
    }

    @Test
    public void should_delegate_member_creation_to_service() throws Exception {

        // given
        Inscription saved = mock(Inscription.class);
        Inscription expected = mock(Inscription.class);
        when(inscriptionRepository.save(expected)).thenReturn(saved);

        // when
        Inscription result = inscriptionController.createInscription(expected);

        // then
        assertThat(result).isSameAs(saved);
    }

}
