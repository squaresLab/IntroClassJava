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

public class median_d43d3207_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_d43d3207_000 mainClass = new median_d43d3207_000 ();
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
        IntObj int1 = new IntObj (), int2 = new IntObj (), int3 = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        int1.value = scanner.nextInt ();
        int2.value = scanner.nextInt ();
        int3.value = scanner.nextInt ();
        output += (String.format ("%d is the median\n", calc(int1.value,int2.value,int3.value)));
        /*
        if ((int1.value < int2.value && int1.value > int3.value)
                || (int1.value > int2.value && int1.value < int3.value)) {
            output += (String.format ("%d is the median\n", int1.value));
        } else if ((int2.value < int3.value && int2.value > int1.value)
                   || (int2.value > int3.value && int2.value < int1.value)) {
            output += (String.format ("%d is the median\n", int2.value));
        } else {
            output += (String.format ("%d is the median\n", int3.value));
        }*/
        if (true)
            return;;
    }

    int calc(int i1, int i2, int i3)
    {
        if((i1<i2 && i1 > i3) || (i1>i2&&i1<i3)) return i1;
        else if((i2<i3&&i2>i1)||(i2>i3&&i2<i1)) return i2;
        return i3;
    }
}
