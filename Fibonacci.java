class Fibonacci{
    public static void main(String[] args){
        System.out.println(0);
        System.out.println(1);
        long aux1=0;
        long aux2 = 1;
        for(int i =3;i<=10;i++){
            if(aux1>aux2){
                aux2 = aux1 + aux2;
                System.out.println(aux2);
            }
            else{
                aux1 = aux2 + aux1;
                System.out.println(aux1);
            }
        }
    }
}