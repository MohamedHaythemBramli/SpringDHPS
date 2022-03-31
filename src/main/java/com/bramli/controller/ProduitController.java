package com.bramli.controller;

import com.bramli.entity.Produit;
import com.bramli.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitController {
    @Autowired
    private ProduitRepository repo;
    @GetMapping(path = "/produits")
    public List<Produit> list(){
        return repo.findAll();
    }
    @GetMapping(path = "/produits/{id}")
    public Produit getProduit(@PathVariable Long id){
        return repo.findById(id).get();
    }
    @PostMapping (path = "/produits")
    public Produit saveProduit(@RequestBody Produit produit){
        return repo.save(produit);
    }
    @DeleteMapping(path = "/produits/{id}")
    public void deleteProduit(@PathVariable Long id){
        repo.deleteById(id);
    }
    @PutMapping (path = "/produits/{id}")
    public Produit updateProduit(@RequestBody Produit produit,@PathVariable Long id){
        produit.setId(id);
        return repo.save(produit);
    }

    @GetMapping(path = "/produitByname/{name}")
    public Produit getProduit(@PathVariable String name){
        return repo.findByName(name);
    }


}
