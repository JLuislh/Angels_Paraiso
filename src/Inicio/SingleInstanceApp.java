/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inicio;

import java.awt.Desktop;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class SingleInstanceApp {

    private static final int PORT = 1000;
    private static final LocalDate FECHA_CADUCIDAD = LocalDate.of(2026, 8, 1);
    private static final String URL_NUEVO_SISTEMA = "https://restauranteangelspos.duckdns.org/";

    public static void main(String[] args) {

        try (ServerSocket socket = new ServerSocket(PORT)) {

            LocalDate hoy = LocalDate.now();

            // Si ya llegó el 1 de agosto o después
            if (!hoy.isBefore(FECHA_CADUCIDAD)) {

                Object[] opciones = {
                    "Ir al nuevo sistema",
                    "Salir"
                };

                int opcion = JOptionPane.showOptionDialog(
                        null,
                        "Este sistema ha caducado.\n\n"
                        + "A partir del 1 de agosto deberá utilizar la nueva versión.",
                        "Sistema Caducado",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                if (opcion == 0) {
                    try {
                        Desktop.getDesktop().browse(new URI(URL_NUEVO_SISTEMA));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                System.exit(0);
            }

            // Aviso antes de la fecha de caducidad
            JOptionPane.showMessageDialog(
                    null,
                    "AVISO IMPORTANTE\n\n"
                    + "Este sistema dejará de funcionar el 1 de agosto.\n\n"
                    + "A partir de esa fecha deberá utilizar la nueva versión:\n"
                    + URL_NUEVO_SISTEMA,
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);

            iniciarAplicacion();

            synchronized (SingleInstanceApp.class) {
                try {
                    SingleInstanceApp.class.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ya existe una instancia del sistema en ejecución.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(1);
        }
    }

    private static void iniciarAplicacion() {
        Ordenes ventana = new Ordenes();
        ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}