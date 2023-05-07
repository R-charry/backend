
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
import portfolio.rcharry.Entity.Educacion;
import portfolio.rcharry.Service.EducacionService;

@RestController
@CrossOrigin
public class EducacionController {
    
    @Autowired
    private EducacionService educacionServ;
    
    @GetMapping("/educacion")
    @ResponseBody
    public List<Educacion>VerEducacion(){
        return educacionServ.verEducacion();
    }
    
    @PostMapping("/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion){
        educacionServ.crearEducacion(educacion);
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion selectEducacion(@PathVariable Long id){
        return educacionServ.buscarEducacion(id);
    }
    
    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        educacionServ.borrarEducacion(id);
    }
    
    @PutMapping("/educacion/{id}")
    public void editarEducacion(@PathVariable Long id, @RequestBody Educacion educacion){
        educacionServ.editarEducacion(educacion);
    }
    
}
    
    
    

