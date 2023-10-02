package org.es2locadora.unit.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.es2locadora.cliente.adapter.out.ClienteRepositoryAdapter;
import org.es2locadora.cliente.domain.Cliente;
import org.es2locadora.cliente.domain.ports.out.ClienteRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteRepositoryUnitTest {

    private static EntityManagerFactory factory;
    private EntityManager em;
    private ClienteRepository repo;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void before() {
        em = factory.createEntityManager();
        em.getTransaction().begin();
        this.repo = new ClienteRepositoryAdapter(em);
    }

    @AfterEach
    public void after() {
        em.getTransaction().rollback();
        // this.em.getTransaction().commit();
    }

    @AfterAll
    public static void close() {
        factory.close();
    }

    @Test
    public void naoDeveSalvarClienteComCPFJaExistente() {
        
    }

    @Test
    public void naoDeveSalvarClienteComEmailJaExistente() {

    }

    @Test
    public void naoDeveSalvarClienteComCPFInvalido() {

    }

    public void deveTrazerTodosOsClientes() {
        // List<Cliente> clientes = repo.getAll();
    }

}
