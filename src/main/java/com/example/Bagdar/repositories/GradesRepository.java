package com.example.Bagdar.repositories;

import com.example.Bagdar.entities.Grades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface GradesRepository extends JpaRepository<Grades,Long> {

}
