import java.util.Scanner;

public class NSDificil {
/*
         Será entre 1 - 200
         Tenim 10 intents
         Informació adicional de cercania
         Ajustaremos el rango
         Usar for
         */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Version 4 modo dificil, (vidas, rango dinamico)");

        int secreto = (int) (Math.random()*200+1);

        int vidas = 10;

        //Variables q representa el rango de busqueda visibles para el jugador
        // Se iran mostrando mayor / menor

        int rangomin = 1;
        int rangomax = 200;
        
        //Variable semaforo para controlar si el jugador ha ganado
        boolean ganado = false;

        System.out.println("He pensado un numero entre 1 y 200");
        System.out.println("Tienes "+vidas+" intentos para adivinarlo");

        //Bucle con for se repita mientras quedan vidas y no se haya ganado

        for (int numItento = 1; numItento < vidas && !ganado; numItento++){
            // se ejecutara mientras queden vidas numIntento <= vidas
            // no haya ganado !ganado
            /*
             * Cuando el jugador acierta
             * ganado pasa a ser true
             * !ganado pasa a ser false
             * El bucle continua solo si ambas condiciones son TRUE
            */
                //MOSTRAR INFORMACION DEL INTENTO Y DEL RANGO
                System.out.printf("Intento %d/%d (rango %d ...%d)", numItento, vidas, rangomin, rangomax);

                int numeroJugador = sc.nextInt();

                //comprobar el acierto

                if (numeroJugador == secreto) {
                    System.out.println("Acertaste! El numero es: "+secreto);
                    System.out.println("Lo has logrado en "+numItento+" intentos.");
                    ganado = true;
                } else{
                    if (numeroJugador < secreto) {
                        System.out.println("El numero secreto es MAYOR");
                        if (numeroJugador >= rangomin) {
                            rangomin = numeroJugador +1;
                        } else{
                            System.out.println("El numero secreto es menor");
                            if (numeroJugador <= rangomax) {
                                rangomax = numeroJugador -1;
                            }
                        }
                    }
                }
                int diferencia = Math.abs(secreto - numeroJugador);

                //MOSTRAR UN MENSAJE SEGUN LA DISTANCIA
                if (diferencia <=10) {
                    System.out.println("Estas muy cerca.");
                } else if (diferencia <=50) {
                    System.out.println("Te estas acercando");
                } else{
                    System.out.println("estas lejos todavia");
                }
        }
        //RESULTADO FINAL
        if (!ganado) {
            System.out.println("Sin intentos. El numero era "+secreto);
        }
        sc.close();
    }
}