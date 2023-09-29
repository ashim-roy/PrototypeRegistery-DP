package prototypeRegistry;

public class Client {

    public static void main(String[] args) {

        StudentRegistry registry  = new StudentRegistry();
        fillRegistry(registry);

        Student copy = registry.get("wed_13_sept").clone(); //copy method

        Student isCopy = registry.get("wed_13_sept_is").clone();

        System.out.println(copy);

    }

    private static void fillRegistry(StudentRegistry registry) {
        Student original = new Student();
        original.setBatch("august");
        original.setAverageBatchPsp(70);

        //filling the registery
        registry.register( "wed_13_sep", original);


        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("august");
        is.setAverageBatchPsp(70);

        //fill registery with intelligent student is
        registry.register("wed_13_sept_is", is);
    }
}


