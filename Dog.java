public class Dog {
    private String name;
    private int age;
    private String color;
    private double weight;

    private Breed breed;
    private Eyes eyes;


    public Dog(String name,int age,String color, double weight){
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;

    }
    public Dog(String name, int age, String color,Breed breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }
    public Dog(String name, String color, Eyes eyes){
        this.name = name;
        this.color = color;
        this.eyes = eyes;
    }
    public void eat(){
        System.out.println(name + "is eating.");
    }
    public void bark(){
        System.out.println(name +"is barking.");
    }
    public void sleep(){
        System.out.println(name +"is sleeping.");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }


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
        System.out.println("Dog Breed:"+ Breed.Poodle);

        System.out.println("Dog Name:"+ dog3.getName());
        System.out.println("Dog Color:"+ dog3.getColor());
        System.out.println("Dog eye color is:"+ Eyes.Green);


        dog1.SetColor("grey");
        System.out.println("New color"+ dog1.getColor());
        dog2.setAge(3);
        System.out.println("Dog Age:"+ dog2.getAge());
        dog3.setWeight(154);
        System.out.println("Dog Color:"+ dog3.getWeight());


    }
}
