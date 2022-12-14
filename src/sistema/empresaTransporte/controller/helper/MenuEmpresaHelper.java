/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller.helper;

import javax.swing.JOptionPane;
import sistema.empresaTransporte.codigos.models.meio.DAO.Banco;

/**
 *
 * @author brasi
 */
public class MenuEmpresaHelper {

    public void buscarSaldoEmCaixa() {
        Double saldo = Banco.empresa.getCaixa().getSaldo();
        JOptionPane.showMessageDialog(null, saldo);
    }
    
}
