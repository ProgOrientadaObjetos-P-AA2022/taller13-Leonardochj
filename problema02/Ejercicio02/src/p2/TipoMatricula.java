/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    ArrayList<Matricula> listaMatriculas = new ArrayList<>();

    public void establecerListaMatriculas(ArrayList<Matricula> c) {
        listaMatriculas = c;
    }

    public ArrayList<Matricula> obtenerListaMatriculas() {
        return listaMatriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerListaMatriculas().size(); i++) {
            suma = suma + obtenerListaMatriculas().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma/obtenerListaMatriculas().size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
}
