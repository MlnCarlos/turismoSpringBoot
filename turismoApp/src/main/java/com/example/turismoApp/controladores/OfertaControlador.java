package com.example.turismoApp.controladores;

import com.example.turismoApp.modelos.Empresa;
import com.example.turismoApp.modelos.Oferta;
import com.example.turismoApp.servicios.EmpresaServicio;
import com.example.turismoApp.servicios.OfertaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/oferta")
public class OfertaControlador {
    @Autowired
    OfertaServicio ofertaServicio;
    @PostMapping
    public ResponseEntity<?> registrarOferta(@RequestBody Oferta datosOferta){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> editarOferta(@RequestBody Oferta datosNuevosOferta, @PathVariable Integer id){
        return null;
    }
    @GetMapping
    public ResponseEntity<?> buscarUnaOferta(@PathVariable Integer id){
        return null;
    }
    @GetMapping
    public ResponseEntity<?> buscarTodasOfertas(){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> borrarOferta(@PathVariable Integer id){
        return null;
    }
}
