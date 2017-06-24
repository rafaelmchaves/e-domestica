package br.com.domestica.domestica.gateway.mongo;

import br.com.domestica.domestica.domains.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {

    Contact findByUserName(String userName);

}
