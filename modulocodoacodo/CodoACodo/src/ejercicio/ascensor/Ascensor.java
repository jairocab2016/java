package ejercicio.ascensor;

import java.util.Scanner;

public class Ascensor {

	public static void main(String[] args) throws InterruptedException {

		Scanner lector = new Scanner(System.in);
		int pisoActual = 0;
		int pisoSolicitado = 0;
		int pisoMinimo = 0;
		int pisoMaximo = 15;
		String modoViaje = "";
		
		System.out.println("<-- Programa Ascensor -->");
		System.out.printf("Pisos disponibles %s - %s\n\n", pisoMinimo, pisoMaximo);

		boolean numValido = true;

		while (numValido) {

			try {
				System.out.println("En que piso se encuentra actualmente: ");
				lector = new Scanner(System.in);
				pisoActual = lector.nextInt();

				if (pisoActual >= pisoMinimo && pisoActual <= pisoMaximo) {
					numValido = false;
				} else {
					System.out.printf("Se debe ingresar un piso dentro del rango permitido %s - %s\n\n", pisoMinimo,
							pisoMaximo);
					numValido = true;
				}

			} catch (Exception e) {

				System.out.println("Se debe ingresar un valor numerico, intentelo nuevamente\n");
			}
		}

		do {

			System.out.println("\nPara solicitar el ascensor debe ingresar una de las opciones: \n - subir\n - bajar");
			lector = new Scanner(System.in);
			modoViaje = lector.nextLine();

			if (modoViaje.equalsIgnoreCase("subir")) {

				numValido = true;
				while (numValido) {
					try {
						System.out.println("\nA que piso se dirige: ");
						lector = new Scanner(System.in);
						pisoSolicitado = lector.nextInt();

						if (pisoSolicitado >= pisoMinimo && pisoSolicitado <= pisoMaximo) {
							numValido = false;
						} else {
							System.out.printf("Se debe ingresar un piso dentro del rango permitido %s - %s\n",
									pisoMinimo, pisoMaximo);
							numValido = true;
						}
					} catch (Exception e) {
						System.out.println("Se debe ingresar un valor numerico, intentelo nuevamente");
					}
				}

				if (pisoSolicitado >= pisoMinimo && pisoSolicitado <= pisoMaximo) {

					if (pisoActual < pisoSolicitado) {

						String mensaje= "Llamando ascensor";
						System.out.print(mensaje);						
						for (int i = 0; i < 3; i++) {
							Thread.sleep(500);	
							System.out.print(".");
						}
						System.out.println();
						
						System.out.println("Abriendo puertas del ascensor");
						System.out.println("Cerrando puertas del ascensor\n");

						for (int i = pisoActual; i <= pisoSolicitado; i++) {
							System.out.println("Ascensor en piso " + i);
						}
						System.out.println("\nAbriendo puertas de ascensor");
						System.out.println("Cerrando puertas de ascensor");
						System.out.printf("El ascensor fue solicitado en el piso: %s , pisoActual: %s", pisoActual, pisoSolicitado);
						break;
					} else if (pisoActual > pisoSolicitado) {
						System.out.printf("Debes elegir la opcion bajar para ir del piso %s al %s \n", pisoActual,
								pisoSolicitado);
						modoViaje = "";
					} else {
						System.out.println("Ya se encuentra en el piso solicitado");
					}
				}
				
			}

			else if (modoViaje.equalsIgnoreCase("bajar")) {

				numValido = true;
				while (numValido) {
					try {

						System.out.println("\nA que piso se dirige: ");
						lector = new Scanner(System.in);
						pisoSolicitado = lector.nextInt();

						if (pisoSolicitado >= pisoMinimo && pisoSolicitado <= pisoMaximo) {
							numValido = false;
						} else {
							System.out.printf("Se debe ingresar un piso dentro del rango permitido %s - %s\n",
									pisoMinimo, pisoMaximo);
							numValido = true;
						}
					} catch (Exception e) {
						System.out.println("Se debe ingresar un valor numerico, intentelo nuevamente");
					}
				}

				if (pisoSolicitado >= pisoMinimo && pisoSolicitado <= pisoMaximo) {

					if (pisoActual > pisoSolicitado) {
						
						String mensaje= "Llamando ascensor";
						System.out.print(mensaje);						
						for (int i = 0; i < 3; i++) {
							Thread.sleep(500);	
							System.out.print(".");
						}
						System.out.println();						
						
						System.out.println("Abriendo puertas de ascensor");
						System.out.println("Cerrando puertas de ascensor\n");

						for (int i = pisoActual; i >= pisoSolicitado; i--) {
							System.out.println("Ascensor en piso " + i);
						}

						System.out.println("\nAbriendo puertas de ascensor");
						System.out.println("Cerrando puertas de ascensor");
						System.out.printf("El ascensor fue solicitado en el piso: %s , pisoActual: %s", pisoActual, pisoSolicitado);
					} else if (pisoActual < pisoSolicitado) {
						System.out.printf("Debes elegir la opcion subir para ir del piso %s al %s \n", pisoActual,
								pisoSolicitado);
						modoViaje = "";
					} else {
						
						System.out.println("Ya se encuentra en el piso solicitado");
					}

				}

			}

		} while (!(modoViaje.equalsIgnoreCase("subir") || modoViaje.equalsIgnoreCase("bajar")));

		lector.close();

	}

}