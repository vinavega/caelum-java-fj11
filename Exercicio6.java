class Exercicio6{
    public static void main(String[] args){
        System.out.println(0);
        System.out.println(1);
        long fib=0;
        long aux1=0;
        long aux2 = 1;
        for(int i =3;i<=101;i++){

             fib = aux1 + aux2;
             aux1 = aux2;
             aux2 = fib;
          System.out.println(fib);
        }
    }
}