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
public class adminRusos {
    ArrayList <Rusos> rusos = new ArrayList();
    
    File archivo = null;

    public adminRusos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Rusos> getRusos() {
        return rusos;
    }

    public void setRusos(ArrayList<Rusos> rusos) {
        this.rusos = rusos;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "adminRusos{" + "rusos=" + rusos + '}';
    }

    
    //EXTRA MUTADOR
    public void setRusos(Rusos r){
        this.rusos.add(r);
    }
    
    
    
    public void cargarArchivo(){
        try {
            rusos = new ArrayList();
            Rusos temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp =(Rusos)objeto.readObject())!= null){
                        rusos.add(temp);
                        
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
            for (Rusos r : rusos) {
                oo.writeObject(r);
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
