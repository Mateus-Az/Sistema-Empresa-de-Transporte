/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.viagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brasi
 */
public class Rota {
    private Origem origem;
    private Destino destino;
    private String estado;
    private String cidade;
    private int paradas;
    private double valor;
    private Date data;
    private String dataString;
    
    public Rota(String estado, String cidade) {
        this.estado = estado;
        this.cidade = cidade;
    }

    public Rota(int paradas,Origem origem, Destino destino,double valor,String data) {
        this.paradas = paradas;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.dataString = data;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Rota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Rota(Origem origem, Destino destino, int paradas) {
        this.origem = origem;
        this.destino = destino;
        this.paradas = paradas;
    }

    public double getValor() {
        return valor;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Origem getOrigem() {
        return origem;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
    public String getData() {
        return dataString;
    }
}
