class TestePessoa{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.idade = 5;
        pessoa1.nome = "Victor";
        System.out.printf("nome: %s Idade: %d\n",pessoa1.nome,pessoa1.idade);
        pessoa1.fazAniversario();
        System.out.printf("nome: %s Idade: %d\n",pessoa1.nome,pessoa1.idade);
        pessoa1.fazAniversario();
        System.out.printf("nome: %s Idade: %d\n",pessoa1.nome,pessoa1.idade);
    }
}