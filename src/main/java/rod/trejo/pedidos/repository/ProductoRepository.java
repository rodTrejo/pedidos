package rod.trejo.pedidos.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import rod.trejo.pedidos.model.Producto;

/**
 * The Class ProductoRepository.
 *
 * @author rodTrejo.
 */
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
