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

public class median_1c2bb3a4_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_1c2bb3a4_000 mainClass = new median_1c2bb3a4_000 ();
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
        IntObj x = new IntObj (), y = new IntObj (), z = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        x.value = scanner.nextInt ();
        y.value = scanner.nextInt ();
        z.value = scanner.nextInt ();
        if (display1(x.value,y.value,z.value)) {
            output += (String.format ("%d is the median\n", x.value));
        }
        if (display2(x.value,y.value,z.value)) {
            output += (String.format ("%d is the median\n", x.value));
        }
        if (display3(x.value,y.value,z.value)) {
            output += (String.format ("%d is the median\n", y.value));
        }
        if (true)
            return;;
    }

    boolean display1(int x, int y, int z)
    {
        return x==y;
    }

    boolean display2(int x, int y ,int z)
    {
        return x==z;
    }

    boolean display3(int x, int y, int z)
    {
        return y==z;
    }
}
