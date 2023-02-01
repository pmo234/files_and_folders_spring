package com.codeclan.example.filemanagement.Repositories;

import com.codeclan.example.filemanagement.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
