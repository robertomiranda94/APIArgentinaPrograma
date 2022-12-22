package com.portfolioRobertoMiranda.argentinaprograma.services;


import com.portfolioRobertoMiranda.argentinaprograma.models.Educacion;
import com.portfolioRobertoMiranda.argentinaprograma.repository.EducacionRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }

    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }
}
