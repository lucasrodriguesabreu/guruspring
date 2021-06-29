package br.com.lucas.spring5webapp.repositories;

import br.com.lucas.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
