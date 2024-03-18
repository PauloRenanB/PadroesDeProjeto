package contas;

public class Conta {
    private int numero;
    private double saldo;
    public void setNumero(int x){
        this.numero = x;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double setSaldo(double x) {
        this.saldo = x;
        return x;
    }


    public boolean sacar(double valor){
        if(this.saldo > 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        this.saldo = this.saldo + valor;
        return true;
    }
}
