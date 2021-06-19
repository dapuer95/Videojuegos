package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.repository.VideojuegoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoService {
    
    //se crea un atributo final de la clase que se quiere inyectar
    private final VideojuegoRepository videojuegoRepository;

    //se crea el constructor para poder invertar la clase repository
    public VideojuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    
    
    //metodo para crear una lista de videojuegos
    //el metodo se declara como una lista con el parametro Videojuego que es nuestro objeto
    //en caso de ser un string seria public String
    public List<Videojuego> buscarDestacados(){
        
        return videojuegoRepository.buscarTodos();
    }
        
    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }
    
     public List<Videojuego> buscar(String consulta){
        return videojuegoRepository.findByNombreContaining(consulta);
    }
    
     public Videojuego guardar(Videojuego videojuego){
         return videojuegoRepository.save(videojuego);
     }
        //888888 todo esto hace parte de agregar los juegos de forma manual
        
//        List<Videojuego> destacados = new ArrayList<>();
//        //Se crea la lista manualmente para el ejemplo
//        
//        //Se crea una variable (juego) que va a contener las caracteristicas para agregarla a la lista
//        //La variable es del tipo (Videojuego) que es nuestro objeto
//        Videojuego juego = new Videojuego();
//        //se utiliza el metodo set creado en la clase Videojuego para modificar las caracteristicas--
//        //-- privadas del objeto
//        juego.setNombre("Bioshock infinite");
//        juego.setDescripcion("Trilogia");
//        juego.setImagenUrl("https://images-na.ssl-images-amazon.com/images/I/91aueKAy13L._SL1500_.jpg");
//        //se agrega la variable a la lista
//        destacados.add(juego);
//       
//        juego = new Videojuego();
//        juego.setNombre("The witcher");
//        juego.setDescripcion("El brujerias");
//        juego.setImagenUrl("https://images-na.ssl-images-amazon.com/images/I/816mR4oKsEL._SX425_.jpg");
//        destacados.add(juego);
//        
//        juego = new Videojuego();
//        juego.setNombre("Assasian's creed");
//        juego.setDescripcion("Los capuchas");
//        juego.setImagenUrl("https://images-na.ssl-images-amazon.com/images/I/81zaZuWJhnL._SL1500_.jpg");
//        destacados.add(juego);
//        
//        juego = new Videojuego();
//        juego.setNombre("FIFA 21");
//        juego.setDescripcion("FIFA 13");
//        juego.setImagenUrl("https://pbs.twimg.com/media/EdiYvglWkAMmqJq.png");
//        destacados.add(juego);
//        
//        //Por ultimo se devuelve la lista
//        return destacados;
          
}
