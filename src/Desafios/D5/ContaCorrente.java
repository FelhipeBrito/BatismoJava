package Desafios.D5;

public class ContaCorrente extends ContaBancaria{
    private double saldo = 0.0;

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        valor = valor - (valor * 0.001);
        System.out.println("Valor de deposito: "+ valor);
        saldo += valor;
    }
}
