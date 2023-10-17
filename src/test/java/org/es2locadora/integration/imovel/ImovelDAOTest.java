package org.es2locadora.integration.imovel;

import org.es2locadora.builder.ImovelBuilder;
import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOAdapter;
import org.es2locadora.imovel.Imovel;
import org.es2locadora.imovel.ImovelRepositoryAdapter;
import org.es2locadora.imovel.ports.out.ImovelRepository;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ImovelDAOTest {

    private static EntityManagerFactory factory;
    private EntityManager manager;
    private GenericDAO<Imovel, Long> testDAO;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void beforeEach() {
        this.manager = factory.createEntityManager();
        this.manager.getTransaction().begin();
        this.testDAO = new GenericDAOAdapter<>(manager, Imovel.class);
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
    public void deveRecuperarTodosOsImoveis() {
        List<Imovel> imoveis = testDAO.findAll();
        Assertions.assertEquals(10, imoveis.size());
    }

    @Test
    public void deveSalvarUmImovelValido() {
        int numAntesDeSalvar = testDAO.findAll().size();
        Imovel imovel = ImovelBuilder.novoImovel().comTipoImovel("Casa").comEndereco("rua 1 casa 2").comCep("45612345").comMetragem(100.0).comDormitorios(2).comSuites(1).comVagasGaragem(1).comValorAluguelSugerido(1000.0).build();
        testDAO.save(imovel);
        Assertions.assertEquals(numAntesDeSalvar + 1, testDAO.findAll().size());
    }

    @Test
    public void deveEncontrarUmImovelPeloId() {
        Imovel imovel = testDAO.findById(4L);
        Assertions.assertEquals(imovel.getCep(), "10101010");
    }

    @Test
    public void deveAtualizarUmImovelValido() {
        Imovel imovel = testDAO.findById(4L);
        Assertions.assertEquals("10101010", imovel.getCep());
        imovel.setCep("10101011");
        testDAO.update(imovel);
        imovel = testDAO.findById(4L);
        Assertions.assertEquals("10101011", imovel.getCep());
    }

    @Test
    public void deveDeletarUmImovelValido() {
        int numAntesDeDeletar = testDAO.findAll().size();
        testDAO.delete(testDAO.findById(4L));
        Assertions.assertEquals(numAntesDeDeletar - 1, testDAO.findAll().size());
    }
}
