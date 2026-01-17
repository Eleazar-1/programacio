public class AppDoctor {
    public static void main(String[] args) {
        
        System.out.println("----Creacion de doctores--------");

        //Constructor sin parametros

        Doctor doctor1 = new Doctor();

        doctor1.setEdad(30);
        doctor1.setExperiencia(5);
        doctor1.mostrarDatos();

        double salarioBase1 = 2500;
        int nochesGuardia1 = 3;

        double nomina1 = doctor1.calcularNomina(salarioBase1, nochesGuardia1);
        System.out.println("La nomina del doctor de "+doctor1.getEdad() +" años es "+nomina1+" €");

        //Constructor con validacion de datos

        Doctor doctor2 = new Doctor("Laura", 40, "Femenino", "Criminologia");

        doctor2.setExperiencia(15);

        doctor2.mostrarDatos();

        Doctor doctor20 = new Doctor(" ", 40, "Femenino", "Cardiologia");

        doctor20.setExperiencia(15);
        doctor20.mostrarDatos();

        System.out.println("Probar limites de edad");
        System.out.println(">> Intentando crear doctor con 15 años");

        Doctor docJoven = new Doctor("Becario", 15, "Masculino", "Practicas");

        docJoven.mostrarDatos();

        // > 90 años
        
        System.out.println("Intentando crear doctor con 90 años");

        Doctor docMayor = new Doctor("Veterano", 90, "Masculino", "Traumatologia");

        docMayor.mostrarDatos();

        // 45 años
        System.out.println("Intentando crear doctor con 45 años");

        Doctor docMedio = new Doctor("Especialista", 45, "Masculino", "Neurologia");

        docMedio.mostrarDatos();

        System.out.println("\n Uso de métodos estáticos");
        Doctor.mostrarIdGlobal(); //NOMBRE DE LA CLASE METODO ESTÁTICO

        Doctor doctores[] = {doctor1, doctor2, doctor20, docJoven, docMayor, docMedio};

        System.out.println("Con un foreach");

        for (Doctor doctor : doctores) {
            doctor.mostrarDatos();
        }

        //Con un for

        for (int i = 0; i < doctores.length; i++) {
            System.out.println("Doctor "+(i+1)+": ");
            doctores[i].mostrarDatos();
        }

        System.out.println("\n FIN");
    }
}
