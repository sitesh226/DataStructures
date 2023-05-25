package DesignPatterns.Singelton;

public class SingletonDemo {

    public static void main(String[] args) {
        Abc.getInstance();
        Def.getInstance();

    }

}


// Lazy initialization
class Abc{
    private static Abc obj;
    private Abc(){
        System.out.println("Instance Created of class : "+getClass().getCanonicalName());
    }

    public static Abc getInstance(){
        if(obj==null){
            obj=new Abc();
        }
        return obj;
    }
}


//Early Initialization
class Def{
    private static Def obj=new Def();
    private Def(){
        System.out.println("Instance Created of class : "+getClass().getCanonicalName());
    }

    public static Def getInstance(){
        return obj;
    }
}




