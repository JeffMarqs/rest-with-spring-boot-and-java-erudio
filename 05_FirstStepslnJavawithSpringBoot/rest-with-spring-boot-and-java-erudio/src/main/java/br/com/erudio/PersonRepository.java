package br.com.erudio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.model.Person;


public interface PersonRepository extends JpaRepository<Person, Long> { // sempre adicionar o objeto e o tipo do ID deste objeto

}
