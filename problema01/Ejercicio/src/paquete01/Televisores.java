/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Televisores {

    ArrayList<Televisor> listaTelevisores = new ArrayList<>();
    private double valorTotal;
    private double televisorCaro;
    private String listaMarcas;

    public void listaTelevisores(ArrayList<Televisor> t) {
        listaTelevisores = t;
    }

    public ArrayList<Televisor> obtenerLista() {
        return listaTelevisores;
    }

    public void totalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < obtenerLista().size(); i++) {
            s = s + obtenerLista().get(i).obtenerPrecio();
        }
        valorTotal = s;
    }

    public void televisorMasCaro() {
        double s = 0;
        for (int i = 0; i < obtenerLista().size(); i++) {
           s = obtenerLista().get(i).obtenerPrecio();  
                if (obtenerLista().get(i).obtenerPrecio() > s){
                    s = obtenerLista().get(i).obtenerPrecio();
                } 
        }
        televisorCaro = s;
    }

    public void listaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < obtenerLista().size(); i++) {
            s = String.format("%s%s\n", s, obtenerLista().get(i).obtenerMarca());
        }
        listaMarcas = s;
    }

    public double obtenerTotalPrecioTvs() {
        return valorTotal;
    }
    
    public double obtenerTelevisorCaro(){
        return televisorCaro;
    }

    public String obtenerListaMarcas() {
        return listaMarcas;
    }
  
}
