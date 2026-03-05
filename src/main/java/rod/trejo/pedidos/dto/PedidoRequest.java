package rod.trejo.pedidos.dto;

import java.util.List;
import lombok.Builder;
import rod.trejo.pedidos.model.Pedido;
import rod.trejo.pedidos.model.Producto;

/**
 * The Class PedidoRequest.
 *
 * @author rodTrejo.
 */
@Builder
public record PedidoRequest(List<Producto> productos) {
}
