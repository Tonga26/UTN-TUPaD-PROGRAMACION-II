package trabajopractico6.ejercicio1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public void listarProductos(){
        if(productos.isEmpty()){
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Productos disponibles: \n");
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public Producto buscarProductoPorId(String id){
        for (Producto p : productos){
            if (id.equals(p.getId())){
                return p;
            }
        }
        return null;
    }

    public void mostrarProductoPorId(String id){
        Producto productoEncontrado = this.buscarProductoPorId(id);
        if (productoEncontrado != null){
            System.out.println("Producto encontrado: ");
            System.out.println(productoEncontrado);
        } else {
            System.out.println("El producto con ID " + id + " no existe.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria){
        boolean categEncontrada = false;
        for (Producto p : productos) {
            if (p.getCategoria() == categoria){
                System.out.println(p);
               categEncontrada = true;
            }
        }
        if(!categEncontrada){
            System.out.println("No se encontró el producto con la categoria indicada.");
        }
    }

    public void eliminarProductoPorId(String id){
        Producto prodEncontrado = buscarProductoPorId(id);
        if (prodEncontrado != null){
            System.out.println("Producto eliminado: " + prodEncontrado);
            productos.remove(prodEncontrado);
        } else {
            System.out.println("No se encontró el producto.");
        }
        System.out.println("---Productos restantes en el inventario---");
        listarProductos();
    }

    public void actualizarStock(String id, int nuevaCantidad){
        Producto prodEncontrado = buscarProductoPorId(id);
        if (prodEncontrado != null){
            prodEncontrado.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto '" + prodEncontrado.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public int obtenerTotalStock(){
        int totalStock = 0;
        for (Producto p : productos){
            totalStock += p.getCantidad();
        }
        return totalStock;
    }

    public Producto obtenerProductoConMayorStock(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos en stock.");
            return null;
        }
        Producto productoMayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > productoMayorStock.getCantidad()) {
                productoMayorStock = p;
            }
        }
        return productoMayorStock;
    }

    public void filtrarProductosPorPrecio(double min, double max){
        boolean prodEncontrado = false;
        for (Producto p : productos){
            if (p.getPrecio() >= min && p.getPrecio() <= max){
                System.out.println(p);
                prodEncontrado = true;
            }
        }
        if(!prodEncontrado){
            System.out.println("No se encontraron productos en el rango de precios especificado.");
        }
    }

    public void mostrarCategoriasDisponibles(){
        System.out.println("Categorías disponibles:\n");
        for (CategoriaProducto categoria : CategoriaProducto.values()){
            System.out.println("- " + categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}
