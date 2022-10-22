package polymorphism;

public class Main {
    void rec(int x) {

        for(int i =0; i<x;i++) {
            System.out.println(i);
            rec(i);
            System.out.println("stop");
        }
    }

    public  static  void main(String[] args){
//        Animal dg = new Dog("dog","bow");
//       dg.sound1();
        Main obj = new Main();
        obj.rec(4);

    }
}
