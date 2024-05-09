public class GenricInterfaceClass {

    public void useLambFunction(){
        GroupOneFunctionalInterface<String,Integer> obj=(x)->{return x.length();};


         System.out.println("String length is: "+obj.transform("Sam Vedika"));

    }
}
