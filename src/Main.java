public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cliente.setNome("Carolina Bartoli");

        cc.depositar(100);
        cc.transferir(cp,50);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
