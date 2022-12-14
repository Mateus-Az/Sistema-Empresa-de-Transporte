/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;

import java.util.Date;
import javax.swing.JOptionPane;
import sistema.empresaTransporte.codigos.models.meio.DAO.Banco;
import sistema.empresaTransporte.codigos.models.meio.Onibus;
import sistema.empresaTransporte.codigos.models.pessoa.Motorista;
import sistema.empresaTransporte.codigos.models.viagem.Destino;
import sistema.empresaTransporte.codigos.models.viagem.Origem;
import sistema.empresaTransporte.codigos.models.viagem.Rota;
import sistema.empresaTransporte.view.MenuEmpresa;

import sistema.empresaTransporte.view.NovasRotas;

/**
 *
 * @author brasi
 */
public class NovasRotasController {
    private final NovasRotas view;

    public NovasRotasController(NovasRotas view) {
        this.view = view;
    }
    
    public void exibeMotoristas(){
        Banco.motoristas.forEach(motorista -> view.getjComboBoxMotorista().addItem(motorista.toString()));
    }
    public void salvarDados(){
        Onibus onibus = null;
        //
        String origemCity = view.getjTextFieldOrigemCity().getText();
        String origemUf = view.getjTextFieldOrigemUf().getText();
        String destinoCity = view.getTextFieldDestinoCity().getText();
        String destinoUf = view.getTextFieldDestinoUf().getText();
        String totalParadasString = view.getjTextFieldParadas().getText();
        String valorString = view.getjTextFieldValor().getText();
        String dataPartida = view.getjTextFieldData().getText();
        double valor = Double.parseDouble(valorString);
        int totalParadas = Integer.parseInt(totalParadasString);
        //
        Origem origem = new Origem(origemUf,origemCity);
        Destino destino =  new Destino(destinoUf,destinoCity);
        //
        Rota rota = new Rota(totalParadas, origem, destino, valor, dataPartida);
        //
        String motoristaString = (String)view.getjComboBoxMotorista().getSelectedItem();
        for(Motorista motorista : Banco.motoristas){
            if(motorista.toString().equals(motoristaString)){
                onibus = new Onibus(motorista, rota,Banco.empresa);   
            }
        }
     
        Banco.origens.add(origem);
        Banco.destinos.add(destino);
        Banco.rotas.add(rota);
        Banco.onibus.add(onibus);
        JOptionPane.showMessageDialog(null,"Essa nova Rota será salva" + "\n" +
                "Origem: " + origemCity + " " + origemUf + "\n" +
                "Destino: " + destinoCity + " " + destinoUf + "\n" +
                "Total Paradas: " + totalParadasString + "\n" +
                "Valor da passagem: " + "R$" + valor + "\n" +
                "Data da viagem: " + dataPartida + "\n" + 
                "Motorista dessa rota: " + motoristaString);
        MenuEmpresa menuEmpresa = new MenuEmpresa();
        menuEmpresa.setVisible(true);
        view.dispose();
    }
    
}
