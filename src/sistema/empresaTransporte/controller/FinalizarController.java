/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;

import java.util.List;
import javax.swing.JOptionPane;
import sistema.empresaTransporte.codigos.models.meio.DAO.Banco;
import sistema.empresaTransporte.codigos.models.meio.Onibus;
import sistema.empresaTransporte.codigos.models.meio.Passagem;
import sistema.empresaTransporte.codigos.models.pagamento.Cartao;
import sistema.empresaTransporte.codigos.models.pagamento.Dinheiro;
import sistema.empresaTransporte.codigos.models.pagamento.Pix;
import sistema.empresaTransporte.codigos.models.pessoa.Cliente;
import sistema.empresaTransporte.view.FinalizarView;

/**
 *
 * @author brasi
 */
public class FinalizarController {

    private final FinalizarView view;

    public FinalizarController(FinalizarView view) {
        this.view = view;
    }

    public void exibeValores() {
        List<Onibus> onibus = Banco.onibus;
        Onibus bus;
        for (int a = 0; a < onibus.size(); a++) {
            bus = onibus.get(a);
            if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                    && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {
                double valor = bus.getRota().getValor();
                String valorString = String.valueOf(valor);
                view.getjLabel12ValorFinal().setText(valorString);
            }
        }
    }

    public void salvaDados() {
        if (view.getjRadioButtonPix().isSelected() || view.getjRadioButtonDinheiro().isSelected()
                || view.getjRadioButtonCartão().isSelected()) {
            String nome = view.getjTextFieldNome().getText();
            String sobrenome = view.getjTextFieldSobrenome().getText();
            String cpf = view.getjTextFieldCpf().getText();
            String idadeString = view.getjTextFieldIdade().getText();
            int idade = Integer.parseInt(idadeString);

            Cliente cliente = new Cliente(nome, sobrenome, cpf, idade);

            List<Onibus> onibus = Banco.onibus;
            Onibus bus;
            Passagem passagem = null;

            for (int a = 0; a < onibus.size(); a++) {
                bus = onibus.get(a);
                double valorOriginal = 0;
                String metodoPagamento = null;
                if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                        && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {
                    valorOriginal = bus.getRota().getValor();
                    passagem = new Passagem(cliente, bus);
                    if (view.getjRadioButtonPix().isSelected()) {
                        Pix pix = new Pix();
                        pix.descontoPagamento(bus.getRota());
                        metodoPagamento = "Pix";
                    } else if (view.getjRadioButtonCartão().isSelected()) {
                        Cartao cartao = new Cartao();
                        cartao.descontoPagamento(bus.getRota());
                        metodoPagamento = "Cartão";
                    } else if (view.getjRadioButtonDinheiro().isSelected()) {
                        Dinheiro dinheiro = new Dinheiro();
                        dinheiro.descontoPagamento(bus.getRota());
                        metodoPagamento = "Dinheiro";
                    } else {
                        System.out.println("não deu");
                    }
                    Banco.empresa.getCaixa().setSaldo(Banco.empresa.getCaixa().getSaldo() + bus.getRota().getValor());
                }
                if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                        && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {
                    Banco.passagens.add(passagem);
                    JOptionPane.showMessageDialog(null, ("Passageiro:" + nome + " " + sobrenome + "\n"
                            + "CPF: " + cpf + "\n"
                            + "Idade; " + idade + "\n"
                            + "Origem:" + bus.getRota().getOrigem().getOrigemString() + "\n"
                            + "Destino: " + bus.getRota().getDestino().getDestinoString() + "\n"
                            + "Motorista: " + bus.getMotorista().getNome() + " " + bus.getMotorista().getSobreNome() + "\n"
                            + "Assento: " + Banco.getAssentos() + "\n"
                            + "Valor original da passagem: " + valorOriginal + "\n"
                            + "Valor Pago: " + bus.getRota().getValor() + "\n"
                            + "Metodo de pagamento realizado: " + metodoPagamento));
                    Banco.limparAssentosSelecionados();
                    view.dispose();
                }
            }
        }
    }

    public void pagamento() {
        List<Onibus> onibus = Banco.onibus;
        Onibus bus;
        for (int a = 0; a < onibus.size(); a++) {
            bus = onibus.get(a);
            if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                    && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {

                if (view.getjRadioButtonPix().isSelected()) {
                    Pix pix = new Pix();
                    pix.descontoPagamento(bus.getRota());
                } else if (view.getjRadioButtonCartão().isSelected()) {
                    Cartao cartao = new Cartao();
                    cartao.descontoPagamento(bus.getRota());
                } else if (view.getjRadioButtonDinheiro().isSelected()) {
                    Dinheiro dinheiro = new Dinheiro();
                    dinheiro.descontoPagamento(bus.getRota());
                } else {
                    System.out.println("não deu");
                }
            }
        }
    }

    public void pagamentoView() {
        List<Onibus> onibus = Banco.onibus;
        Onibus bus;
        for (int a = 0; a < onibus.size(); a++) {
            bus = onibus.get(a);
            if (bus.getRota().getOrigem().getOrigemString().equals(Banco.getOrigemPassageiro())
                    && bus.getRota().getDestino().getDestinoString().equals(Banco.getDestinoPassageiro())) {

                if (view.getjRadioButtonPix().isSelected()) {
                    double valorDouble = bus.getRota().getValor() - ((bus.getRota().getValor() * 0.1) + (bus.getRota().getValor() * 0.2));
                    String valorString = String.valueOf(valorDouble);
                    double desconto = bus.getRota().getValor() - valorDouble;
                    String descontoString = String.valueOf(desconto);

                    view.getjLabel12ValorFinal().setText(valorString);
                    view.getjLabelDescontosTotais().setText(descontoString);

                } else if (view.getjRadioButtonCartão().isSelected()) {
                    double valorDouble = bus.getRota().getValor() - (bus.getRota().getValor() * 0.2) + (bus.getRota().getValor() * 0.1);
                    String valorString = String.valueOf(valorDouble);
                    double desconto = bus.getRota().getValor() - valorDouble;
                    String descontoString = String.valueOf(desconto);

                    view.getjLabel12ValorFinal().setText(valorString);
                    view.getjLabelDescontosTotais().setText(descontoString);

                } else if (view.getjRadioButtonDinheiro().isSelected()) {
                    double valorDouble = bus.getRota().getValor() - ((bus.getRota().getValor() * 0.05) + (bus.getRota().getValor() * 0.2));
                    double desconto = bus.getRota().getValor() - valorDouble;

                    String descontoString = String.valueOf(desconto);
                    String valorString = String.valueOf(valorDouble);

                    view.getjLabel12ValorFinal().setText(valorString);
                    view.getjLabelDescontosTotais().setText(descontoString);
                }
            }
        }
    }
}
