package org.es2locadora.integration.cliente;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.es2locadora.builder.ClienteBuilder;
import org.es2locadora.cliente.Cliente;
import org.es2locadora.cliente.ClienteRepositoryAdapter;
import org.es2locadora.cliente.ports.out.ClienteRepository;
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
    private ClienteRepository clienteRepo;

    @BeforeAll
    public static void setup() {
        factory = Persistence.createEntityManagerFactory("es2locadora_test");
    }

    @BeforeEach
    public void beforeEach() {
        this.manager = factory.createEntityManager();
        this.manager.getTransaction().begin();
        this.testRepo = new GenericDAOAdapter<>(manager, Cliente.class);
        this.clienteRepo = new ClienteRepositoryAdapter(manager);
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
    public void deveTrazerTodosOsClientes() {
        List<Cliente> clientes = testRepo.findAll();
        Assertions.assertEquals(26, clientes.size());
    }

    @Test
    public void deveSalvarUmClienteValido() {
        int numAntesDeSalvar = testRepo.findAll().size();
        Cliente novoCliente = ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf("12345678910")
                .comTelefone1("12345678910").comTelefone2("12345678910").comEmail("fulanosantos@email.com")
                .comDtNascimento(LocalDate.now()).build();

        testRepo.save(novoCliente);
        Assertions.assertEquals(numAntesDeSalvar + 1, testRepo.findAll().size());
    }

    @Test
    public void naoDeveSalvarUmClienteComCPFRepetido() {
        Cliente novoCliente = ClienteBuilder.novoCliente().comNome("Fulano Santos").comCpf("12345678910").build();
        testRepo.save(novoCliente);
        Cliente novoCliente2 = ClienteBuilder.novoCliente().comNome("Fulano da Silva").comCpf("12345678910").build();
        Assertions.assertThrows(PersistenceException.class, () -> testRepo.save(novoCliente2), "Devia lancar PersistenceException");
    }

    @Test
    public void deveEncontrarUmClientePeloNome() {
        List<Cliente> clientes = this.clienteRepo.findByNome("Ana Santos");
        Assertions.assertEquals(clientes.size(), 2);
    }

    @Test
    public void deveEncontrarUmClientePeloCPF() {
        Cliente novoCliente = ClienteBuilder.novoCliente().comNome("Victor Vinicius").comCpf("11122233344").build();
        testRepo.save(novoCliente);
        Cliente cliente = this.clienteRepo.findByCpf("11122233344");
        Assertions.assertEquals(novoCliente, cliente);
    }

    @Test
    public void deveEncontrarUmClientePeloId() {
        Cliente cliente = testRepo.findById(1L);
        Assertions.assertEquals(cliente.getNomeCliente(), "Ana Santos");
    }

    @Test
    public void deveAtualizarUmClienteValido() {
        Cliente cliente = testRepo.findById(1L);
        Assertions.assertEquals(cliente.getNomeCliente(), "Ana Santos");
        cliente.setNomeCliente("Victor Vinicius");
        testRepo.update(cliente);
        cliente = testRepo.findById(1L);
        Assertions.assertEquals(cliente.getNomeCliente(), "Victor Vinicius");
    }

    @Test
    public void deveDeletarUmClienteValido() {
        int numAntesDeDeletar = testRepo.findAll().size();
        testRepo.delete(testRepo.findById(1L));
        Assertions.assertEquals(numAntesDeDeletar - 1, testRepo.findAll().size());
    }

}
