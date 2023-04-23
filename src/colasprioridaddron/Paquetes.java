/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasprioridaddron;

/**
 *
 * @author guill
 */
public class Paquetes implements Comparable <Paquetes> {
    private int id;
    private String dirección;
    private int prioridad;
    //private int limite;

    public Paquetes(int id, String dirección, int prioridad /**int limite*/) {
        this.id = id;
        this.dirección = dirección;
        this.prioridad = prioridad;
        //this.limite = 3;
    }    
   /* public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "El id del paquete es=" + id + 
               "\ndireccion=" + dirección + 
                "prioridad=" + prioridad + '\n';
    }
    
    @Override
    public int compareTo(Paquetes p) {
      if( prioridad > p.prioridad){
          return 1;
      }else if (prioridad < p.prioridad){
          return -1;
      }else{
          return 0;
      }
    }
    
    
}
