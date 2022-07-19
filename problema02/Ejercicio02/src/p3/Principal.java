/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.Matricula;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> listaMatriculas = new ArrayList<>();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        listaMatriculas.add(mcamp);
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        listaMatriculas.add(mcolegio);
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        listaMatriculas.add(mescuela);
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        listaMatriculas.add(mjardin);
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        listaMatriculas.add(mmaternal);
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        listaMatriculas.add(mmaternal2);
        
        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerListaMatriculas(listaMatriculas);
        tipos.establecerPromedioTarifas();
        System.out.printf("Promedio total de tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
    }
}
