package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Distribuidor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DistribuidorRepository extends JpaRepository<Distribuidor, Integer> {
// sin ningun query o metedo ya tiene integrado el repository por libreria el metodo findAll
}
