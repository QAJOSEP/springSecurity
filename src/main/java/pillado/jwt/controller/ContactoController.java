package pillado.jwt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pillado.jwt.model.Contacto;
import pillado.jwt.repository.ContactoRepository;

@RestController
@RequestMapping("contactos")
@AllArgsConstructor
public class ContactoController {
    
    private final ContactoRepository contactoRepository;

    @GetMapping
    public List<Contacto> listContacto(){
        return contactoRepository.findAll();
    }
}
