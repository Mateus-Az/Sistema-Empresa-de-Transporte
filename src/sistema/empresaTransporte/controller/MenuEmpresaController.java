/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;
import javax.swing.JOptionPane;
import sistema.empresaTransporte.codigos.models.meio.DAO.Banco;
import sistema.empresaTransporte.codigos.models.pessoa.Motorista;
import sistema.empresaTransporte.codigos.models.viagem.Destino;
import sistema.empresaTransporte.codigos.models.viagem.Origem;
import sistema.empresaTransporte.controller.helper.MenuEmpresaHelper;
import sistema.empresaTransporte.view.MenuEmpresa;
import sistema.empresaTransporte.view.NovasRotas;

/**
 *
 * @author brasi
 */
public class MenuEmpresaController {
    private final MenuEmpresa view;
    private final MenuEmpresaHelper helper;

    public MenuEmpresaController(MenuEmpresa view) {
        this.view = view;
        helper = new MenuEmpresaHelper();
    }

    public void irAdicionarRotas() {
        NovasRotas novasRotas = new NovasRotas();
        novasRotas.setVisible(true);
        view.dispose();
    }

    public void exibeSaldoEmCaixa() {
        helper.buscarSaldoEmCaixa();
    }

    public void exibeMotoristas(){
        String motoristas = "";
        for(Motorista motorista:Banco.motoristas){
            motoristas += motorista.getNome() + "\n";
        }
        JOptionPane.showMessageDialog(null,motoristas);           
    }
    public void exibeOrigens(){
        String origens = "";
        for(Origem origem : Banco.origens){
            origens += origem.getOrigemString() + "\n";
        }
        JOptionPane.showMessageDialog(null,origens);
    }
    public void exibeDestinos(){
        String destinos = "";
        for(Destino destino : Banco.destinos){
            destinos += destino.getDestinoString()+ "\n";
        }
        JOptionPane.showMessageDialog(null,destinos);
    }
}
    
 