package com.example.session1semana2.controllers;

import com.example.session1semana2.models.Facturas;
import com.example.session1semana2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repository repo;

    @GetMapping
    public String index(){
        return "Conectado a la base de datos";
    }

    @GetMapping("facturas")
    public List<Facturas> getFacturas(){
        return repo.findAll();
    }

    @PostMapping("grabar")
    public String post(@RequestBody Facturas facturas){
        repo.save(facturas);
        return "Grabado";
    }

    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Facturas facturas){
        Facturas updateFacturas = repo.findById(id).get();
        updateFacturas.setFecha_factura(facturas.getFecha_factura());
        updateFacturas.setTotal(facturas.getTotal());
        updateFacturas.setImpuesto(facturas.getImpuesto());
        updateFacturas.setSubtotal(facturas.getSubtotal());
        updateFacturas.setMetodo_pago(facturas.getMetodo_pago());
        updateFacturas.setEstado(facturas.getEstado());
        updateFacturas.setFecha_vencimiento(facturas.getFecha_vencimiento());
        updateFacturas.setFecha_pago(facturas.getFecha_pago());
        updateFacturas.setNumero_factura(facturas.getNumero_factura());
        updateFacturas.setTipo_documento(facturas.getTipo_documento());
        updateFacturas.setSerie(facturas.getSerie());
        updateFacturas.setMoneda(facturas.getMoneda());
        updateFacturas.setImpuesto(facturas.getImpuesto());
        repo.save(updateFacturas);
        return "Actualizado";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Facturas deleteFacturas = repo.findById(id).get();
        repo.delete(deleteFacturas);
        return "Eliminado";
    }

}
