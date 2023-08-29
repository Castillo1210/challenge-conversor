package conversorMasa;

import javax.swing.*;

public class functionMasa {

    conversorDeMasa conversor = new conversorDeMasa();

    public void convertirMasa(double input) {
        String option = (JOptionPane.showInputDialog(null, "Seleccione el tipo de cambio a realizar", "Masa", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Kilogramos a Onzas", "De Kilogramos a Libras", "De Libras a Kilogramos", "De Libras a Onzas", "De Onzas a Kilogramos", "De Onzas a Libras"}, "Seleciona").toString());

        switch (option) {
            case "De Kilogramos a Onzas" -> conversor.kilogramosAOnzas(input);
            case "De Kilogramos a Libras" -> conversor.kilogramosALibras(input);
            case "De Libras a Kilogramos" -> conversor.librasAKilogramos(input);
            case "De Libras a Onzas" -> conversor.librasAOnzas(input);
            case "De Onzas a Kilogramos" -> conversor.onzasAKilogramos(input);
            case "De Onzas a Libras" -> conversor.onzasALibras(input);
        }
    }
}
