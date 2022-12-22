package com.portfolioRobertoMiranda.argentinaprograma.services;

import com.portfolioRobertoMiranda.argentinaprograma.models.Skills;
import com.portfolioRobertoMiranda.argentinaprograma.repository.SkillsRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }

    public List<Skills> buscarSkills(){
        return skillsRepo.findAll();
    }

    public Skills editarSkills(Skills skills){
        return skillsRepo.save(skills);
    }

    public void borrarSkills(Long id){
        skillsRepo.deleteById(id);
    }
}
