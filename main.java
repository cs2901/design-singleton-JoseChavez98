class Multithread implements Runnable{
    public void run(){
        ChocolateBoiler a = ChocolateBoiler.getInstance();
    }
}

public class main {

    Multithread obj = new Multithread();
    Multithread obj1 = new Multithread();
    Multithread obj2 = new Multithread();
    Multithread obj3 = new Multithread();
    Multithread obj4 = new Multithread();
}

