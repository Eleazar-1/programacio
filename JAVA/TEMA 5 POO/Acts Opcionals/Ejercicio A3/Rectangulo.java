public class Rectangulo {

    //Programa con una clase rectangulo
    //El rectangulo se representa mediante coordenadas
    //Que son cuatro double's
    double x1;
    double x2;
    double y1;
    double y2;


    public Rectangulo  (double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void mostrarCoordenadas(double x1, double y1, double x2, double y2){
        System.out.println("Coordenada 1: "+x1);
        System.out.println("Coordenada 2: "+y1);
        System.out.println("Coordenada 3: "+x2);
        System.out.println("Coordenada 4: "+y2);
    }

    public void sumaDeLados(double x1, double y1, double x2, double y2){
        System.out.println("Suma de todos los lados: "+(x1+y1+x2+y2));
    }

    public void area(double x1, double y1, double x2, double y2){
        System.out.println("Area: "+(x1+y1)*(x2+y2));
    }

}
