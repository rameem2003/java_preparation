package exam_preparation;

// overridden_method

class super_class{
    String name ="Mahmood Hassan Rameem";

    public void printData(){
        System.out.println("Form Super Class");
        System.out.println("Name is: " + name);
    }
}



class sub_class extends super_class{
    int roll = 451638;

    public void printData(){
        System.out.println("Form Sub Class");
        System.out.println("Roll is: " + roll);
    }
}

public class overridden_method {
    public static void main(String[] args) {
        super_class super_c = new super_class();
        super_c.printData();


        sub_class sub_c = new sub_class();
        sub_c.printData();
    }
}
