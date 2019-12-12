class TestaConta{
    public static void main(String[] args){
        Conta c1 =new Conta();
    
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "123141-3";
        c1.saldo = 50;
        c1.dataAbertura = new Data();
        c1.dataAbertura.ano = "2020";
        c1.dataAbertura.mes = "01";
        c1.dataAbertura.dia = "02";

        c1.CPF = "383.724.358.39";

        c1.consultaSaldo();
        c1.deposita(100);
        c1.saca(155);
        c1.saca(135);
        c1.consultaSaldo();
        c1.calculaRendimento();
        System.out.println(c1.recuperaDadosParaImpressao());
    }
}