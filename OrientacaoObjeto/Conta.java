class Conta{
     private String titular;
     private int numero;
     private String agencia;
     private double saldo;
     Data dataAbertura;
     private String CPF;
     private static int qtdeContas=0;
     public static void main(String[] args){

     }
     public String getTitular(){
         return this.titular;
     }

     public double getSaldo(){
         return this.saldo;
     }

     public double getNumero(){
        return this.numero;
    }
    public String getCPF(){
        return this.CPF;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public String getQtdeContas(){
        String qtde = "\n" + this.qtdeContas;
        return qtde;
    }

    String getDadosConta(){
        String dados = "\n\n Titular: " + this.titular;
        dados += "\n CPF: " + this.CPF;
        dados += "\n Número: " + this.numero;
        dados += "\n Agencia: " + this.agencia;
        dados += "\n Data de aberura: " + this.dataAbertura.getDataAbertura();
        dados += "\n saldo: " + this.saldo;
        dados += "\n Quantidade de contas: " + this.qtdeContas;
        return dados;
    }
    
    public Conta(String titular,String CPF,String agencia){
        this.saldo = 0;
        this.titular = titular;
        this.CPF = CPF;
        this.agencia  = agencia;
        this.numero = qtdeContas+1;
        this.dataAbertura = new Data();
        qtdeContas++;
        
    }
    void saca(double valor){
         if(this.saldo-valor<=0){
            System.out.printf("\nA conta não possui saldo suficiente");
         }
        else{
            this.saldo-=valor;
            System.out.printf("\nO valor de %f foi sacado",valor);
        }
     }
     void deposita(double valor){
         this.saldo= this.saldo + valor;
         System.out.printf("\nForam adicionados %f na conta, saldo atual é %f",valor,this.saldo);
     }
     void consultaSaldo(){
        System.out.printf("\nO saldo atual é %f",this.saldo);
     }
     void calculaRendimento(){
         double rendimento = this.saldo*0.1;
         System.out.printf("o rendimento é = %f",rendimento);
     }




}

class Data{
    private String dia;
    private String mes;
    private String ano;
    String getDataAbertura(){
        String data = this.dia;
        data += "/" + this.mes;
        data += "/" + this.ano;
         return data;   
    }
    public Data(){
        this.dia="18";
        this.mes="12";
        this.ano="2019";

    }

}