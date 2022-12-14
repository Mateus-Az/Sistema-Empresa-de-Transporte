/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.pessoa;

import sistema.empresaTransporte.codigos.models.empresa.Empresa;

/**
 *
 * @author brasi
 */
public class Funcionario extends Pessoa {
    private String sexo;
    private String setor;
    private String empresa;
    

    public Funcionario(String sexo, String setor, String empresa, String nome, String sobreNome, String cpf, int idade) {
        super(nome, sobreNome, cpf, idade);
        this.sexo = sexo;
        this.setor = setor;
        this.empresa = empresa;
    }
}
