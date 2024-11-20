
package com.example.Backend.Repository;



import com.example.Backend.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
