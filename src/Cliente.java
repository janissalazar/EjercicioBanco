public class Cliente extends Banco {
    int Identificacion;
    String Nombre;
    String Apellido;
    int Edad;
    int TiempoVidaCrediticia;
    String Ciudad;

    @Override
    public int consultarSaldo() {
        return 0;
    }

}
