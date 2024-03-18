package contas;

public class ContaInvestimento extends Conta{
    private double taxa = 0.001;
    private int prazo;
    public void setPrazo(int x){
        this.prazo = x;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo = this.saldo - (valor * this.taxa);
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(this.saldo >= 0){
            this.saldo = this.saldo + (valor * this.taxa);
            return true;
        }
        return false;
    }


    public void aplicarRendimento(){
        this.saldo = this.saldo + (this.taxa * this.prazo);
    }
}
