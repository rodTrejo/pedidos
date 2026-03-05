/*
 * Copyright (c) 2026. Rodrigo Noé Trejo Guerra.
 * This software may be copied, modified, and distributed freely under the terms of the
 * MIT license.
 */

package rod.trejo.pedidos.service.impl;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import rod.trejo.pedidos.model.Pedido;
import rod.trejo.pedidos.model.Producto;
import rod.trejo.pedidos.repository.PedidoRepository;
import rod.trejo.pedidos.repository.ProductoRepository;
import rod.trejo.pedidos.service.PedidosService;

/**
 * The Class PedidosServiceImpl.
 *
 * @author rodTrejo.
 */
@Service
public class PedidosServiceImpl implements PedidosService {

  private final PedidoRepository pedidoRepository;
  private final ProductoRepository productoRepository;

  public PedidosServiceImpl(PedidoRepository pedidoRepository, ProductoRepository productoRepository) {
    this.pedidoRepository = pedidoRepository;
    this.productoRepository = productoRepository;
  }

  @Override
  public Pedido savePedido(List<Producto> productos) {
    Pedido pedido = new Pedido();
    pedido.setProductos(productos);
    return pedidoRepository.save(pedido);
  }

  @Override
  public Pedido getPedidoById(UUID id) {
    return pedidoRepository.getReferenceById(id);
  }

  @Override
  public void cargarProductos() {
    System.out.println("carga productos ... ");
    Producto p1 = new Producto();
    p1.setNombre("Producto1");
    p1.setPrecio(300.0);

    Producto p2 = new Producto();
    p2.setNombre("Producto2");
    p2.setPrecio(900.0);

    System.out.println("guarda productos ...");
    productoRepository.saveAll(List.of(p1, p2));

  }

  @Override
  public List<Producto> getProductos() {
    return productoRepository.findAll();
  }

}
