
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IPToDomain.java
 * 
 * Clase que intenta convertir  de ip a un nombre de dominio con 2 metodos para asegurar el proceso.
 * 
 * Fecha: 26-Enero-2016
 * 
 * 
 * @author José Antonio Pino Ocampo
 *
 */
public class IPToDomain {
	private final static String IP = "200.13.53.22";

	public static void main(String[] args) {
		try {
			InetAddress lochost = InetAddress.getByName(IP);
			System.out.println(lochost.getCanonicalHostName());
			System.out.println(lochost.getHostName());
		} catch (UnknownHostException e) {
			System.err.println("Lo intentamos, pero no pudo funcionar. Detalles del error: ");
			e.printStackTrace();
		}
	}
}