/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.meio;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import sistema.empresaTransporte.codigos.models.empresa.Empresa;
import sistema.empresaTransporte.codigos.models.pessoa.Motorista;
import sistema.empresaTransporte.codigos.models.viagem.Rota;

/**
 *
 * @author brasi
 */
public class Onibus {
    private Motorista motorista;
    private Passagem passagem;
    private Date data;
    private Rota rota;
    private Empresa empresa;
    private List<String> assentos = new LinkedList<>();
    private int capacidade = 16;

    public Onibus(Motorista motorista,Passagem passagem, Date data, Rota rota, Empresa empresa) {
        this.motorista = motorista;
        this.passagem = passagem;
        this.data = data;
        this.rota = rota;
        this.empresa = empresa;
    }

    public Onibus() {
         criaAssentos();
    }

    public Onibus(Motorista motorista, Rota rota, Empresa empresa) {
        this.motorista =  motorista;
        this.rota = rota;
        this.empresa  = empresa;
        criaAssentos();
    }

    public String pegarAssentoLivre(int numeroAssento){
        return assentos.get(numeroAssento);
    }
    public int retornaNumeroAssentos(){
        return assentos.size();
    }
    
    
    public void criaAssentos(){
        for(int a = 1 ; a <= 16 ; a++){
            assentos.add(a+"");
        }
    }

    public Rota getRota() {
        return rota;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Onibus{" + "motorista=" + motorista + ", passagem=" + passagem + ", data=" + data + ", rota=" + rota + ", empresa=" + empresa + ", assentos=" + assentos + ", capacidade=" + capacidade + '}';
    }

    public Motorista getMotorista() {
        return motorista;
    }
    
    
    
}
