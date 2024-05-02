package predicate;

/*
* The next thing that you need to understand is Functional Interface.
* Functional Interface is nothing but just an interface with a "single abstract method",
* also commonly termed as SAM.
* */

interface Predicates<T>{
    boolean check(T t);
}

class TestPredicate implements Predicates<Integer>{

    @Override
    public boolean check(Integer integer) {
        return integer % 2 == 0;
    }
}



public class PredicateExample {
    public static void main(String[] args) {
        TestPredicate testPredicate = new TestPredicate();
        System.out.println(testPredicate.check(5));



    }
}

