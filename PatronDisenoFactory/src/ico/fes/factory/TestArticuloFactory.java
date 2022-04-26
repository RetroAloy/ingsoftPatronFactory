package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author Adrian Enrique Valdivia Cabañas
 */
public class TestArticuloFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        //Pintamos el menu
        System.out.println("Digite el número del artículo que requiere:");
        System.out.println("1) IPHONE_13");
        System.out.println("2) IPHONE_13_PRO");
        System.out.println("3) COMPUTADORA_HP");
        System.out.println("4) COMPUTADORA_LENOVO");
        System.out.println("5) COMPUTADORA_APPLE");
        System.out.println("6) XIAOMI_POCO");
        System.out.println("7) XIAOMI_REDMI_NOTE");
        System.out.println("8) HUAWEI_NOTEPAD");
        System.out.println("9) IPAD");
        System.out.println("...) etc");
        
        try {
            System.out.println("Número: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número");
        }
        
        Articulo aparato = ArticuloFactory.createArticulo(eleccion);
        System.out.println(aparato.toString());
    }
}
