public class ImprimirMetodos {
    public static void main(String[] args) {
        ImprimirDocumento(null, 0, false);
    }//fin main

    static void ImprimirDocumento(String documento, int numeroCopias){
        
    }
    static void ImprimirDocumento(String documento, int numeroCopias, boolean aColor){
        System.out.println("[ATAJO] Detectada impresora con color");
        ImprimirDocumento(documento, numeroCopias, aColor,"Impresora A");
    }
    static void ImprimirDocumento(String documento, int numeroCopias, boolean aColor, 
    String impresora){
        System.out.println("INICIANDO IMPRESION");
        System.out.println("Documento: "+documento);
        System.out.println("Impresora: "+impresora);
        System.out.println("Nº Copias: "+numeroCopias);

        String modoColor = aColor ? "A color" : "Blanco y Negro";
        System.out.println("Modo: "+modoColor);
        System.out.println("IMPRESION FINALIZADA"); 
    }
}//fin classe ImprimirMetodos
