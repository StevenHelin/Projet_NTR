package fr.uphf.ecommerce.ecommerce.controller;

import org.springframework.web.bind.annotation.RestController;
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

import fr.uphf.ecommerce.ecommerce.repositories.ProduitsRepo;
import fr.uphf.ecommerce.ecommerce.Produits;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitsControl {

    @Autowired
    ProduitsRepo produitsRepo;


    @GetMapping("produits")
    public List<Produits> getAllProduits(){
        return produitsRepo.findAll();
    }

    @GetMapping("produits/{id}")
    public Optional<Produits> getProduitById(@PathVariable Integer id){
        return produitsRepo.findById(id);
    }
}
