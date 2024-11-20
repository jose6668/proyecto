package com.example.Backend.Controllers;

import com.example.Backend.Entity.Pedido;
import com.example.Backend.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
@CrossOrigin
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.getAllPedidos();
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable int id) {
        return pedidoService.getPedidoById(id);
    }

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.savePedido(pedido);
    }

    @PutMapping("/{id}")
    public Pedido updatePedido(@PathVariable int id, @RequestBody Pedido pedido) {
        Pedido existingPedido = pedidoService.getPedidoById(id);
        if (existingPedido != null) {
            pedido.setId(id);
            return pedidoService.savePedido(pedido);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable int id) {
        pedidoService.deletePedido(id);
    }
}