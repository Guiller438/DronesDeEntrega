/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasprioridaddron;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author guill
 */
public class Drones {
    private int limite = 3;
    
    Queue <Paquetes> dron = new PriorityQueue<>();
     
    public void agregarPredefinidos(){
        dron.offer(new Paquetes(1,"2", 1));
        dron.offer(new Paquetes(1,"2", 1));
        dron.offer(new Paquetes(1,"2", 2));
    }
    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    
   
    public boolean agregarPaquete(Paquetes pa){
        for (Paquetes p : dron){
            if(p.getId() == pa.getId()){
                return false;
            }
        }
        return true;
    }
    public Drones() {    
        this.limite = 3;
    }
    
    public void agregar(Paquetes pa){
        dron.offer(pa);
    }
    
    public Paquetes desencolar() {
        return dron.remove();
    }
    
    public int size(){
        return dron.size();
    }

    @Override
    public String toString() {
        return "" + dron + '\n';
    }

}
