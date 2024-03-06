package com.example.Bagdar.Controller;
import com.example.Bagdar.entities.Grades;
import com.example.Bagdar.entities.GradesTopics;
import com.example.Bagdar.entities.SubTopics;
import com.example.Bagdar.services.BagdarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BagdarService bagdarService;

    @GetMapping("/")
    public String mainPage(){
        return "mainpage";
    }

    @GetMapping("/entpage")
    public String entPage(){
        return "entpage";
    }

    @GetMapping("/gradespage")
    public String getGrades(Model model){

        List<Grades> grades = bagdarService.getAllGrades();
        model.addAttribute("grades",grades);

        return "gradespage";
    }

    @GetMapping("/topicspage/{idtopics}")
    public String getTopics(Model model, @PathVariable(name = "idtopics") Long id ){

        Grades grades = bagdarService.getGrade(id);
        List<GradesTopics> gradesTopics = bagdarService.getAllGradesTopics();
        List<SubTopics> subTopics = bagdarService.getAllSubTopics();

        model.addAttribute("grades",grades);
        model.addAttribute("gradesTopics",gradesTopics);
        model.addAttribute("subTopics",subTopics);

        return "topicspage";
    }



}