package br.com.lucas.spring5webapp.repositories;

import br.com.lucas.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
