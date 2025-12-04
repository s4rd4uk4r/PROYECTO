import java.util.Scanner;

public class tiendaIntel {
    public static void main(String[] args) {

        // Datos del cliente
        String[] listaNombres = {"Ilich Ramirez", "Saddam Husein", "Muhammar Gadafi", "Cliente Nuevo"};
        boolean listaMembresias[] = {true, true, true, false};
        
        boolean esMiembro = false;

        Scanner teclado = new Scanner(System.in); 
        System.out.print("Ingrese nombre del cliente para verificar membresía: ");
        String nombreCliente = teclado.nextLine();

        // 3. BÚSQUEDA AUTOMÁTICA
        // Buscamos si el nombre existe en la lista y copiamos su membresía
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i].equals(nombreCliente)) {
                esMiembro = listaMembresias[i];
                break; // Ya lo encontramos, dejamos de buscar
            }
        }

        // Productos y precios (para nada sospechosos)
        String[] productos = {"carabina m4A1", "semtex", "balas perforantes 5.56", "cargador", "silenciador"};
        double[] precios =  {200.00,   5.00,   50.00,     2.80,     15.50};

        // Estado de pedido (para demo del switch)
        int estadoPedido = 2; 

        System.out.println("=== WALLMART ===");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("------------------------------");

        // IF y else
        if (esMiembro) {
            System.out.println("Estado: Cliente con membresía activa.");
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
        //Cambio. se verifica primero si es miembro.
         if (esMiembro) {

        if (totalCompra >= 400) {
            descuento = 20;
        } else if (totalCompra >= 300) {
            descuento = 15;
        } else if (totalCompra >= 200) {
            descuento = 10;
        } else if (totalCompra >= 100) {
            descuento = 5;
        }
         } 
         else {
            // Mensaje para decir que no tiene descuento
            System.out.println("(Cliente sin membresía: No aplica descuento)");
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
        System.out.println("¡Gracias por su compra!, esto NO sera investigado por la INTERPOL."); 
        //A menos que el profesor sea un agente encubierto.
       teclado.close();
    }
}

