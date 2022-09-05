
package exam_preparation;

class method_over{
    void sum(int a, int b){
        int result = a + b;
        System.out.println("a + b = " + result);
    }
    
    void sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println("a + b + c = " + result);
    }  

    void sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        System.out.println("a + b + c + d = " + result);
    }  
}

public class method_overloading {
    // Method Overloading
    public static void main(String[] args) {
        method_over obj = new method_over();
        
        obj.sum(10, 20);
        obj.sum(20, 30, 40);
        obj.sum(20, 30, 40, 50);
    }
}
