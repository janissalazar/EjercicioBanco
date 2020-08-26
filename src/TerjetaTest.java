import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TerjetaTest {
    @Test
    public void consultarSaldoTarjetaDebitoest() {
        double totaltarjetaDebito;
        Tarjeta Tarjeta1;
        Tarjeta1 = new Tarjeta(600000, 1800000, 15000000);
        totaltarjetaDebito = Tarjeta1.consultarSaldoTarjetaDebtio(1800000);
        System.out.println("Total actual en la tarjeta Debito: " + totaltarjetaDebito);
        Tarjeta p = new Tarjeta(600000, 18000000, 15000000);
        double o = p.consultarSaldoTarjetaDebtio(1800000);
        assertEquals(o, 1800000, 0);
    }

    @Test
    public void consultarSaldoTarjetaCreditoTest() {
        double totaltarjetaCredito;
        Tarjeta Tarjeta1;
        Tarjeta1 = new Tarjeta(600000, 1800000, 15000000);
        totaltarjetaCredito = Tarjeta1.consultarSaldoTarjetaCredito(15000000);
        System.out.println("Total actual en la tarjeta Debito: " + totaltarjetaCredito);
        Tarjeta p = new Tarjeta(600000, 1800000, 15000000);
        double o = p.consultarSaldoTarjetaCredito(15000000);
        assertEquals(o, 15000000, 0);
    }

    @Test
    public void pagarCreditoTest() {
        double ingreso;
        Tarjeta Tarjeta1;
        Tarjeta1 = new Tarjeta(600000, 18000000, 15000000);
        ingreso = Tarjeta1.pagarCredito(600000);
        assertEquals(ingreso, 120000, 0);
    }

    @Test
    public void realizarCompraDebitoTest() {
        double retiro;
        Tarjeta Tarjeta1;
        Tarjeta1 = new Tarjeta(600000, 18000000, 15000000);
        retiro = Tarjeta1.realizarCompraDebito(1800000);
        System.out.println("El valor en la cuenta debito: " + retiro);
        assertEquals(retiro, 1200000, 0);
    }

    @Test
    public void realizarCompraCreditoTest() {
        double retirod;
        Tarjeta Tarjeta2;
        Tarjeta2 = new Tarjeta(600000,18000000,15000000);
        retirod = Tarjeta2.realizarCompraCredito(15000000);
        System.out.println("El valor en la cuenta credito: " + retirod);
        assertEquals(retirod, 14280000, 0);
    }

    }


