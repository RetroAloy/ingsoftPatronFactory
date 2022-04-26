package ico.fes.factory;

import edu.patito.factory.Computadora;
import edu.patito.factory.Smartphone;
import edu.patito.factory.Tableta;

/**
 *
 * @author Adrian Enrique Valdivia Cabañas
 */
public class ArticuloFactory {
    public static Articulo createArticulo(int tipo){
        switch (tipo) {
            case Articulo.COMPUTADORA_APPLE:
                return new Computadora("Apple", "MacOs", "16GB", "1TB");
            case Articulo.COMPUTADORA_HP:
                return new Computadora("HP", "Windows 11", "8GB", "1TB");
            case Articulo.COMPUTADORA_LENOVO:
                return new Computadora("Lenovo", "Windows 11", "8GB", "500GB");
            case Articulo.HUAWEI_NOTEPAD:
                return new Tableta("Negro", "10 pulgadas", "5.1megapixeles", "Huawei Notepad");
            case Articulo.IPAD:
                return new Tableta("Negro", "12 pulgadas", "6.1megapixeles", "iPad");
            case Articulo.IPHONE_13:
                return new Smartphone("Apple", "6.1pulgadas", "24MPx", "Azul mate");
            case Articulo.IPHONE_13_PRO:
                return new Smartphone("Apple", "6.5pulgadas", "30MPx", "Negro");
            case Articulo.XIAOMI_POCO:
                return new Smartphone("Poco", "5.5pulgadas", "30MPx", "Azul");
            case Articulo.XIAOMI_REDMI_NOTE:
                return new Smartphone("Redmi Note", "5.5pulgadas", "30MPx", "Negro");
            default:
                throw new AssertionError();
        }
    }
}
