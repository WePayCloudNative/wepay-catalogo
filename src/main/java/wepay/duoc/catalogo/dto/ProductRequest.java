package wepay.duoc.catalogo.dto;

public record ProductRequest(
		String name,
		String description,
		double price,
		String categoria,
		String imagenUrl,
		Double precioAnterior) {
}
