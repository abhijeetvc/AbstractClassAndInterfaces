interface RBI1 {

     void withdraw();

}

interface RBI2 extends RBI1{
    void deposit();
}

class Icici implements RBI2{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of ICICI");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of ICICI");
    }
}

class Sbi implements RBI2{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of SBI");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of SBI");
    }
}

class Check{
    public static void main(String[] args){
        Icici i=new Icici();
        i.withdraw();
        i.deposit();
        Sbi s=new Sbi();
        s.withdraw();
        s.deposit();
    }
}