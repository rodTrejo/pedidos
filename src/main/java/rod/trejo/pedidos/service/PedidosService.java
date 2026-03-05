/*
 * Copyright (c) 2026. Rodrigo Noé Trejo Guerra.
 * This software may be copied, modified, and distributed freely under the terms of the
 * MIT license.
 */

package rod.trejo.pedidos.service;

import java.util.List;
import java.util.UUID;
import rod.trejo.pedidos.model.Pedido;
import rod.trejo.pedidos.model.Producto;

/**
 * The Class PedidosService.
 *
 * @author rodTrejo.
 */
public interface PedidosService {

  Pedido savePedido(List<Producto> productos);

  Pedido getPedidoById(UUID id);

  void cargarProductos();

  List<Producto> getProductos();

}
