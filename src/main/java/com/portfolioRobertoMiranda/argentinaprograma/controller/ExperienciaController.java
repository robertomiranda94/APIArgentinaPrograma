package com.portfolioRobertoMiranda.argentinaprograma.controller;

import com.portfolioRobertoMiranda.argentinaprograma.models.Experiencia;
import com.portfolioRobertoMiranda.argentinaprograma.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {

    @Autowired
    private final ExperienciaService experienciaService;

    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @GetMapping
    public ResponseEntity<List<Experiencia>> getExperiencia(){
        List<Experiencia> experiencias=experienciaService.buscarExperiencia();
        return new ResponseEntity<>(experiencias, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Experiencia> editExperiencia(@RequestBody Experiencia experiencia){
        Experiencia editExperiencia=experienciaService.editarExperiencia(experiencia);
        return new ResponseEntity<>(editExperiencia, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Experiencia> createExperiencia(@RequestBody Experiencia experiencia){
        Experiencia newExperiencia=experienciaService.addExperiencia(experiencia);
        return new ResponseEntity<>(newExperiencia,HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable("id") Long id){
        experienciaService.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
