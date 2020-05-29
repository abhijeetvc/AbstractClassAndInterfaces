interface RBI3 {

    void withdraw();
}
interface RBI4 {
    void deposit();
}

class Icici1 implements RBI4,RBI3{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of ICICI");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of ICICI");
    }
}

class Sbi1 implements RBI4,RBI3{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of SBI");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of SBI");
    }
}

class Check1{
    public static void main(String[] args){
        Icici1 i=new Icici1();
        i.withdraw();
        i.deposit();
        Sbi1 s=new Sbi1();
        s.withdraw();
        s.deposit();
    }
}





public class InterfaceDemo {
}
