package pc;

public class PILAS extends COLA{

 public void eliminar (){
     if(!estaVacia()){
         Nodo ultimo= primero;
         Nodo penultimo = null;
         while (ultimo.getSiguiente() !=null){
             penultimo = ultimo;
             ultimo = ultimo.getSiguiente();
         }
         penultimo.getSiguiente(null);
     }
 }