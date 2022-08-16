package com.example.springbootmultitenanthibernate;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PersonController {
    final PersonRepository personRepository;

    @GetMapping("/person")
    @Transactional(readOnly = true)
    public Page<PersonDto> person(Pageable pageable) {
        return personRepository.people(pageable);
    }

    @PostMapping("/person")
    @Transactional
    public void addPerson(@RequestBody PersonDto p) {
        personRepository.save(new Person(p.getName()));
    }
}
