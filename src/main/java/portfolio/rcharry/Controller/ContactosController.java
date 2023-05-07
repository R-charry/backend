
package portfolio.rcharry.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.rcharry.Entity.Contactos;
import portfolio.rcharry.Service.ContactosService;

@RestController
@CrossOrigin
public class ContactosController {
    
    @Autowired
    private ContactosService contactosServ;
    
    @GetMapping("/contactos")
    @ResponseBody
    public List<Contactos>VerContactos(){
        return contactosServ.verContactos();
    }
    
    @PostMapping("/contactos")
    public void agregarContactos(@RequestBody Contactos contactos){
        contactosServ.crearContactos(contactos);
    }
    
    @GetMapping("/contactos/{id}")
    @ResponseBody
    public Contactos selectContactos(@PathVariable Long id){
        return contactosServ.buscarContactos(id);
    }
    
    @DeleteMapping("/contactos/{id}")
    public void borrarContactos(@PathVariable Long id){
        contactosServ.borrarContactos(id);
    }
    
    @PutMapping("/contactos/{id}")
    public void editarContactos(@PathVariable Long id, @RequestBody Contactos contactos){
        contactosServ.editarContactos(contactos);
    }
    
}
    
    
    

