package exam_preparation;

public class factorial_recursive_method {

    public static long fact(long n){
        if(n <= 1){
            return 1;
        }
        else{
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(6));
    }
}
