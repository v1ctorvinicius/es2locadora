package org.es2locadora.integration.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.es2locadora.builder.ClienteBuilder;
import org.es2locadora.cliente.Cliente;
import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOAdapter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteDAOTest {

    private static EntityManagerFactory factory;
    private EntityManager manager;
    private GenericDAO<Cliente, Long> testRepo;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void beforeEach() {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        testRepo = new GenericDAOAdapter<>(manager, Cliente.class);
    }

    @AfterEach
    public void afterEach() {
        manager.getTransaction().rollback();
    }

    @AfterAll
    public static void close() {
        factory.close();
    }

    @Test
    public void deveTrazerTodosOsClientes() {
        List<Cliente> clientes = testRepo.findAll();
        Assertions.assertEquals(clientes.size(), 25);
    }

    @Test
    public void deveSalvarUmClienteValido() {
        int numAntesDeSalvar = testRepo.findAll().size();
        Cliente novoCliente = ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf("12345678910").build();
        testRepo.save(novoCliente);
        Assertions.assertEquals(testRepo.findAll().size(), numAntesDeSalvar + 1);
    }

    @Test
    void naoDeveSalvarUmClienteComCPFNulo() {
        Assertions.assertThrows(PersistenceException.class, () -> {
            Cliente novoCliente = ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf(null).build();
            testRepo.save(novoCliente);
        }, "Devia lançar PersistenceException");
    }

    @Test
    public void naoDeveSalvarUmClienteComCPFRepetido() {
        Cliente novoCliente = ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf("12345678910").build();
        testRepo.save(novoCliente);
        Cliente novoCliente2 = ClienteBuilder.novoCliente().comNome("Fulano da Silva").comCpf("12345678910").build();
        Assertions.assertThrows(PersistenceException.class, () -> {
            testRepo.save(novoCliente2);
        }, "Devia lancar PersistenceException");
    }

    @Test
    public void deveEncontrarUmClientePeloNome() {
//        List<Cliente> clientes = testRepo.findAll();
    }

    @Test
    public void deveEncontrarUmClientePeloCPF() {
//         List<Cliente> clientes = testRepo.findAll();
    }

}
