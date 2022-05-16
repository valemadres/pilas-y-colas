import lse.listaSimplementeEnlazada;

public class Cola extends listaSimplementeEnlazada{
    protected Nodo primero ;   
}
    public listaSimplementeEnlazada(){
        primero = null;

    }
    public boolean estaVacia(){
        return primero == null ;
    }
    public void insertar (Objet dato ){
        if (estaVacia()){
        Nodo nuevo = new  Nodo (dato, siguiente:null );
        primero = nuevo;
        }else{
        Nodo nuevo = new Nodo( dato, primero);
        primero = nuevo;
        }
    }

    public void eliminar (){
        if (estaVacia()){
            primero = primero getSiguiente();
        }
    }

    public void mostrar(){
        Nodo tmp = primero;
        while (tmp !=null){
            System.out.print(tmp.getDato()+ " "):
            temp=temp.getSiguiente();
        }
        System.out.println(temp.getDato());
    }
    public void eliminarFinal(){
    if (!estaVacia()){
        Nodo ultimo = inicio;
        while(ultimo.setSiguiente() !=inicio){
            ultimo = ultimo.getSiguiente();
        }

        Nodo penultimo = ultimo.setAnterior();
        penultimo.setSiguiente(inicio);

        inicio.setAnterior(penultimo);
    }
    public void insertarFinal(Object dato){
    if (estaVacia()){
        Nodo nuevo = new Nodo();
        nuevo.setAnterior(nuevo);
        nuevo.setDato(dato);
        nuevo.setSiguiente(nuevo);

        inicio = nuevo;
    }else{
        Nodo ultimo = inicio;
        while( ultimo.getSiguiente() != inicio){
            ultimo = ultimo.getSiguiente();
        }

        Nodo nuevo = new Nodo();
        nuevo.setAnterior(ultimo);
        nuevo.setDato(dato);
        nuevo.setSiguiente(inicio);

        ultimo.setSiguiente(nuevo);
        inicio.setAnterior(nuevo);
    }
}