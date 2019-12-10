class Exercicio8{
    public static void main(String[] args){
        int valor = 0;
        for(int i=1;i<=25;i++){
            for(int j=1;j<=i;j++){
                valor = i*j;
                System.out.printf("%d ", valor);
            }
            System.out.printf("\n");
        }
    }
}