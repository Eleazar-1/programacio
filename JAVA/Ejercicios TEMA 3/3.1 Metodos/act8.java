public class act8 {
    public static void main(String[] args) {

        String h = "22:30";
        System.out.println(horaValida(h));
        
    }

    static boolean horaValida(String h){
        String horas = h.substring(0, 2);     
        String minutos = h.substring(3, 5);  

        int hh = Integer.parseInt(horas);
        int mm = Integer.parseInt(minutos);

        if (hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59) {
        System.out.println("Hora valida");
        return true;
        }else{
            System.out.println("Hora no valida.");
            return false;
        }
        
    }
}
