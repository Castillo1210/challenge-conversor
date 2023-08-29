package conversorMonedas;

import javax.swing.*;

public class function {
    conversorDeMoneda moneda = new conversorDeMoneda();
    conversorDeMonedaASoles soles = new conversorDeMonedaASoles();

    public void convertirMonedas(double input) {
        String option = (JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio que desea realizar", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Soles a Dolares", "De Soles a Euros", "De Soles a Libras Esterlinas", "De Soles a Yenes", "De Soles a Wones sul-coreanos", "De Dolares a Soles", "De Euros a Soles", "De Libras Esterlinas a Soles", "De Yenes a Soles", "De Wones sul-coreanos a Soles"}, "Selecciona").toString());
        switch (option) {
            case "De Soles a Dolares" -> moneda.solesADolares(input);
            case "De Soles a Euros" -> moneda.solesAEuros(input);
            case "De Soles a Libras Esterlinas" -> moneda.solesALibrasEsterlinas(input);
            case "De Soles a Yenes" -> moneda.solesAYenes(input);
            case "De Soles a Wones sul-coreanos" -> moneda.solesAWon(input);
            case "De Dolares a Soles" -> soles.dolaresASoles(input);
            case "De Euros a Soles" -> soles.eurosASoles(input);
            case "De Libras Esterlinas a Soles" -> soles.librasASoles(input);
            case "De Yenes a Soles" -> soles.yenesASoles(input);
            case "De Wones sul-coreanos a Soles" -> soles.wonesASoles(input);
        }
    }
}
