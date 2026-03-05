/*
 * Copyright (c) 2026. Rodrigo Noé Trejo Guerra.
 * This software may be copied, modified, and distributed freely under the terms of the
 * MIT license.
 */

package rod.trejo.pedidos.controller;

import java.util.List;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rod.trejo.pedidos.model.Pedido;
import rod.trejo.pedidos.model.Producto;
import rod.trejo.pedidos.service.PedidosService;

/**
 * The Class PedidosController.
 *
 * @author rodTrejo.
 */
@RestController
@RequestMapping("/pedidos")
public class PedidosController {

  private final PedidosService pedidosService;

  public PedidosController(PedidosService pedidosService) {
    this.pedidosService = pedidosService;
  }

  @GetMapping("/{id}")
  public ResponseEntity<Pedido> getPedidoById(@PathVariable String id) {
    return ResponseEntity.ok(pedidosService.getPedidoById(UUID.fromString(id)));
  }

  @PostMapping
  public ResponseEntity<Pedido> savePedido(@RequestBody List<Producto> productos) {
    return ResponseEntity.ok(pedidosService.savePedido(productos));
  }

  @GetMapping("/carga-productos")
  public void cargaProductos() {
    pedidosService.cargarProductos();
  }

  @GetMapping("/productos")
  public ResponseEntity<List<Producto>> getProductos() {
    return ResponseEntity.ok(pedidosService.getProductos());
  }


}
