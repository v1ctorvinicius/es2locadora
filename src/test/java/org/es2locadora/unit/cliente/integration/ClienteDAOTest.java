package org.es2locadora.unit.cliente.integration;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.es2locadora.cliente.Cliente;
import org.es2locadora.cliente.ports.out.ClienteRepository;
import org.es2locadora.dao.GenericDAO;
import org.es2locadora.dao.GenericDAOImpl;
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
    public void before() {
        manager = factory.createEntityManager();
        manager.getTransaction().begin();
        testRepo = new GenericDAOImpl<>(manager, Cliente.class);
    }

    @AfterEach
    public void after() {
        // em.getTransaction().rollback();
    }

    @AfterAll
    public static void close() {
        factory.close();
    }

    @Test
    public void deveTrazerTodosOsClientesResultandoEm25() {
        List<Cliente> clientes = testRepo.findAll();
        Assertions.assertEquals(clientes.size(), 25);
    }
    
    @Test
    public void deveEncontrarUmClientePeloNome() {
        List<Cliente> clientes = testRepo.findAll();
    }


    @Test
    public void naoDeveSalvarClienteComSemAtributoObrigatorio() {
        // Cliente cliente = new Cliente();
        // cliente.setNomeCliente("Jose");
        // cliente.setCpf("11111111111");
        // repo.create(cliente);
        // manager.getTransaction().commit();
    }

}
