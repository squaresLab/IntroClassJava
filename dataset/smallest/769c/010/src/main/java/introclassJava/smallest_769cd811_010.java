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

public class smallest_769cd811_010 {
    public java.util.Scanner scanner;
    public static String output = "";

    public static void main (String[]args) throws Exception {
        smallest_769cd811_010 mainClass = new smallest_769cd811_010 ();
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
        IntObj a = new IntObj (), b = new IntObj (), c = new IntObj (), d =
            new IntObj (), x = new IntObj ();
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        a.value = scanner.nextInt ();
        b.value = scanner.nextInt ();
        c.value = scanner.nextInt ();
        d.value = scanner.nextInt ();
        smallest(a, b, c, d, x);
        if (true)
            return;;
    }

    public static void smallest(IntObj a, IntObj b, IntObj c, IntObj d, IntObj x) {
        if (a.value >= b.value) {
            x.value = b.value;
        } else {
            x.value = a.value;
        }
        if (b.value >= c.value) {
            x.value = c.value;
        }
        if (c.value >= d.value) {
            x.value = d.value;
        }
        output += (String.format ("%d is the smallest\n", x.value));

    }
}
