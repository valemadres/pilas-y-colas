import lse.listaSimplementeEnlazada;

public class Cola extends listaSimplementeEnlazada{

    public void insertar (Objet dato ){
        if (estaVacia()){
        Nodo nuevo = new  Nodo (dato, siguiente:null );
        primero = nuevo;
        }else{
            Nodo ultimo  = primero;
            while(ultimo.getSiguiente() !=null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo =) new Nodo ( dato, siguiente:null);
            ultimo.setSiguiente(nuevo);
        }
    }
}