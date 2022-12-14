/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;

import sistema.empresaTransporte.view.Login;
import sistema.empresaTransporte.view.TelaInicial;
import sistema.empresaTransporte.view.OrigemDestino;

/**
 *
 * @author brasi
 */
public class TelaInicialController {

    private final TelaInicial view;

    public TelaInicialController(TelaInicial view) {
        this.view = view;
    }

    public void irOrigemDestino() {
        OrigemDestino origemDestino = new OrigemDestino();
        origemDestino.setVisible(true);
        view.dispose();
    }

    public void irLogin() {
        Login login = new Login();
        login.setVisible(true);
        view.dispose();
    }
}
