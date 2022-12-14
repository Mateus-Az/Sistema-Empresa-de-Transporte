/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.pagamento;

import sistema.empresaTransporte.codigos.models.viagem.Rota;

/**
 *
 * @author brasi
 */
public class Cartao extends Pagamento{

    @Override
    public void descontoPagamento(Rota rota) {
        rota.setValor(rota.getValor() + (rota.getValor()*0.08));
    }
    
}
