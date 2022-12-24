package com.portfolioRobertoMiranda.argentinaprograma.controller;

import com.portfolioRobertoMiranda.argentinaprograma.models.Skills;
import com.portfolioRobertoMiranda.argentinaprograma.services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {

    @Autowired
    private final SkillsService skillService;

    public SkillsController(SkillsService skillsService) {
        this.skillService = skillsService;
    }

    @GetMapping
    public ResponseEntity<List<Skills>> getSkills(){
        List<Skills> skills= skillService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Skills> editSkill(@RequestBody Skills skill){
        Skills editSkill=skillService.editarSkills(skill);
        return new ResponseEntity<>(editSkill,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skills> createSkill(@RequestBody Skills skill){
        Skills newSkill=skillService.addSkills(skill);
        return new ResponseEntity<>(newSkill,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
