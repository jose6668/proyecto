
package com.example.Backend.Controllers;




import com.example.Backend.Entity.Producto;
import com.example.Backend.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController

@RequestMapping("/producto")
@CrossOrigin
public class ProductoController {

    @Autowired
    private ProductoService productoService;


    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }


    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable int id) {
        return productoService.getProductoById(id);
    }


    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }


    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable int id, @RequestBody Producto producto) {
        Producto existingProducto = productoService.getProductoById(id);
        if (existingProducto != null) {
            producto.setId(id);
            return productoService.saveProducto(producto);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable int id) {
        productoService.deleteProducto(id);
    }
}
