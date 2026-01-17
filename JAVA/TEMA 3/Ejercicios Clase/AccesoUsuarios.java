public class AccesoUsuarios {
    public static void main(String[] args) {
        verificarAcceso("admin");
        verificarAcceso("invitado");
        verificarAccesoV2("PEPE");
    }

    static boolean esUsuarioValido(String usuario){
        //Lista de usuario válidos
        String[] usuariosValidos = {"JOan", "Pepe","Admin"};

        for (String valido : usuariosValidos) {
            if (usuario.equals(valido)) {
            
            }
        }
        
        return false;

        //verificar el acceso

        

    }
    static void verificarAcceso(String usuario){
        System.out.println("Verificando acceso para "+usuario);
        if (!esUsuarioValido(usuario)) {
            System.out.println("Acceso denegado para el usuario "+usuario);
            return;
        }
        System.out.println("Acceso concedido. Bienvenido "+usuario+"!!");
    }

    static void verificarAccesoV2(String usuario){
        //comprobar si el usuario es válido
        if (esUsuarioValido(usuario)) {
            //el usuario es valido
            System.out.println("Acceso concedido "+usuario);
        }else{
            System.out.println("Acceso denegado para el usuario "+usuario);
        }
    }
}
