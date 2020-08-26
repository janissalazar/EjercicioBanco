public class Tarjeta extends Banco {
    double Debito;
    double Credito;
    double Numero;
    int cuenta;

    public Tarjeta(double Numero, double Credito, double Debito) {
        this.Numero = Numero = 600000;
        this.Debito = Debito = 1800000;
        this.Credito = Credito = 15000000;
    }

    public double realizarCompraDebito(double Debito) {
        System.out.println("El valor retirado para compra :" + Numero);
        if (Debito > Numero) {
            Debito = Debito - Numero;
            return Debito;
        }
        return 0;
    }
    public double realizarCompraCredito(double Credito) {
        System.out.println("El valor retirado para compra :" + Numero);
        System.out.println("En 6 coutoas con un interes del 20%");
        if (Credito > Numero) {
            Credito = Credito - (Numero+(Numero*0.2));
            return Credito;
        }
        return 0;
    }


    public double pagarCredito(double Numero) {
        double credito1=15000000;
        if(Credito > Numero){
            Credito=(Numero*0.2);
            System.out.println("El valor a pagar cada mes es:"+ Credito);
            return Credito;
        }else {
            return Numero;
        }
    }
    public double consultarSaldoTarjetaDebtio(double Debito) {
        return Debito;
    }
    public double consultarSaldoTarjetaCredito(double Credito) {
        return Credito;
    }

    @Override
    public int consultarSaldo() {
            return 0;
    }


}
