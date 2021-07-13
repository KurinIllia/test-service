package com.kurininc.testservice.repository;

import com.kurininc.testservice.model.Person;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CassandraRepository<Person, String> {
}
