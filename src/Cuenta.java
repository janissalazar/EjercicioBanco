public  class Cuenta extends Banco {
        int Numero;
        int Numero1;
        double Monto;
        double Monto2;
        int cuenta;

        public Cuenta(int Numero, double Monto) {
            this.Numero=Numero = 500000;
            this.Numero1=Numero1 = 200000;
            this.Monto=Monto = 1800000;
            this.Monto2 = Monto2 = 2000000;
        }

        public double consignarCuenta(double Numero) {
            System.out.println("El valor consignado es de :"+ Numero);
            Monto=Monto+Numero;
            return Monto;
        }

        public double retirarDinero(double Numero) {
            System.out.println("El valor a retirar es de :" + Numero);
            if (Monto > Numero) {
                Monto = Monto - Numero;
                return Monto;
            } else {
                return Numero;
            }
        }

    public double transferirA (double Numero1) {
        System.out.println("El valor a transferir es de :" + Numero1);
        if (Monto2 > Numero1) {
            Monto = Monto + Numero1;
            Monto2 = Monto2 - Numero1;
            return Monto;
        } else {
            return Monto2;
        }
    }
    public double transferirde (double Numero1) {
        if (Monto2 > Numero1) {
            Monto2 = Monto2 - Numero1;
            return Monto2;
        } else {
            return Numero;
        }
    }
            @Override
            public int consultarSaldo () {
                return (int) Monto;
            }
        }


