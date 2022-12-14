/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.empresa;

/**
 *
 * @author brasi
 */
public class Caixa{
    private double saldo;

    public Caixa() {
        this.saldo = 20000;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public Double getSaldo(){
        return saldo;
    }
    
}
