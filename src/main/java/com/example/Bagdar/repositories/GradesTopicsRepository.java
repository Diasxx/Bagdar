package com.example.Bagdar.repositories;

import com.example.Bagdar.entities.Grades;
import com.example.Bagdar.entities.GradesTopics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface GradesTopicsRepository extends JpaRepository<GradesTopics,Long> {

}
