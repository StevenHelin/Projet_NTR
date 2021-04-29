package fr.uphf.banque.controller;


import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import fr.uphf.banque.repositories.CompteRepo;
import fr.uphf.banque.Comptes;


@RestController
public class CompteControl {
    @Autowired
    CompteRepo compteRepo;

    @GetMapping("comptes")
    public List<Comptes> getAllComptes(){
        return compteRepo.findAll();
    }

    @GetMapping("comptes/{id}")
    public Optional<Comptes> getCompteById(@PathVariable Integer id){
        return compteRepo.findById(id);
    }

}
