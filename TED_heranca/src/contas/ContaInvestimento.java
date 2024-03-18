package contas;

public class ContaInvestimento extends Conta{
    private double taxa = this.getSaldo() * 0.001;
    private int prazo;
    public void setPrazo(int x){
        this.prazo = x;
    }

    public void aplicarRendimento(){
        setSaldo(getSaldo() + (this.taxa * this.prazo));
    }
}
