import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiFunction;

public class RambdaTest {
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("robbot");
        list.add("Lambda");
        list.add("box");
        RambdaTest a = new RambdaTest();

        Collections.sort(list, String::compareToIgnoreCase);
        System.out.println(list);
        BiFunction<Integer,String,Box<Integer, String>>  bf= Box::new;
        Box<Integer, String> b1 = bf.apply(1, "Toy");
        Box<Integer, String> b2 = bf.apply(2, "Rpbpt");
        b1.showit();
        b2.showit();


    }
}

class Box<T,U>{
    private T id;
    private U con;
    public Box(T i, U c) {
        id = i;
        con = c;
    }
    public void showit() {
        System.out.println("ID: " + id +"." + "Contents:" + con);
    }
}