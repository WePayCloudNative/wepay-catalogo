package wepay.duoc.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wepay.duoc.catalogo.model.PedidoDetalle;

public interface PedidoDetalleRepository extends JpaRepository<PedidoDetalle, Long> {
	boolean existsByProductId(Long productId);
}