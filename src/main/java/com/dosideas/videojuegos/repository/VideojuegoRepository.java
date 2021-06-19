package com.dosideas.videojuegos.repository;

import com.dosideas.videojuegos.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//al codigo de interface que crea java se le debe agregar el extends a jpa
//el extends debe llevar dentro de <> la clase con la cual es repositorio va a trabajar---
//--- y el tipo de dato del id de la clase que se anoto anteriormente 
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
    
   @Query("from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
    
    @Query("from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);
    
    //@Query("from Videojuego v where v.nombre like %?1%")
    List<Videojuego>  findByNombreContaining(String consulta);
}
