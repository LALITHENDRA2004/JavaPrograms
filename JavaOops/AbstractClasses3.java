abstract class Bank {
    abstract void printInterestRate();
    abstract void printIFSC();
    abstract void printBranchName();
}

abstract class CanaraBank extends Bank {
    void printInterestRate() {
        System.out.println(7.7);
    }
}

class CanaraBank_Surampalem extends CanaraBank {
    void printInterestRate() {
        System.out.println(7.7);
    }
    void printIFSC() {
        System.out.println("CANBE4839");
    }

    void printBranchName() {
        System.out.println("Surampalem");
    }
}
public class AbstractClasses3 {
    public static void main(String[] args) {
        
    }
}
