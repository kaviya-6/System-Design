class Primeminister{
    private static Primeminister instance;

    private Primeminister(){
    }
    public static Primeminister getinstance(){
        if(instance==null){
            instance=new Primeminister();
        }
        return instance;
    }
}
