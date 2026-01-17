public class act6 {
    public static void main(String[] args) {
        int[] array = {5,6,8,9,10,5,6};

        System.out.println("El valor max es: "+valorMaximo(array));
        System.out.println("El valor min es "+valorMin(array));
    }

    static int valorMaximo(int[] max){
        int maximo = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i]>maximo) {
                maximo = max[i];
            }
        }
        return maximo;
    }

    static int valorMin(int[] min){
        int minimo = min[0];
        for (int i = 0; i < min.length; i++) {
            if (min[i]< minimo) {
                minimo = min[i];
            }
        }
        return minimo;
    }
}
