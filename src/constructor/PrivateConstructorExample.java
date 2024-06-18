package constructor;

/**
 * @author SanketKalode
 * @date 28-05-2024
 */

class Test{
    private String name;
    private Test(String name){
        this.name = name;
    }

    public static Test create(String name){
        return new Test(name);
    }

    void show(){
        System.out.println(name);
    }
}

public class PrivateConstructorExample {
    public static void main(String[] args) {
        Test t1 = Test.create("Test1");
        t1.show();
    }
}
