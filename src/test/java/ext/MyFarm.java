package ext;

public class MyFarm {
    public static void main(String[] args) {
        Cats oli = new Cats("oli");

        Dogs dog1 = new Dogs("Steysi");

        oli.eat();
        oli.say();

        dog1.eat();
        dog1.say();
        System.out.println(dog1.getname());
        dog1.setName("Maylo");
        System.out.println(dog1.getname());
        dog1.getColor();

    }

}


