public abstract class Animal {

    //Non abstract
    void eat(){
        System.out.println("In eat method of Animal class");
    }

//    void run(){
//        System.out.println("All animals run");
//    }

    abstract void run();

}

class Tortoise extends Animal{

    @Override
    void run() {
        System.out.println("Tortoise runs very slow");
    }
}

class Dog extends Animal{

    public static void main(String[] args){
       Dog d=new Dog();
       d.run();
       d.eat();
    }

    @Override
    void run() {
        System.out.println("Dog runs fast");
    }
}
