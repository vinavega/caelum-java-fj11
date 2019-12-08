class Exercicio4{
    public static void main(String[] args){
        System.out.println("Fatorial de 0");
            for(int i=1;i<=40;i++){
                
                long fat =1;
            for(int x= 1;x<=i;x++){
                fat *=x;
                
            }
            System.out.printf("Fatorial de %d é %d\n",i,fat);
        }
    }
}