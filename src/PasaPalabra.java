
import java.util.Scanner;

public class PasaPalabra {

	// Crear las preguntas y las respuestas

	// CONSTANTES, DE TIPO STRING

	private static String PREGUNTA_A = "Fenómeno metereológico que se manifiesta de colores.";
	private static String PREGUNTA_E = "Animal que tiene trompa.";
	private static String PREGUNTA_I = "Porcion de tierra rodeada enteramente de agua.";
	private static String PREGUNTA_O = "Órgano de la vista.";
	private static String PREGUNTA_U = "Objeto fabricado para uso manual y doméstico.";

	private static String RESPUESTA_A = "Arcoiris";
	private static String RESPUESTA_E = "Elefante";
	private static String RESPUESTA_I = "Isla";
	private static String RESPUESTA_O = "Ojo";
	private static String RESPUESTA_U = "Utensilio";

	private static String PASAR = "Pasapalabra";

	private static int ESTADO_SIN_CONTESTAR = 0;
	private static int ESTADO_ACERTADA = 1;
	private static int ESTADO_FALLADA = 2;

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int estadoPreguntaA = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaE = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaI = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaO = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaU = ESTADO_SIN_CONTESTAR;

		int contadorAciertos = 0;
		int contadorFallos = 0;

		System.out.println("Bienvenido a Pasapalabra, ¿cuánto quieres ganar hoy?");

		String respuesta;
		do {

			// PREGUNTA A

			if (estadoPreguntaA == ESTADO_SIN_CONTESTAR) {

				System.out.println(PREGUNTA_A);
				respuesta = teclado.nextLine();

				if (respuesta.equalsIgnoreCase(PASAR)) {
					System.out.println("Siguiente pregunta");

				} else if (respuesta.equalsIgnoreCase(RESPUESTA_A)) {
					System.out.println("Acierto");
					estadoPreguntaA = ESTADO_ACERTADA;
					contadorAciertos++;

				} else {
					System.out.println("Fallo");
					estadoPreguntaA = ESTADO_FALLADA;
					contadorFallos++;
				}
			}

			// PREGUNTA E

			if (estadoPreguntaE == ESTADO_SIN_CONTESTAR) {

				System.out.println(PREGUNTA_E);
				respuesta = teclado.nextLine();

				if (respuesta.equalsIgnoreCase(PASAR)) {
					System.out.println("Siguiente pregunta");

				} else if (respuesta.equalsIgnoreCase(RESPUESTA_E)) {
					System.out.println("Acierto");
					estadoPreguntaE = ESTADO_ACERTADA;
					contadorAciertos++;

				} else {
					System.out.println("Fallo");
					estadoPreguntaE = ESTADO_FALLADA;
					contadorFallos++;
				}
			}

			// PREGUNTA I

			if (estadoPreguntaI == ESTADO_SIN_CONTESTAR) {

				System.out.println(PREGUNTA_I);
				respuesta = teclado.nextLine();

				if (respuesta.equalsIgnoreCase(PASAR)) {
					System.out.println("Siguiente pregunta");

				} else if (respuesta.equalsIgnoreCase(RESPUESTA_I)) {
					System.out.println("Acierto");
					estadoPreguntaI = ESTADO_ACERTADA;
					contadorAciertos++;
				} else {
					System.out.println("Fallo");
					estadoPreguntaI = ESTADO_FALLADA;
					contadorFallos++;
				}
			}

			// PREGUNTA O

			if (estadoPreguntaO == ESTADO_SIN_CONTESTAR) {

				System.out.println(PREGUNTA_O);
				respuesta = teclado.nextLine();

				if (respuesta.equalsIgnoreCase(PASAR)) {
					System.out.println("Siguiente pregunta");

				} else if (respuesta.equalsIgnoreCase(RESPUESTA_O)) {
					System.out.println("Acierto");
					estadoPreguntaO = ESTADO_ACERTADA;
					contadorAciertos++;
				} else {
					System.out.println("Fallo");
					estadoPreguntaO = ESTADO_FALLADA;
					contadorFallos++;
				}
			}

			// PREGUNTA U

			if (estadoPreguntaU == ESTADO_SIN_CONTESTAR) {

				System.out.println(PREGUNTA_U);
				respuesta = teclado.nextLine();

				if (respuesta.equalsIgnoreCase(PASAR)) {
					System.out.println("Siguiente pregunta");

				} else if (respuesta.equalsIgnoreCase(RESPUESTA_U)) {
					System.out.println("Acierto");
					estadoPreguntaU = ESTADO_ACERTADA;
					contadorAciertos++;
				} else {
					System.out.println("Fallo");
					estadoPreguntaU = ESTADO_FALLADA;
					contadorFallos++;
				}
			}
		} while (estadoPreguntaA == ESTADO_SIN_CONTESTAR || estadoPreguntaE == ESTADO_SIN_CONTESTAR
				|| estadoPreguntaI == ESTADO_SIN_CONTESTAR || estadoPreguntaO == ESTADO_SIN_CONTESTAR
				|| estadoPreguntaU == ESTADO_SIN_CONTESTAR);
		System.out.println("Tu número de aciertos es " + contadorAciertos);
		System.out.println("Tu número de fallos es " + contadorFallos);
	}
}
