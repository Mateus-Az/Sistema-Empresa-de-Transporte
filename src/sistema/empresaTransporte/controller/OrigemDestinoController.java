/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.empresaTransporte.controller;
import java.util.List;
import sistema.empresaTransporte.codigos.models.meio.DAO.Banco;
import sistema.empresaTransporte.codigos.models.viagem.Origem;
import sistema.empresaTransporte.codigos.models.viagem.Rota;
import sistema.empresaTransporte.view.OrigemDestino;

/**
 *
 * @author brasi
 */
public class OrigemDestinoController {
    private final OrigemDestino view;

    public OrigemDestinoController(OrigemDestino view) {
        this.view = view;
    }
    
    //public void mostrarDestino(){
      //  List<Destino> destinos = Banco.destinos;
        //destinos.forEach(dest -> view.getjComboBoxDestino().addItem(dest.getDestinoString()));
        
    
    
    public void mostrarOrigens(){
        List<Origem> origens = Banco.origens;
       // List<Rota> rotas = Banco.rotas;
        origens.forEach(orig -> view.getjComboBoxOrigem().addItem(orig.getOrigemString()));
        //for(Rota rota:rotas){
          //  if(rota.getOrigem().getOrigemString().equals((String)view.getjComboBoxOrigem().getSelectedItem())){
            //    view.getjComboBoxDestino().addItem(rota.getDestino().getDestinoString());
            }
    public void mostrarOrigens1(){
        List<Rota> rotas = Banco.rotas;
        for(Rota rota : rotas){
            view.getjComboBoxOrigem().addItem(rota.getOrigem().getOrigemString());
            
        }
    }
        public void atualizaDestinos(){
           List<Rota> rotas = Banco.rotas;
            for(Rota rota:rotas){
            if(rota.getOrigem().getOrigemString().equals((String)view.getjComboBoxOrigem().getSelectedItem())){
                view.getjComboBoxDestino().addItem(rota.getDestino().getDestinoString());
            }
       }
    }
      
    public void salvarOrigemDestino() {
        String origem = (String)view.getjComboBoxOrigem().getSelectedItem();
        String destino = (String)view.getjComboBoxDestino().getSelectedItem();
        Banco.OrigemDestinoPassageiro(origem,destino);   
    }

    public void limpaCampo() {
      view.getjComboBoxDestino().removeAllItems();
      atualizaDestinos();
    }
}
