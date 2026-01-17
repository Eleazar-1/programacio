public class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        
        this.x = x;
        this.y = y;
        
    }

    public void mostrarInfo(){
        System.out.println("Muestra de datos, la X es: "+x+" y la Y es: "+y);
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }
}
