Class Carfactory{
static car buycar(){
        if(type.equals("bmw")) return new Bmw();
        if(type.equals("benz")) return new Benz();
        if(type.equals("audi")) return new Audi();
    }
    return null;
}}