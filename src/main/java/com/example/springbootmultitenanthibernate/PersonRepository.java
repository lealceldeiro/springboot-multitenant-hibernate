package com.example.springbootmultitenanthibernate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("select new com.example.springbootmultitenanthibernate.PersonDto(p.id, p.name, p.tenant) from Person p")
    Page<PersonDto> people(Pageable pageable);

    @Query("select p from Person p where p.name = :name")
    Person findJpqlByName(String name);

    @Query(nativeQuery = true,
           value = "SELECT * FROM person WHERE name = :name")
    Person findSqlByName(String name);
}
