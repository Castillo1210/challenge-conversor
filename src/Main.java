import conversorMasa.functionMasa;
import conversorMonedas.function;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        function conversorMoneda = new function();
        functionMasa conversorMasa = new functionMasa();
        boolean estado = true;

        try {
            while (estado) {
                String opciones = (JOptionPane.showInputDialog(null, "Elija el conversor", "Conversor de unidades", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de moneda", "Conversor de masa"}, "Selecciona").toString());
                switch (opciones) {
                    case "Conversor de moneda":
                        String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a convertir");
                        if (validarNumero(input)) {
                            double x = Double.parseDouble(input);
                            conversorMoneda.convertirMonedas(x);

                            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                            if (JOptionPane.OK_OPTION == respuesta) {
                                System.out.println("Selecciona opción afirmativa");
                            } else {
                                JOptionPane.showMessageDialog(null, "Programa terminado");
                                estado = false;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Valor ingresado invalido", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case "Conversor de masa":
                        input = JOptionPane.showInputDialog("Ingrese el valor de la masa a convertir");
                        if (validarNumero(input)) {
                            double x = Double.parseDouble(input);
                            conversorMasa.convertirMasa(x);

                            int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar");
                            if (JOptionPane.OK_OPTION == respuesta) {
                                System.out.println("Selecciona opcion afirmativa");
                            } else {
                                JOptionPane.showMessageDialog(null, "Programa terminado");
                                estado = false;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Valor ingresado invalido", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                }
            }
        } catch (NullPointerException e) {
            System.exit(0);
        }
    }

    public static boolean validarNumero(String input) {
        try {
            Double.parseDouble(input);
            return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}