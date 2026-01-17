public class Doctor {

    /*
        Almacenar info básica
        Nombre, edad, genero, especialidad, años experiencia
        Identificador UNICO global
        Código nóminas
    */

    //Atributos estáticos de la clase
    private static int idGlobal = 0;
    //Se incrementará cada vez que yo creo un doctor
    private static int codigoNomina = 100;

    static final int EDAD_MINIMA = 18;
    static final int EDAD_MAXIMA = 75;

    static final double PLUS_POR_GUARDIA=50.0;
    //Atributos constantes
    static final String HOSPITAL_NOMBRE = "Hospital General";
    static final double IVA = 0.21;

    //Atributos de instancia. Propis de cada doctor

    private int id;
    private String nombre;
    private String especialidad;
    private int edad;
    

    private String genero;
    private int experiencia; //Anys d'exprencia del doctor

    

    public Doctor(){
        System.out.println("Constructor por defecto. Se ha creado un doctor");
        idGlobal++;
        this.id = idGlobal;
    }

    public Doctor(String nombre, int edad, String genero, String especialidad){
        //Llamar a constructor por defecto
        this();
        this.nombre = validarNombre(nombre);
        this.edad = ajustarEdad(edad);
        this.genero = validarGenero(genero);
        this.especialidad = especialidad;
    }

    private String validarGenero(String genero){
        if (genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino")) {
            return genero;
        }else{
            System.out.println("Genero no válido. Asignando NO especificado");
            return "NO especificado";
        }
    }

    public Doctor(String nombre, int edad, String genero){
        this(nombre, edad, genero, "General");
    }
    private String validarGenerov2(String genero){
        if (genero == null || genero.trim().isEmpty()) {
            return "No especificado";
        }
        return genero;
    }

    private int ajustarEdad(int edad){
        if (edad < EDAD_MINIMA) {
            System.out.println("Eres menor de edad, no puedes ser doctor");
            return EDAD_MINIMA;
        }else if (edad > EDAD_MAXIMA) {
            System.out.println("Edad excesiva para ejercer, jubilate!");
            return EDAD_MAXIMA;
        }else{
            return edad;
        }
    }

    private String validarNombre(String nombre){
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Nombre no válido. Asigno Desconocido");
            return "Desconocido";
        }
        return nombre;
    }

    //Getters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        //this.nombre = nombre;
        this.nombre = validarNombre(nombre);
    }

    //Método estático para mostrar el ID global

    public static void mostrarIdGlobal(){
        System.out.println("ID Global del doctor: "+idGlobal);
        System.out.println("Codigo nomina actual "+codigoNomina);
    }

    //Mostrar datos
    public void mostrarDatos(){
        System.out.println("ID: "+this.id + " | Nombre; "+nombre+ ", Edad: "+edad+". Género: "+genero+", Especialidad: "+especialidad+", Años de experiencia: "+experiencia);
    }

    //Metodo privado para calcular el extra salarial por noche de guardia
    //Cada noche de guardia --> 50€

    private double calcularPlusGuardia(int nochesGuardia){
        return nochesGuardia * PLUS_POR_GUARDIA;
    }

    //Metodo para calcular nómina incluyendo el plus de guardias y aplicando el IVA

    public double calcularNomina(double salarioBase, int nochesGuardia){
        double plus = calcularPlusGuardia(nochesGuardia);
        return (salarioBase + plus);
    }

    //Getters setters

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = ajustarEdad(edad);
    }

    public int getExperencia(){
        return experiencia;
    }

    public void setExperiencia(int experiencia){
        if (experiencia >= 0 && experiencia <= edad - EDAD_MINIMA) {
            this.experiencia = experiencia;
        }else{
            System.out.println("La experiencia no es valida, debe de estar entre 0 y "+(EDAD_MINIMA)+"años");
            this.experiencia = 0;
        }
    }
}