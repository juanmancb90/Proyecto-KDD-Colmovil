/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDatos;

/**
 *
 * @author User
 */
public class controladorDatos {
    
    public controladorDatos(){}
    
    public String[] getNombreSerie(String[] data){
        String[] rts = new String[data.length];
        for(int i = 0; i < data.length; i++){
            rts[i] = data[i];
            System.out.print(rts[i]);
        }
        
        return rts;
    }
    
    public int[] getDataSerie(int[] valor){
        int[] rts = new int[valor.length];
        
        for(int j = 0;j < valor.length; j++){
            rts[j] = valor[j];
            System.out.print(rts[j]);
        }
        
        return rts;
    }
    
    public String[] getIdentificadoresTorta(String titulo){
        String[] rts = new String[1];
        
        rts[0] = titulo;
        
        return rts;

    }
}