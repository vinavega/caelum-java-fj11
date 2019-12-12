class TestaConta4{
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 123;
        Conta c2 = c1;

        if(c2==c1){
            System.out.println("são iguais");
        }
        else{
            System.out.println("diferentes");
        }
    }
}