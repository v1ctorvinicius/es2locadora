package org.es2locadora.integration.locacao;

import org.es2locadora.builder.LocacaoBuilder;
import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOAdapter;
import org.es2locadora.locacao.Locacao;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class LocacaoDAOTest {

    private static EntityManagerFactory factory;
    private EntityManager manager;
    private GenericDAO<Locacao, Long> testDAO;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void beforeEach() {
        this.manager = factory.createEntityManager();
        this.manager.getTransaction().begin();
        this.testDAO = new GenericDAOAdapter<>(manager, Locacao.class);

    }

    @AfterEach
    public void afterEach() {
        manager.getTransaction().rollback();
    }

    @AfterAll
    public static void close() {
        factory.close();
    }

    // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓

    @Test
    public void deveRecuperarTodosAsLocacoes() {
        List<Locacao> locacoes = testDAO.findAll();
        Assertions.assertEquals(9, locacoes.size());
    }

    @Test
    public void deveSalvarUmaLocacaoValida() {
        int numAntesDeSalvar = testDAO.findAll().size();
        Locacao locacao = LocacaoBuilder.novaLocacao().comIdImovel(10L).comIdInquilino(10L).comValorAluguel(1000.0).comPercentualMulta(5.0).comDiaVencimento(5).comDataInicio(LocalDate.now()).comDataFim(LocalDate.now()).comAtivo(true).comObs("teste").build();
        testDAO.save(locacao);
        Assertions.assertEquals(numAntesDeSalvar + 1, testDAO.findAll().size());
    }

    @Test
    public void deveRecuperarUmaLocacaoPorId() {
        Locacao locacao = testDAO.findById(3L);
        Assertions.assertEquals(3L, locacao.getIdInquilino());
    }

    @Test
    public void deveAtualizarUmaLocacaoValida() {
        Locacao locacao = testDAO.findById(3L);
        Assertions.assertEquals(3L, locacao.getIdInquilino());
        locacao.setAtivo(false);
        testDAO.update(locacao);
        locacao = testDAO.findById(3L);
        Assertions.assertEquals(false, locacao.getAtivo());
    }

    @Test
    public void deveDeletarUmaLocacaoValida() {
        int numAntesDeDeletar = testDAO.findAll().size();
        testDAO.delete(testDAO.findById(3L));
        Assertions.assertEquals(numAntesDeDeletar - 1, testDAO.findAll().size());
    }
}
