class Exercicio7{
    public static void main(final String[] args) {
        int x = 40;
        System.out.print(x);
        do{
        if(x%2==0){
            x /=2;
        }
        else{
            x= (3*x)+1;
        }
        System.out.printf(" -> %d",x);
        }while(x!=1);
    }
}