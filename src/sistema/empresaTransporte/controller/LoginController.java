/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;

import javax.swing.JOptionPane;
import sistema.empresaTransporte.controller.helper.LoginHelper;
import sistema.empresaTransporte.view.Login;
import sistema.empresaTransporte.view.MenuEmpresa;

/**
 *
 * @author brasi
 */
public class LoginController {
    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        helper = new LoginHelper(view);
    }

    
    
    

    public void verificarLogin() {
        Boolean correta = helper.conferirCredenciais();
        if(correta){
            MenuEmpresa menuEmpresa = new MenuEmpresa();
            menuEmpresa.setVisible(true);
            this.view.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Erro, Password ou Id incorretos");  
        }
    }
}

