package conversorMasa;

import javax.swing.*;

public class conversorDeMasa {
    public void kilogramosAOnzas(double valor) {
        double masaOnzas = valor * 35.274;
        masaOnzas = (double) Math.round(masaOnzas * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Son " + masaOnzas + " Onzas", "De Kilogramos a Onzas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void kilogramosALibras(double valor) {
        double masaLibras = valor * 2.205;
        masaLibras = (double) Math.round(masaLibras * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Son " + masaLibras + " Libras", "De Kilogramos a Libras", JOptionPane.INFORMATION_MESSAGE);
    }

    public void librasAKilogramos(double valor) {
        double masaKilos = valor / 2.205;
        masaKilos = (double) Math.round(masaKilos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Son " + masaKilos + " Kilogramos", "De Libras a Kilogramos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void librasAOnzas(double valor) {
        double masaOnzas = valor * 16;
        masaOnzas = (double) Math.round(masaOnzas * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Son " + masaOnzas + " Onzas", "De Libras a Onzas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void onzasAKilogramos(double valor) {
        double masaKilos = valor / 35.274;
        masaKilos = (double) Math.round(masaKilos * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Son " + masaKilos + " Kilogramos", "De Onzas a Kilogramos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void onzasALibras(double valor) {
        double masaLibras = valor / 16;
        masaLibras = (double) Math.round(masaLibras * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Son " + masaLibras + " Libras", "De Onzas a Libras", JOptionPane.INFORMATION_MESSAGE);
    }
}
