package XOgame;

public class Test {
    static String name;
    static int age = 18;
    static void getAge(){
        System.out.println(18);
    }
    void getName(){
        System.out.println("kole");
    }
    Test(String name){
        this.name = name;
    }

    public static void main(String[] args) {
       Test ts = new Test("kole");
       ts.getName();
       getAge();
    }
}
