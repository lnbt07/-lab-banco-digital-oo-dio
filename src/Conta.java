public abstract class Conta implements ContaInterface{
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(double valor){}
    public void depositar(double valor){}
    public void transferir(Conta contaDestino, double valor){}

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
