package com.sat.apisat;

import java.util.List;

import com.sat.apisat.database.RespositorioClientes;
import com.sat.apisat.entidade.Clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteRest {
    @Autowired
    private RespositorioClientes repositorio;

    @GetMapping
    public List<Clientes>listar(){
        return repositorio.findAll();
    }
    

    @PostMapping
    public void salvar(@RequestBody Clientes clientes){
        repositorio.save(clientes);
    }

    @PutMapping
    public void alterar(@RequestBody Clientes clientes){
        if(clientes.getId()>0)
        repositorio.save(clientes);
    }
    @DeleteMapping(value="/mole{id}")  
    public void  delete(@PathVariable("id") Long id){
        repositorio.deleteById(id);
    }
}
