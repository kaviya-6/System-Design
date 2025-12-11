Class Main{
    public static void main(String args[]){
        Primeminister p1=Primeminister.getinstance();
        Primeminister p2=Primeminister.getinstance();

        if(p1==p2){
            System.out.println("Same Instance");
        }    
    }
}