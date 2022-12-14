/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller.helper;

import javax.swing.JOptionPane;
import sistema.empresaTransporte.codigos.models.meio.DAO.EmpresaDAO;
import sistema.empresaTransporte.view.Login;
import sistema.empresaTransporte.view.MenuEmpresa;

/**
 *
 * @author brasi
 */
public class LoginHelper {
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    
    public Boolean conferirCredenciais() {
        String IdString = view.getCampoId().getText();
        int id = Integer.parseInt(IdString);
        String senhaString = view.getCampoSenha().getText();
        int senha = Integer.parseInt(senhaString);
        EmpresaDAO empresaDAO = new EmpresaDAO();
        return empresaDAO.verificarLogin(id,senha);
    }
}
