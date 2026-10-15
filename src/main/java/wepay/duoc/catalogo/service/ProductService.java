package wepay.duoc.catalogo.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import wepay.duoc.catalogo.model.Product;
import wepay.duoc.catalogo.repository.PedidoDetalleRepository;
import wepay.duoc.catalogo.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Sort;

@Service
@Transactional
public class ProductService {
	private final ProductRepository productRepository;
	private final PedidoDetalleRepository pedidoDetalleRepository;

	public ProductService(ProductRepository productRepository, PedidoDetalleRepository pedidoDetalleRepository) {
		this.productRepository = productRepository;
		this.pedidoDetalleRepository = pedidoDetalleRepository;
    }

    public List<Product> findAll() {
		return productRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
    }

    public Product create(Product p) {
		p.setId(null);
		return productRepository.save(p);
    }

    public Optional<Product> update(Long id, Product p) {
        if (!productRepository.existsById(id)) {
			return Optional.empty();
		}
		p.setId(id);
		return Optional.of(productRepository.save(p));
    }

    public void delete(Long id) {
		if (!productRepository.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado");
		}

		if (pedidoDetalleRepository.existsByProductId(id)) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, "No se puede eliminar el producto porque está asociado a un pedido");
		}

		productRepository.deleteById(id);
    }
}
