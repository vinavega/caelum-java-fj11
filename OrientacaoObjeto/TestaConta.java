class TestaConta{
    public static void main(String[] args){
        String titular = "Victor Navega";
        String CPF = "383.724.358-39";
        String agencia = "9090";
        Conta c1 =new Conta(titular,CPF,agencia);
        Conta c2 =new Conta("JAO","figasjhgsjdagsdf","8080");
        System.out.println(c1.getAgencia());
        System.out.println(c1.getNumero());
        System.out.println(c1.getCPF());
        System.out.println(c1.getSaldo());
        System.out.println(c1.getTitular());
        System.out.println(c1.dataAbertura.getDataAbertura());
        System.out.println(c1.getQtdeContas());

        c1.consultaSaldo();
        c1.deposita(100);
        c1.saca(155);
        c1.saca(90);
        c1.consultaSaldo();
        c1.calculaRendimento();
        System.out.println(c1.getDadosConta());
        System.out.println(c2.getDadosConta());
    }
}