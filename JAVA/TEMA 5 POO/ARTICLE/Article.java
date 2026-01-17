public class Article {

    //Atributs de instància

    private String cod;
    private String titulo;
    private String formato;
    private double precioAlquiler=5;
    private int contadorObjetos = 0;//NO ES ESTÁTICO

    //Atributos estáticos
    private static int contador = 0;
    public static final double IVA = 0.21;

    //Constructor por defecto

    public Article(){
        //Ess estático. Es de la clase
        contador++;
        //No es estático. Es del objeto
        contadorObjetos++;
    }

    //Constructor objetos con datos
    public Article (String cod, String titulo, String formato, double precioAlquiler){
        this.cod = cod;
        this.titulo = titulo;
        this.formato = formato;
        this.precioAlquiler = precioAlquiler;
        contador++;
        contadorObjetos++;
    }
    
    //Preu de alquiler de 1
    //Método de instancia. Necesitamos un objeto para usarlo
    double precio1(){
        return precioAlquiler*(1+IVA);
    }

    //Precio 2 dias
    double precio2(){
        double total = 2*precioAlquiler;
        return total *0.80 * (1+IVA);
    }

    //Precio Semana
    double precioSemana(){
        double total = 5 * precioAlquiler;
        return total * 0.75 * (1+IVA);
    }

    public void mostrarArticulo(){
        String tituloMostrar = (titulo == null) ? "Sin titulo" : titulo;
        System.out.println("Articulo: "+cod+" | "+tituloMostrar+" | "+formato+" | "+precioAlquiler+"€/dia");
    }

    public static void mostrarContador (){
        System.out.println("Numero de articulos creados: "+contador);
        //Pertenece a la clase, NO a los objetos
        //Se usa con nombreClase.método
    }

    public void mostrarContadorObjetos(){
        System.out.println("Número de articulos Objetos creados "+contadorObjetos);
    }

    //Getters- Agafar informació
    public String gerCod(){
        return cod;
    }

    //Setters Establir informació
    public void setCod(){
        this.cod = cod;
    }
}