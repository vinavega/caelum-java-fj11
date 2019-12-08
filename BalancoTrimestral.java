class BalancoTrimestral{
    public static void main(String[] args){
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    System.out.println(gastosTrimestre);
    int mediaMensal = gastosTrimestre/3;
    System.out.println("Valor da média mensal = " + mediaMensal);
    int x=1;
    mediaMensal += x;
    System.out.println(x);
    System.out.println("Valor da média mensal = " + mediaMensal);
    }
}