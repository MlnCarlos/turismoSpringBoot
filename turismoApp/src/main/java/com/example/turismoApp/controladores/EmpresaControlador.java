package com.example.turismoApp.controladores;

import com.example.turismoApp.modelos.Empresa;
import com.example.turismoApp.servicios.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
public class EmpresaControlador {
    @Autowired
    EmpresaServicio empresaServicio;
    @PostMapping
    public ResponseEntity<?> registrarEmpresa(@RequestBody Empresa datosEmpresa){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> editarEmpresa(@RequestBody Empresa datosNuevosEmpresa, @PathVariable Integer id){
        return null;
    }
    @GetMapping
    public ResponseEntity<?> buscarUnaEmpresa(@PathVariable Integer id){
        return null;
    }
    @GetMapping
    public ResponseEntity<?> buscarTodasEmpresas(){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> borrarEmpresa(@PathVariable Integer id){
        return null;
    }

}
