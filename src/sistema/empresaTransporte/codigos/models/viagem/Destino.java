/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.viagem;

/**
 *
 * @author brasi
 */
public class Destino extends Rota{

    public Destino(String estado, String cidade) {
        super(estado, cidade);
    }
    public String getDestinoString(){
    return this.getEstado() + "-" + getCidade();
    }
}
