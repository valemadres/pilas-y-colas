public class Main{
    public static void main(String[] args) {
        PILAS pila = new  pila();
        System.out.println(pila.estaVacia());

        for (int i = 1 ; i <=5; i++){
            pila.insertar(i);
        }
        pila.mostrar(); 
        pila.eliminar();
        pila.eliminar();
        pila.mostrar();
    }
}