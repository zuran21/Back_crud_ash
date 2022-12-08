package com.example.backendh93p1.services.implement;

import com.example.backendh93p1.entity.UsuariosEntity;
import com.example.backendh93p1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository userepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuariosEntity userload = userepo.findByUsername(username);
        if (userload ==null){
            throw new UsernameNotFoundException ("Usuario No encontrado");
        }
        return userload;
    }
}
