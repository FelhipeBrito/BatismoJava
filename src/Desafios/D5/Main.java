package Desafios.D5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();


        cc1.consultarSaldo();
        cc1.depositar(100);
        cc1.consultarSaldo();
        cc1.depositar(15);
        cc1.consultarSaldo();


        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.consultarSaldo();
        cp1.depositar(100);
        cp1.consultarSaldo();
        cp1.depositar(100);
        cp1.consultarSaldo();


    }
}
