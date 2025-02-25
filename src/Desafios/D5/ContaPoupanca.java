package Desafios.D5;

public class ContaPoupanca extends ContaBancaria{
    private double saldo = 0.0;

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        //deduzir 1% do valor depositado
        valor = valor - (valor * 0.001);
        System.out.println("Valor de deposito: "+ valor);
        saldo += valor;
    }
}
