/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.meio.DAO;

import sistema.empresaTransporte.codigos.models.empresa.Empresa;

/**
 *
 * @author brasi
 */
public class EmpresaDAO {
    private final Empresa empresa;

    public EmpresaDAO() {
        empresa = Banco.empresa;
        
    }
    
    public boolean verificarLogin(int id, int senha){
        boolean correto = false;
        if(empresa.getId() == id && empresa.getSenhaDeAcesso() == senha){
            correto = true;
        }
        return correto;
    }
    
}
