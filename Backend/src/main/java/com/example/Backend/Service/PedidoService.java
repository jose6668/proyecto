
package com.example.Backend.Service;

import com.example.Backend.Entity.Pedido;
import com.example.Backend.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }


    public Pedido getPedidoById(int id) {

        return pedidoRepository.findById(id).orElse(null);
    }


    public Pedido savePedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }


    public void deletePedido(int id) {
        pedidoRepository.deleteById(id);
    }
}
