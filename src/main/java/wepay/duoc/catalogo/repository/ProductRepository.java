package wepay.duoc.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wepay.duoc.catalogo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}