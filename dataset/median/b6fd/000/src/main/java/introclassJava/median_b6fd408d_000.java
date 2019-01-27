package introclassJava;

class IntObj {
    public int value;
    public IntObj () {
    } public IntObj (int i) {
        value = i;
    }
}

class FloatObj {
    public float value;
    public FloatObj () {
    } public FloatObj (float i) {
        value = i;
    }
}

class LongObj {
    public long value;
    public LongObj () {
    } public LongObj (long i) {
        value = i;
    }
}

class DoubleObj {
    public double value;
    public DoubleObj () {
    } public DoubleObj (double i) {
        value = i;
    }
}

class CharObj {
    public char value;
    public CharObj () {
    } public CharObj (char i) {
        value = i;
    }
}

public class median_b6fd408d_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_b6fd408d_000 mainClass = new median_b6fd408d_000 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        IntObj n1 = new IntObj (), n2 = new IntObj (), n3 = new IntObj (), temp =
            new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        n1.value = scanner.nextInt ();
        n2.value = scanner.nextInt ();
        n3.value = scanner.nextInt ();
        median(n1, n2, n3, temp);
        output += (String.format ("%d is the median\n", n2.value));
        if (true)
            return;;
    }

    public void median(IntObj n1, IntObj n2, IntObj n3, IntObj temp) {
        if (n2.value < n1.value) {
            temp.value = n2.value;
            n2.value = n1.value;
            n1.value = temp.value;
        }
        if ((n3.value < n2.value) && (n3.value > n1.value)) {
            temp.value = n2.value;
            n2.value = n3.value;
            n3.value = temp.value;
        }
    }
}
