class Casa{
    String cor;
    Boolean porta1;
    Boolean porta2;
    Boolean porta3;
    void pinta(String s){
        this.cor = s;
        System.out.printf("Casa pintada de %s",s);
    }
    int quantasPortasEstaoAbertas(){
        int i=0;
        if(this.porta1){i++;}
        if(this.porta2){i++;}
        if(this.porta3){i++;}
        return i;

    }
    Boolean statusPorta(Boolean porta){
        if(porta){
            return true;
        }
        else {
            return false;
        }

    }
}