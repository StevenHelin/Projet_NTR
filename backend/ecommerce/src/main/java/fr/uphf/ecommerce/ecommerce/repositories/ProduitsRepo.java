package fr.uphf.ecommerce.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import fr.uphf.ecommerce.ecommerce.Produits;

public interface ProduitsRepo extends JpaRepository<Produits, Integer> {
    Optional<Produits> findById(Integer id);
}
