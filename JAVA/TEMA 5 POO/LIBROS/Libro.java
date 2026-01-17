public class Libro {

    //Membres de la clase

    //Atributs
    private String titulo;
    private String editorial;
    private int numPaginas;

    //getters setters

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial (String editorial){
        this.editorial = editorial;
    }

    public int getNumPaginas(){
        return numPaginas;
    }

    //CONSTRUCTORS

    public Libro(){
        titulo = "";
        editorial = "";
        numPaginas = 1;
    }

    public Libro(String titulo){
        this.titulo = titulo;
        this.editorial = "";
        this.numPaginas = 1;
    }

    public Libro(String titulo, String editorial, int numPaginas){
        this(titulo);
        this.editorial = editorial;
        setNumpaginas(numPaginas);
    }

    public void setNumpaginas(int numPaginas){
        if (numPaginas > 0) {
            this.numPaginas = numPaginas;
        }else{
            this.numPaginas = 1;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Editorial: "+editorial);
        System.out.println("Páginas: "+numPaginas);
    }
}