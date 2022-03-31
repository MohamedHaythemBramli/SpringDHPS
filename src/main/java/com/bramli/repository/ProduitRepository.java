package com.bramli.repository;

import com.bramli.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
Produit findByName(String name);

    Produit findByPrice(Long price);
}
