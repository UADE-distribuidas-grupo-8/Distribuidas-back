package com.uade.morfando.services;

import com.uade.morfando.entities.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClientesService {
/*    @Override
    public int login(Cliente cliente) {
        Cliente cliente = usuarioRepository.findByEmailAndPassword(usuario.getEmail(), usuario.getPassword());
        if (user==null){
            throw new UsuarioException(invalido);
        }
        return user.getIdUsuario();

        return 0;
    }*/

    @Override
    public Cliente login(String username) {
        return null;
    }
}
