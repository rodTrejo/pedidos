/*
 * Copyright (c) 2026. Rodrigo Noé Trejo Guerra.
 * This software may be copied, modified, and distributed freely under the terms of the
 * MIT license.
 */

package rod.trejo.pedidos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

/**
 * The Class Pedido.
 *
 * @author rodTrejo.
 */
@Entity
@Data
@Table(name = "pedidos")
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @CreationTimestamp
  @Column(nullable = false, updatable = false)
  private LocalDateTime fecha;

  @ManyToMany
  @JoinTable( name = "pedido_producto", joinColumns = @JoinColumn(name = " pedido_id"), inverseJoinColumns =@JoinColumn(name="producto_id"))
  private List<Producto> productos;

}
