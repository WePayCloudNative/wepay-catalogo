package wepay.duoc.catalogo.dto;

public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String categoria;
    private String imagenUrl;
    private Double precioAnterior;

    public ProductResponse() {}

    public ProductResponse(Long id, String name, String description, double price,
            String categoria, String imagenUrl, Double precioAnterior) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoria = categoria;
        this.imagenUrl = imagenUrl;
        this.precioAnterior = precioAnterior;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public Double getPrecioAnterior() {
        return precioAnterior;
    }
}
