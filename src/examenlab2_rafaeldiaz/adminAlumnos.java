/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_rafaeldiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class adminAlumnos {
    ArrayList <AlumnosProgra2> alumnos = new ArrayList();
    
    File archivo = null;

    public adminAlumnos(String path) {
        archivo = new File(path);
    }

    public adminAlumnos() {
    }

    public ArrayList<AlumnosProgra2> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<AlumnosProgra2> alumnos) {
        this.alumnos = alumnos;
    }

    

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminAlumnos{" + "alumnos=" + alumnos + '}';
    }

    

    
    //EXTRA MUTADOR
    public void setAlumnosProgra2(AlumnosProgra2 al){
        this.alumnos.add(al);
    }
    
    
    
    public void cargarArchivo(){
        try {
            alumnos = new ArrayList();
            AlumnosProgra2 temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp =(AlumnosProgra2)objeto.readObject())!= null){
                        alumnos.add(temp);
                        
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
                
            }
        } catch (Exception e) {}
    }
    
    public void escribirArchivo(){
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream(archivo);
            oo = new ObjectOutputStream(fo);
            for (AlumnosProgra2 al : alumnos) {
                oo.writeObject(al);
            }
            oo.flush();
        } catch (Exception e) {
        }
        try {
            oo.close();
            oo.close();
        } catch (Exception e) {
        }
}}
