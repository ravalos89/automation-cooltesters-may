package AccessModifiers;

public class AccessModifier {

    public String var1 = "Access Modifier";

    public void helloWorld(){
        System.out.println("Hello World " + var1);
    }

    public void invokeHello(){
        helloWorld();
    }
}
