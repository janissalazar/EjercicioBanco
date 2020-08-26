import org.junit.Test;
import static org.junit.Assert.*;
public class CuentaTest {

    @Test
    public void consultarSaldoTest() {
        double totalCuenta;
        Cuenta cuenta1;
        cuenta1 = new Cuenta(500000,1800000);
        totalCuenta = cuenta1.consultarSaldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta);
        Cuenta p = new Cuenta(500000,1800000);
        double o = p.consultarSaldo();
        assertEquals(o, 1800000, 0);
    }

    @Test
    public void consignarCuentaTest() {
        double ingreso;
        Cuenta cuenta1;
        cuenta1 = new Cuenta(500000,1800000);
        ingreso = cuenta1.consignarCuenta(500000);
        System.out.println("El valor en la cuenta: " + ingreso);
        assertEquals(ingreso, 2300000, 0);
    }

    @Test
    public void retirarDineroTest() {
        double retiro;
        Cuenta cuenta1;
        cuenta1 = new Cuenta(500000,2300000);
        retiro = cuenta1.retirarDinero(500000);
        System.out.println("El valor en la cuenta: " + retiro);
        assertEquals(retiro, 1300000, 0);
    }
    @Test
    public void TransferirTest() {
        double transferir;
        Cuenta cuenta1;
        cuenta1 = new Cuenta(500000,1800000);
        transferir = cuenta1.transferirA(200000);
        System.out.println("El valor en la cuenta 1 con la transferencia es de: " + transferir);
        assertEquals(transferir, 2000000, 0);
        transferir = cuenta1.transferirde(200000);
        System.out.println("El valor en la cuenta 2con la transferencia es de: " + transferir);
        assertEquals(transferir, 1600000, 0);

    }
}
