class TesteCasa{
    public static void main(String[] args){
        Casa casa = new Casa();
        casa.cor = "rosa";
        casa.porta1 = false;
        casa.porta2 = false;
        casa.porta3 = false;

        System.out.printf(" Cor: %s      Porta 1: %b      Porta 2: %b     Porta 3 : %b\n",casa.cor,casa.porta1,casa.porta2,casa.porta3);
        casa.pinta("vermelho");
        System.out.printf(" Cor: %s      Porta 1: %b      Porta 2: %b     Porta 3 : %b\n",casa.cor,casa.porta1,casa.porta2,casa.porta3);
        System.out.printf("Quantidade de portas abertas: %d",casa.quantasPortasEstaoAbertas());
        if(casa.statusPorta(casa.porta1) == false ){casa.porta1=true;}
        System.out.printf(" Cor: %s      Porta 1: %b      Porta 2: %b     Porta 3 : %b\n",casa.cor,casa.porta1,casa.porta2,casa.porta3);
        casa.pinta("azul");
        System.out.printf("Quantidade de portas abertas: %d",casa.quantasPortasEstaoAbertas());
       
        System.out.printf(" Cor: %s      Porta 1: %b      Porta 2: %b     Porta 3 : %b\n",casa.cor,casa.porta1,casa.porta2,casa.porta3);
    }
}