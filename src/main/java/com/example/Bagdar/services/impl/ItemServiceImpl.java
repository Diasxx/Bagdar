package com.example.Bagdar.services.impl;

import com.example.Bagdar.entities.Grades;
import com.example.Bagdar.entities.GradesTopics;
import com.example.Bagdar.entities.SubTopics;
import com.example.Bagdar.repositories.GradesRepository;
import com.example.Bagdar.repositories.GradesTopicsRepository;
import com.example.Bagdar.repositories.SubTopicsRepository;
import com.example.Bagdar.services.BagdarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements BagdarService {

    @Autowired
    private GradesRepository gradesRepository;

    @Autowired
    private GradesTopicsRepository gradesTopicsRepository;

    @Autowired
    SubTopicsRepository subTopicsRepository;


    // OVERRIDING METHODS


    @Override
    public Grades getGrade(Long id) {
        return gradesRepository.getOne(id);
    }

    @Override
    public List<Grades> getAllGrades() {
        return gradesRepository.findAll();
    }

    @Override
    public List<GradesTopics> getAllGradesTopics() {
        return gradesTopicsRepository.findAll();
    }

    @Override
    public List<SubTopics> getAllSubTopics() {
        return subTopicsRepository.findAll();
    }

}
