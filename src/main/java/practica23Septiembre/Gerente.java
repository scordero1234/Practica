/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica23Septiembre;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s.corderoc
 */
public class Gerente extends EmpleadoComponent {

    private List<EmpleadoComponent> listaEmpleadoComponent = new ArrayList<EmpleadoComponent>();
    public void add(EmpleadoComponent empresadComponent){
       this.listaEmpleadoComponent.add(empresadComponent);
    }
      public void delete(EmpleadoComponent empleadoComponent){
          if(listaEmpleadoComponent.size()>0)
          {
              this.listaEmpleadoComponent.remove(empleadoComponent);
          } 
    }
    @Override
    public double getSueldo() {
        double sueldoTotal=0;
       for(var list:this.listaEmpleadoComponent)
       {
           sueldoTotal+=list.getSueldo();
       }
       return  sueldoTotal;
    }

    @Override
    public void mostrarDetalle() {
      for(EmpleadoComponent lista: this.listaEmpleadoComponent)
      {
          lista.mostrarDetalle();
      }
    }
    
    public void mostrarSueldo()
    {
        for(EmpleadoComponent lista: this.listaEmpleadoComponent)
      {
          lista.mostrarDetalle();
      }
    }

    public List<EmpleadoComponent> getListaEmpleadoComponent() {
        return listaEmpleadoComponent;
    }

    public void setListaEmpleadoComponent(List<EmpleadoComponent> listaEmpleadoComponent) {
        this.listaEmpleadoComponent = listaEmpleadoComponent;
    }
    
}
