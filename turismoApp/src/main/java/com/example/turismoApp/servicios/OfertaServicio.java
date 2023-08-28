package com.example.turismoApp.servicios;

import Validaciones.EmpresaValidacion;
import com.example.turismoApp.modelos.Empresa;
import com.example.turismoApp.modelos.Oferta;
import com.example.turismoApp.repositorios.EmpresaRepositorio;
import com.example.turismoApp.repositorios.OfertaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class OfertaServicio {
    @Autowired
    OfertaRepositorio ofertaRepositorio;
    public Oferta registrarOferta(Oferta datosARegistrar)throws Exception {
        try {
            return(this.ofertaRepositorio.save(datosARegistrar));
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public Oferta modificarOferta(Integer id, Oferta datosAModificar) throws Exception{
        try {
            Optional<Oferta> ofertaEncontrada = this.ofertaRepositorio.findById(id);
            if(ofertaEncontrada.isEmpty()){
                throw new Exception("Oferta no encontrada");
            }
            Oferta ofertaQueExiste = ofertaEncontrada.get();

            ofertaQueExiste.setTitulo(datosAModificar.getTitulo());

            return(this.ofertaRepositorio.save(ofertaQueExiste));

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Oferta buscarOfertaPorId(Integer id) throws Exception{
        return null;
    }

    public List<Oferta> buscarTodasOfertas() throws Exception{
        return null;
    }
    public Boolean eliminarOferta(Integer id) throws Exception{
        return true;
    }
}
