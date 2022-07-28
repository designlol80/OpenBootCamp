public class Ejercicio_2 {
    public static void main(String[] args){
        Carro miCarro=new Carro();
        miCarro.cantidaPuertas();
        miCarro.cantidaPuertas();
        System.out.println("Cantidad de puertas: "+ miCarro.puertas);
    }
}
class Carro{
    public int puertas=0;
    public void cantidaPuertas(){
        this.puertas++;
    }
}