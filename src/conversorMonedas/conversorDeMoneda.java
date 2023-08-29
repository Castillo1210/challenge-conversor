package conversorMonedas;

import javax.swing.*;

public class conversorDeMoneda {

    public void solesADolares(double valor) {
        double monedaDolares = valor * 0.27;
        monedaDolares = (double) Math.round(monedaDolares * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolares + " dolares", "De Soles a Dolares", JOptionPane.INFORMATION_MESSAGE);
    }

    public void solesAEuros(double valor) {
        double monedaPesosChilenos = valor * 0.22;
        monedaPesosChilenos = (double) Math.round(monedaPesosChilenos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesosChilenos + " euros", "De Soles a Euros", JOptionPane.INFORMATION_MESSAGE);
    }

    public void solesALibrasEsterlinas(double valor) {
        double monedaEuros = valor * 0.25;
        monedaEuros = (double) Math.round(monedaEuros * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuros + " libras esterlinas", "De Soles a Libras Esterlinas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void solesAYenes(double valor) {
        double monedaYenes = valor * 39.64;
        monedaYenes = (double) Math.round(monedaYenes * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYenes + " yenes japoneses", "De Soles a Yenes japoneses", JOptionPane.INFORMATION_MESSAGE);
    }

    public void solesAWon(double valor) {
        double monedaWones = valor * 358.57;
        monedaWones = (double) Math.round(monedaWones * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWones + "wones sul-coreanos", "De Soles Wones sul-coreanos", JOptionPane.INFORMATION_MESSAGE);
    }
}
