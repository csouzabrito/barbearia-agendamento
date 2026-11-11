package br.com.barbearia.api;

import br.com.barbearia.domain.Cliente;
import br.com.barbearia.repository.ClienteRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteRepository repository;
    public ClienteController(ClienteRepository repository) { this.repository = repository; }

    public record CriarClienteRequest(@NotBlank String nome, @NotBlank String telefone, @Email String email) {}

    @GetMapping
    public List<Cliente> listar() { return repository.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
        return repository.findById(id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@Valid @RequestBody CriarClienteRequest request) {
        Cliente salvo = repository.save(new Cliente(request.nome(), request.telefone(), request.email()));
        return ResponseEntity.created(URI.create("/api/clientes/" + salvo.getId())).body(salvo);
    }
}