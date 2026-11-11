package br.com.barbearia.repository;
import br.com.barbearia.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {}