class Conta{
     String titular;
     int numero;
     String agencia;
     double saldo;
     Data dataAbertura;
     String CPF;
     public static void main(String[] args){

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
     String recuperaDadosParaImpressao(){
         String dados = "Titular: " + this.titular;
         dados += "\n CPF: " + this.CPF;
         dados += "\n Número: " + this.numero;
         dados += "\n Agencia: " + this.agencia;
         dados += "\n Data de aberura: " + this.dataAbertura.formatada();
         dados += "\n saldo: " + this.saldo;
         return dados;
     }



}

class Data{
    String dia;
    String mes;
    String ano;
    String formatada(){
        String data = this.dia;
        data += "/" + this.mes;
        data += "/" + this.ano;
         return data;   
    }

}