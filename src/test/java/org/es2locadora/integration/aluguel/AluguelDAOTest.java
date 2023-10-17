package org.es2locadora.integration.aluguel;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.es2locadora.aluguel.Aluguel;
import org.es2locadora.aluguel.AluguelRepositoryAdapter;
import org.es2locadora.aluguel.ports.out.AluguelRepository;
import org.es2locadora.builder.AluguelBuilder;
import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOAdapter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AssertionFailureBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AluguelDAOTest {

    private static EntityManagerFactory factory;
    private EntityManager manager;
    private GenericDAO<Aluguel, Long> testRepo;
    private AluguelRepository aluguelRepo;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void beforeEach() {
        this.manager = factory.createEntityManager();
        this.manager.getTransaction().begin();
        this.testRepo = new GenericDAOAdapter<>(manager, Aluguel.class);
        this.aluguelRepo = new AluguelRepositoryAdapter(manager);
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
    public void deveTrazerTodosOsAlugueis() {
        List<Aluguel> alugueis = testRepo.findAll();
        Assertions.assertEquals(10, alugueis.size());
    }

    @Test
    public void deveInserirUmAluguelValido() {
        int numAntesDeSalvar = testRepo.findAll().size();
        Aluguel novoAluguel = AluguelBuilder.novoAluguel()
                .comId(13L)
                .comValorPago(1000.0)
                .comDataVencimento(LocalDate.of(2023, 10, 30))
                .comDataPagamento(LocalDate.of(2023, 10, 25)).build();

        testRepo.save(novoAluguel);
        Assertions.assertEquals(numAntesDeSalvar + 1, testRepo.findAll().size());

    }

    @Test
    public void naoDeveSalvarUmAluguelComIdRepetido() {
        Aluguel novoAluguel1 = AluguelBuilder.novoAluguel().comId(15L).build();
        testRepo.save(novoAluguel1);
        Aluguel novoAluguel2 = AluguelBuilder.novoAluguel().comId(15L).build();
        Assertions.assertThrows(PersistenceException.class, () -> {
            testRepo.save(novoAluguel2);
        });

    }

    @Test
    public void deveAtualizarUmAluguelValido() {
        Aluguel aluguel = testRepo.findById(1L);
        Assertions.assertEquals(400, aluguel.getValorPago());
        aluguel.setValorPago(500.0);
        testRepo.update(aluguel);
        aluguel = testRepo.findById(1L);
        Assertions.assertEquals(500, aluguel.getValorPago());
    }

    @Test
    public void deveDeletarUmAluguel() {
        int numAntesDeDeletar = testRepo.findAll().size();
        Aluguel aluguel = testRepo.findById(1L);
        Assertions.assertEquals(400, aluguel.getValorPago());
        testRepo.delete(aluguel);
        Assertions.assertEquals(numAntesDeDeletar - 1, testRepo.findAll().size());
    }

}
