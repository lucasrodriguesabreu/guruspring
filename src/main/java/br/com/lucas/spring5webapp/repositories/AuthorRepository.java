package br.com.lucas.spring5webapp.repositories;

import br.com.lucas.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
