package com.example.Bagdar.repositories;

import com.example.Bagdar.entities.GradesTopics;
import com.example.Bagdar.entities.SubTopics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SubTopicsRepository extends JpaRepository<SubTopics,Long> {

}
