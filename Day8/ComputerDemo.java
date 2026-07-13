package Day8;

class CPU {

    CPU() {
        System.out.println("CPU Created");
    }
}

class Computer {

    CPU cpu = new CPU();

    Computer() {
        System.out.println("Computer Created");
    }
}

public class ComputerDemo {

    public static void main(String[] args) {

        Computer c = new Computer();
    }
}