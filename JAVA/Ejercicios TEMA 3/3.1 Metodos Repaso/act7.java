public class act7 {
    public static void main(String[] args) {
        int año = 2;
        System.out.println("¿Es bisiesto?: "+bisiestoOno(año));
    }

    static boolean bisiestoOno(int año){
        if (año %4==0 && año %100!=0) {
            return true;
        }else if (año %4==0 && año %100==0 && año %400==0) {
            return true;
        }else if (año %4==0 && año %100==0 && año %400!=0) {
            return false;
        }else{
            return false;
        }
    }
}
