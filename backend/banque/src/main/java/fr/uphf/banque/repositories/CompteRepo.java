package fr.uphf.banque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import fr.uphf.banque.Comptes;

import java.util.Optional;

public interface CompteRepo extends JpaRepository<Comptes, Integer>{
    Optional<Comptes> findById(Integer id);
}
