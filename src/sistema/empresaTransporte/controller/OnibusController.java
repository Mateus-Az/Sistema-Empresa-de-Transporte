/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;

import java.util.List;
import javax.swing.JOptionPane;
import sistema.empresaTransporte.codigos.models.meio.DAO.Banco;
import sistema.empresaTransporte.codigos.models.meio.Onibus;
import sistema.empresaTransporte.view.OnibusView;

/**
 *
 * @author brasi
 */
public class OnibusController {

    private final OnibusView view;

    public OnibusController(OnibusView view) {
        this.view = view;
    }

    public void exibirAssentosDatasLivres() {
        List<Onibus> onibus = Banco.onibus;
        Onibus bus;
        for (int a = 0; a < onibus.size(); a++) {
            bus = onibus.get(a);
            if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                    && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {
                view.getjComboBoxData().addItem(bus.getRota().getData());
                for (int z = 0; z < bus.retornaNumeroAssentos(); z++) {
                    view.getComboBoxAsssentos().addItem(bus.pegarAssentoLivre(z));
                }
            }
        }
    }

    public void salvarDados() {

        List<Onibus> onibus = Banco.onibus;
        Onibus bus;
        for (int a = 0; a < onibus.size(); a++) {
            bus = onibus.get(a);
            if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                    && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {
                if (bus.getCapacidade() > 0) {
                    String assentoEscolhidoString = (String) view.getComboBoxAsssentos().getSelectedItem();
                    Banco.assentosEscolhidosPassageiro(assentoEscolhidoString);
                    view.getComboBoxAsssentos().removeItem(assentoEscolhidoString);
                    bus.setCapacidade(bus.getCapacidade() - 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Passagens Esgotadas");
                }
            }
        }
    }

    public boolean salvarDados1() {
        List<Onibus> onibus = Banco.onibus;
        Onibus bus = onibus.get(0);
        System.out.println(bus.getRota().getOrigem().getOrigemString());
        System.out.println(Banco.getOrigemPassageiro());
        //return Banco.getOrigemPassageiro().equals(bus.getRota().getOrigem().getOrigemString());
        return Banco.getDestinoPassageiro().equals(bus.getRota().getDestino().getDestinoString());
    }
}
