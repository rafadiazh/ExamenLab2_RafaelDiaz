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
public class adminAlemanes {
    ArrayList <Alemanes> alemanes = new ArrayList();
    
    File archivo = null;

    public adminAlemanes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alemanes> getAlemanes() {
        return alemanes;
    }

    public void setAlemanes(ArrayList<Alemanes> alemanes) {
        this.alemanes = alemanes;
    }

    

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminAlemanes{" + "alemanes=" + alemanes + '}';
    }

    

    
    //EXTRA MUTADOR
    public void setAlemanes(Alemanes a){
        this.alemanes.add(a);
    }
    
    
    
    public void cargarArchivo(){
        try {
            alemanes = new ArrayList();
            Alemanes temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp =(Alemanes)objeto.readObject())!= null){
                        alemanes.add(temp);
                        
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
            for (Alemanes a : alemanes) {
                oo.writeObject(a);
            }
            oo.flush();
        } catch (Exception e) {
        }
        try {
            oo.close();
            oo.close();
        } catch (Exception e) {
        }
    }
}
