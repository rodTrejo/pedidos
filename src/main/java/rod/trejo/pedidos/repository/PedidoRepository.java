package rod.trejo.pedidos.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import rod.trejo.pedidos.model.Pedido;

/**
 * The Class PedidoRepository.
 *
 * @author rodTrejo.
 */
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {

}
