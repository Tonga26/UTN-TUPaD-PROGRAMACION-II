package trabajopractico6.ejercicio1;

public class Main {
    public static void main (String[] args){
        // Se crea la lista de inventario
        Inventario miTienda = new Inventario();

        // Se crean 5 productos
        Producto televisor = new Producto("E001", "TV Samsung 55\"", 2500.00, 10, CategoriaProducto.ELECTRONICA);
        Producto camiseta = new Producto("R001", "Camiseta de algodón", 300.00, 50, CategoriaProducto.ROPA);
        Producto arroz = new Producto("A001", "Arroz Kilo", 80.00, 100, CategoriaProducto.ALIMENTOS);
        Producto sabanas = new Producto("H001", "Juego de sábanas Queen", 1250.50, 30, CategoriaProducto.HOGAR);
        Producto teclado = new Producto("E002", "Teclado Mecánico RGB", 1800.00, 25, CategoriaProducto.ELECTRONICA);

        // Se agregan los 5 productos al inventario
        miTienda.agregarProducto(televisor);
        miTienda.agregarProducto(camiseta);
        miTienda.agregarProducto(arroz);
        miTienda.agregarProducto(sabanas);
        miTienda.agregarProducto(teclado);
        System.out.println("Tarea 1: se agregaron 5 productos y sus categorías\n");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 2: listar todos los productos mostrando su información y categoría:\n");
        miTienda.listarProductos();

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 3: buscar un producto por ID y mostrar su información:\n");
        miTienda.mostrarProductoPorId("E001");
        miTienda.mostrarProductoPorId("Z999");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 4: filtrar y mostrar productos que pertenezcan a una categoría específica:\n");
        miTienda.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 5: eliminar un producto por su ID y listar los productos restantes:\n");
        miTienda.eliminarProductoPorId("E002");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 6: actualizar el stock de un producto existente:\n");
        miTienda.actualizarStock("E001", 15);

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 7: mostrar el total de stock disponible:\n");
        int totalStock = miTienda.obtenerTotalStock();
        System.out.println("El total de stock disponible es " + totalStock);

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 8: obtener y mostrar el producto con mayor stock:\n");
        Producto stockMayor = miTienda.obtenerProductoConMayorStock();
        System.out.println("El producto con mayor stock es: " + stockMayor.getNombre() + ", con " + stockMayor.getCantidad() + " unidades.");

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 9: filtrar productos con precios entre $1000 y $3000:\n");
        miTienda.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("-".repeat(50) + "\n");

        System.out.println("Tarea 10: mostrar las categorías disponibles con sus descripciones:\n");
        miTienda.mostrarCategoriasDisponibles();
    }
}
