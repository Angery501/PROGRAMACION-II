package PooOnce;
import java.time.LocalDateTime;
import java.util.*;
public class SistemaCafeteriaSimple {
    
    private Map<String, Double> menu;      
    private Map<String, Integer> inventario; 
    private List<Map.Entry<LocalDateTime, Map<String, Integer>>> pedidos;

    public SistemaCafeteriaSimple() {
        this.menu = new HashMap<>();
        this.inventario = new HashMap<>();
        this.pedidos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, double precio, int cantidad) {
        menu.put(nombre, precio);
        inventario.put(nombre, cantidad);
    }

    public boolean realizarPedido(Map<String, Integer> items) {
        
        for (var entry : items.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            
            if (!inventario.containsKey(producto)) {
                System.out.println("Error: El producto '" + producto + "' no existe.");
                return false;
            }
            
            if (inventario.get(producto) < cantidad) {
                System.out.println("Error: No hay suficiente stock de '" + producto + "'.");
                return false;
            }
        }

        pedidos.add(new AbstractMap.SimpleEntry<>(
            LocalDateTime.now(),
            new HashMap<>(items)
        ));

        for (var entry : items.entrySet()) {
            inventario.put(
                entry.getKey(),
                inventario.get(entry.getKey()) - entry.getValue()
            );
        }

        return true;
    }

    public void mostrarMenu() {
        System.out.println("\n=== MENÚ ===");
        for (var entry : menu.entrySet()) {
            System.out.printf("%s: Bs%.2f (%d disponibles)%n",
                entry.getKey(),
                entry.getValue(),
                inventario.get(entry.getKey()));
        }
    }

    public void mostrarPedidos() {
        System.out.println("\n=== PEDIDOS ===");
        for (var pedido : pedidos) {
            System.out.println("Fecha: " + pedido.getKey());
            double total = 0;
            
            for (var item : pedido.getValue().entrySet()) {
                double subtotal = menu.get(item.getKey()) * item.getValue();
                total += subtotal;
                System.out.printf("- %s x%d: Bs%.2f%n",
                    item.getKey(),
                    item.getValue(),
                    subtotal);
            }
            
            System.out.println("Total: Bs" + total + "\n");
        }
    }

    public static void main(String[] args) {
        SistemaCafeteriaSimple cafeteria = new SistemaCafeteriaSimple();

        cafeteria.agregarProducto("Café", 2.50, 100);
        cafeteria.agregarProducto("Té", 2.00, 50);
        cafeteria.agregarProducto("Pastel", 4.00, 20);

        cafeteria.mostrarMenu();

        var pedido1 = Map.of(
            "Café", 2,
            "Pastel", 1
        );
        
        var pedido2 = Map.of(
            "Té", 3,
            "Café", 1
        );

        cafeteria.realizarPedido(pedido1);
        cafeteria.realizarPedido(pedido2);

        cafeteria.mostrarMenu();
        cafeteria.mostrarPedidos();
    }
}