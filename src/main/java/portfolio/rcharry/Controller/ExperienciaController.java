
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
import portfolio.rcharry.Entity.Experiencia;
import portfolio.rcharry.Service.ExperienciaService;

@RestController
@CrossOrigin
public class ExperienciaController {
    
    @Autowired
    private ExperienciaService experienciaServ;
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia>VerExperiencia(){
        return experienciaServ.verExperiencia();
    }
    
    @PostMapping("/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){
        experienciaServ.crearExperiencia(experiencia);
    }
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia selectExperiencia(@PathVariable Long id){
        return experienciaServ.buscarExperiencia(id);
    }
    
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        experienciaServ.borrarExperiencia(id);
    }
    
    @PutMapping("/experiencia/{id}")
    public void editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        experienciaServ.editarExperiencia(experiencia);
    }
    
}
    
    
    