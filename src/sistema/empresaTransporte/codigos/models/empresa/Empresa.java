/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.empresa;

/**
 *
 * @author brasi
 */
public class Empresa {  
    private int senhaDeAcesso;
    private int id;
    private String nome;
    private int quantidadeFuncionarios;
    Caixa caixa;

    public Empresa(int id, int senhaDeAcesso, String nome, int quantidadeFuncionarios) {
        this.senhaDeAcesso = senhaDeAcesso;
        this.id = id;
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        caixa = new Caixa();
    }

    public int getSenhaDeAcesso() {
        return senhaDeAcesso;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    
    
}
    
    