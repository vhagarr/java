Creating a Package
Code :-
package tool;
public class main {
    public void display(){
        System.out.println("packaging is loaded successfully ");
    }
}
Using a Package
Code:-
import tool.main;
public class myclass {
    public static void main(String[] args) {
        main obj=new main();
        obj.display();
    }
}
