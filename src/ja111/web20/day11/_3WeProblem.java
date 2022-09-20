package ja111.web20.day11;

public class _3WeProblem {

    //create an interface Printer : print()
    //create a concrete class FilePrinter
    //create a concrete class ConsolePrinter

    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        filePrinter.print();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.print();

        System.out.println(filePrinter instanceof Printer);
        System.out.println(consolePrinter instanceof Printer);

    }
}

interface Printer{ //super type
    void print();
}

class FilePrinter implements Printer{ //sub type

    @Override
    public void print() {
        System.out.println("FilePrinter.....");
    }
}
class ConsolePrinter implements Printer{ //subtype

    @Override
    public void print() {
        System.out.println("ConsolePrinter...");
    }
}
