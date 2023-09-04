public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("snoopy",4,"brown",133);
        dog1.eat();
        Dog dog2= new Dog("spot",6,"black",Breed.Poodle);
        dog2.sleep();
        Dog dog3= new Dog("wolf","white",Eyes.Green);
        dog3.bark();

        System.out.println("Dog Name:"+ dog1.getName());
        System.out.println("Dog Age:"+ dog1.getAge());
        System.out.println("Dog Color:"+ dog1.getColor());
        System.out.println("Dog Weight:"+ dog1.getWeight());

        System.out.println("Dog Name:"+ dog2.getName());
        System.out.println("Dog Age:"+ dog2.getColor());
        System.out.println("Dog Color:"+ dog2.getAge());


        System.out.println("Dog Name:"+ dog3.getName());
        System.out.println("Dog Color:"+ dog3.getColor());

    }

}
