package Validaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmpresaValidacion {
    public Boolean validarNombre(String nombre) throws Exception{
        if(nombre.length() > 30){
            throw new Exception("Longitud de caracteres invalido");
        }else{
            return true;
        }
    }
}
