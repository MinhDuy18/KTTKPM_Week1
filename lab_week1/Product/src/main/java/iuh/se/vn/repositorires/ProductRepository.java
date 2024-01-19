package iuh.se.vn.repositorires;

import iuh.se.vn.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
