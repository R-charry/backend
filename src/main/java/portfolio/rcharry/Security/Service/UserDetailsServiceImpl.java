
package portfolio.rcharry.Security.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import portfolio.rcharry.Security.Entity.Usuario;
import portfolio.rcharry.Security.Entity.UsuarioPrincipal;

//convierte la clase usuario en UsuarioPrincipal,
//tomando el usuario de la base de datos y convertirlo en UsuarioPrincipal
//clase especifica que utiliza el security para obtener los datos del usuario y los privilegios

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);    }

    
}
