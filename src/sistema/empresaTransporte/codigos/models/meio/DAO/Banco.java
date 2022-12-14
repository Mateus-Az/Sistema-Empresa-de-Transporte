/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.codigos.models.meio.DAO;

import java.util.ArrayList;
import java.util.List;
import sistema.empresaTransporte.codigos.models.empresa.Empresa;
import sistema.empresaTransporte.codigos.models.meio.Onibus;
import sistema.empresaTransporte.codigos.models.meio.Passagem;
import sistema.empresaTransporte.codigos.models.pessoa.Funcionario;
import sistema.empresaTransporte.codigos.models.pessoa.Motorista;
import sistema.empresaTransporte.codigos.models.viagem.Destino;
import sistema.empresaTransporte.codigos.models.viagem.Origem;
import sistema.empresaTransporte.codigos.models.viagem.Rota;


/**
 *
 * @author brasi
 */
public class Banco {
    public static List<Motorista> motoristas;
    public static List<Funcionario> funcionarios;
    public static List<Destino> destinos;
    public static List<Origem> origens;
    public static List<Rota> rotas;
    public static Empresa empresa;
    public static List<Passagem> passagens;
    public  static List<Onibus> onibus;
    private static String o;
    private static String d;
    private static String assentos = "";
    
    public static void carregar(){
        empresa = new Empresa(110,1234,"Transportes Suli", 11);
        //
        motoristas = new ArrayList<>();
        funcionarios = new ArrayList<>();
        destinos = new ArrayList<>();
        origens = new ArrayList<>();
        rotas = new ArrayList<>();
        passagens = new ArrayList<>();
        onibus = new ArrayList<>();
        //
        Motorista motorista = new Motorista("Masculino","Motorista",empresa.getNome(),"Otávio","Mendes","235.458.425-22",39);
        Motorista motorista1 = new Motorista("Masculino","Motorista",empresa.getNome(),"Jesé","March","235.458.425-22",39);
        //
        Origem origem = new Origem("RS","Porto Alegre");
        Origem origem1 = new Origem("PR","Curitiba");
        //
        Destino destino = new Destino("SC","Florianópolis");
        Destino destino1 = new Destino("SP","São Paulo");
        //
        Rota rota = new Rota(3,origem,destino,150,"21/12/2022");
        Rota rota1 = new Rota(2,origem1,destino1,100,"24/12/2022");
        //
        Onibus bus = new Onibus(motorista,rota,empresa);
        Onibus bus1 = new Onibus(motorista1,rota1,empresa);
        //
        motoristas.add(motorista);
        motoristas.add(motorista1);
        
        rotas.add(rota);
        rotas.add(rota1);
        
        origens.add(origem);
        origens.add(origem1);
        
        destinos.add(destino);
        destinos.add(destino1);
        
        onibus.add(bus);
        onibus.add(bus1);
    }
    
    public static void OrigemDestinoPassageiro(String origem,String destino){
        o = origem;
        d = destino; 
    }
    public static String getOrigemPassageiro(){
        return o;
    }
    public static String getDestinoPassageiro(){
        return d;
    }

    public static void assentosEscolhidosPassageiro(String assentoEscolhidoString) {
        assentos += assentoEscolhidoString + " | ";
    }

    public static String getAssentos() {
        return assentos;
    }
    
    
    public static void limparAssentosSelecionados(){
        assentos = "";
    }
    
}
