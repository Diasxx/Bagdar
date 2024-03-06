package com.example.Bagdar.services;

import com.example.Bagdar.entities.Grades;
import com.example.Bagdar.entities.GradesTopics;
import com.example.Bagdar.entities.SubTopics;

import java.util.List;

public interface BagdarService {
    // REALIZATION OF ALL METHODS

    Grades getGrade(Long id);
    List<Grades> getAllGrades();
    List<GradesTopics> getAllGradesTopics();
    List<SubTopics> getAllSubTopics();

}
