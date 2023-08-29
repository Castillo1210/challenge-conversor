package conversorMonedas;

import javax.swing.*;

public class conversorDeMonedaASoles {

    public void dolaresASoles(double valor) {
        double monedaSoles = valor * 3.65;
        monedaSoles = (double) Math.round(monedaSoles * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaSoles + " soles", "De Dolares a Soles", JOptionPane.INFORMATION_MESSAGE);
    }

    public void eurosASoles(double valor) {
        double monedaSoles = valor * 3.99;
        monedaSoles = (double) Math.round(monedaSoles * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaSoles + " soles peruanos", "De Euros a Soles", JOptionPane.INFORMATION_MESSAGE);
    }

    public void librasASoles(double valor) {
        double monedaSoles = valor * 4.65;
        monedaSoles = (double) Math.round(monedaSoles * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaSoles + " soles peruanos", "De Libras Esterlinas a Soles", JOptionPane.INFORMATION_MESSAGE);
    }

    public void yenesASoles(double valor) {
        double monedaSoles = valor * 0.025;
        monedaSoles = (double) Math.round(monedaSoles * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaSoles + " soles peruanos", "De Yenes japoneses a Soles", JOptionPane.INFORMATION_MESSAGE);
    }

    public void wonesASoles(double valor) {
        double monedaSoles = valor * 0.0028;
        monedaSoles = (double) Math.round(monedaSoles * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaSoles + " soles peruanos", "De Wones sul-coreanos a Soles", JOptionPane.INFORMATION_MESSAGE);
    }
}
