/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.meio;

import sistema.empresaTransporte.codigos.models.pessoa.Cliente;

/**
 *
 * @author brasi
 */
public class Passagem {
    private Cliente cliente;
    private Onibus onibus;

    public Passagem(Cliente cliente, Onibus onibus) {
        this.cliente = cliente;
        this.onibus = onibus;
    }
   
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }
    
}
