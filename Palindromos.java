import java.util.*;

public class Palindromos{
    public static void main(String[] args) {
        System.out.println(esPalindromo(IngresarString(args)));
    }



    public static String IngresarString(String[] args) {
        Scanner sn = new Scanner(System.in);
        String palabra;
        palabra = sn.nextLine();
        while(!palabra.matches("[a-zA-Z0-9' ']*$")) {
            System.out.println("Por favor ingrese un valor correcto");
            palabra = sn.nextLine();
        }
        sn.close();
        return palabra;
    }



    //VERSION JAVA DEL CODIGO DE JAVASCRIPT
    public static boolean esPalindromo(String cadena) {
        String cadenita= cadena.replaceAll(" +", "");
        StringBuilder stringBuilder = new StringBuilder(cadenita);
		String resultado = stringBuilder.reverse().toString();
        return cadenita.toLowerCase().equals(resultado.toLowerCase());
    }
}
