package com.dosideas.videojuegos.controller;

import com.dosideas.videojuegos.domain.Videojuego;
import com.dosideas.videojuegos.service.VideojuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ListadoController {

    private final VideojuegoService videojuegoService;

    //Constructor para el atirbuto final
    //De esta forma se crea una relacion entre el controlador y el servicio
    //Como se creo un constructor dentro del controlador que necesita el service--
    //Spring va a inyectar el servicio el en controlador automaticamente
    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String listarVideojuegos(Model model) {
        //se debe invocar al service
        //trae la lista destacados desde la clase VideojuegoService
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        //se carga la lista de videojuegos al modelo para pasarsela a la vista con addAttribute
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model) {
        List<Videojuego> juegos = videojuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

//    @RequestMapping("/buscar")
//     public String buscar(@RequestParam("q") String consulta, Model model){
//    //public String buscar() {
//        List<Videojuego> juegos = videojuegoService.buscar(consulta);
//        model.addAttribute("videojuegos", juegos);
//        return "listado";
//    }

     @RequestMapping("/buscar")
     public String buscar(){
        return "listado";
    }
}
