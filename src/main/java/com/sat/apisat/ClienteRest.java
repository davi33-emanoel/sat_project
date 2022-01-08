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
@RequestMapping("/clients")
public class ClienteRest {
    @Autowired
    private RespositorioClientes repositorio;

    @GetMapping
    public List<Clientes>listar(){
        return repositorio.findAll();
    }
    @GetMapping("/client/{id}")
    public Clientes listaClientePorId(@PathVariable(value="id")long id) {
    	return repositorio.findById(id);
    }

    @PostMapping("/save")
    public Clientes salvar(@RequestBody Clientes clientes){
        return repositorio.save(clientes);
    }

    @PutMapping("/change")
    public Clientes alteraCLiente(@RequestBody Clientes clientes){
        return repositorio.save(clientes);
    }
    
    @DeleteMapping("/delete/{id}")  
    public Clientes deletaCliente(@PathVariable(value="id") long id){
       return repositorio.deleteById(id);
    }
}
