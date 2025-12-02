public class tienda2 {
    public static void main(String[] args) {

        // Datos del cliente
        String nombreCliente = "Ilich Ramirez";
        boolean esMiembro = true; 

        // Productos y precios (para nada sospechosos)
        String[] productos = {"carabina m4A1", "semtex", "balas perforantes 5.56", "cargador", "silenciador"};
        double[] precios =  {200.00,   5.00,   50.00,     2.80,     15.50};

        // Estado de pedido (para demo del switch)
        int estadoPedido = 2; 

        System.out.println("=== DARK STORE ===");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("------------------------------");

        // IF y else
        if (esMiembro) {
            System.out.println("Estado: Cliente con membresía activa.");
        } else {
            System.out.println("Estado: Cliente sin membresía.");
        }

        System.out.println("------------------------------");
        System.out.println("Productos comprados:");

        // Calcular total usando FOR
        double totalCompra = 0;

        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            totalCompra += precios[i]; // suma automática del total
        }

        System.out.println("------------------------------");
        System.out.println("Total de la compra: $" + totalCompra);

        // DESCUENTO AUTOMÁTICO SEGÚN PRECIO
        double descuento = 0;

        if (totalCompra >= 400) {
            descuento = 20;
        } else if (totalCompra >= 300) {
            descuento = 15;
        } else if (totalCompra >= 200) {
            descuento = 10;
        } else if (totalCompra >= 100) {
            descuento = 5;
        }

        System.out.println("Descuento aplicado: " + descuento + "%");

        double totalFinal = totalCompra - (totalCompra * descuento / 100);

        System.out.println("Total con descuento: $" + totalFinal);

        System.out.println("------------------------------");
        System.out.println("Estado del pedido:");

        //SWITCH
        switch (estadoPedido) {
            case 1:
                System.out.println("El pedido está siendo procesado.");
                break;
            case 2:
                System.out.println("El pedido ha sido enviado.");
                break;
            case 3:
                System.out.println("El pedido ha sido entregado.");
                break;
            default:
                System.out.println("Estado desconocido.");
        }

        System.out.println("------------------------------");
        System.out.println("¡Gracias por su compra!, esto NO sera investigado por la INTERPOL."); //A menos que el profesor sea un agente encubierto.
     
    }
}
