/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.pessoa;

/**
 *
 * @author brasi
 */
public class Motorista extends Funcionario{

    public Motorista(String sexo, String setor, String empresa,String nome, String sobreNome, String cpf, int idade) {
        super(sexo, setor, empresa,nome, sobreNome, cpf, idade);
    }

    @Override
    public String toString() {
        return this.getNome() + " " +  getSobreNome();
    }
    
    
    
}
