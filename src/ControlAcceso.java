
import java.util.HashMap;
import java.util.Scanner;
public class ControlAcceso {
        public static void main(String[] args) {
            HashMap<String, String> usuarios = new HashMap<String, String>();
            usuarios.put("usuario1", "clave1");
            usuarios.put("usuario2", "clave2");
            usuarios.put("usuario3", "clave3");
            usuarios.put("usuario4", "clave4");
            usuarios.put("usuario5", "clave5");

            Scanner scanner = new Scanner(System.in);
            int intentosRestantes = 4;

            while (intentosRestantes > 0) {
                System.out.print("Introduzca el nombre de usuario: ");
                String nombreUsuario = scanner.nextLine();

                System.out.print("Introduzca la contraseña: ");
                String clave = scanner.nextLine();

                if (usuarios.containsKey(nombreUsuario) && usuarios.get(nombreUsuario).equals(clave)) {
                    System.out.println("Ha accedido aceptado.");
                    return;
                } else {
                    intentosRestantes--;
                    System.out.println("Nombre de usuario o contraseña incorrectos. Intentos restantes: " + intentosRestantes);
                }
            }

            System.out.println("Lo siento, no tiene acceso al área restringida.");
        }
    }


