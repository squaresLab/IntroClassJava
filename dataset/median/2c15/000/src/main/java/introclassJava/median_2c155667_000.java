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

public class median_2c155667_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        median_2c155667_000 mainClass = new median_2c155667_000 ();
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
        IntObj i1 = new IntObj (), i2 = new IntObj (), i3 = new IntObj ();
        output +=
            (String.format ("Please enter 3 numbers separated by spaces > "));
        i1.value = scanner.nextInt ();
        i2.value = scanner.nextInt ();
        i3.value = scanner.nextInt ();
        output+=String.format(message(i1.value, i2.value, i3.value), calc(i1.value, i2.value, i3.value));
        /*
        if ((i1.value >= i2.value && i1.value <= i3.value)
                || (i1.value == i2.value && i1.value == i3.value)
                || (i1.value > i2.value && i1.value < i3.value)) {
            output += (String.format ("%d is the median\n", i1.value));
        } else if ((i2.value >= i1.value && i2.value <= i3.value)
                   || (i2.value == i1.value && i2.value == i3.value)
                   || (i2.value > i1.value && i2.value < i3.value)) {
            output += (String.format ("%d is the median\n", i2.value));
        } else if ((i3.value >= i2.value && i3.value <= i1.value)
                   || (i3.value == i2.value && i3.value == i1.value)
                   || (i3.value > i2.value && i3.value < i1.value)) {
            output += (String.format ("%d is the median\n", i3.value));
        }*/
        if (true)
            return;;
    }

    int calc(int i1, int i2, int i3)
    {
        if((i1>=i2&&i1<=i3)||(i1==i2&&i1==i3)||(i2>i2&&i1<i3))return i1;
        else if((i2>=i1&&i2<=i3)||(i2==i1&&i2==i3)||(i2>i1&&i2<i3))return i2;
        else if((i3>=i2&&i3<=i1)||(i3==i2&&i3==i1)||(i3>i2&&i3<i1))return i3;
        else return -1; //won't get printed
    }
    String message(int i1, int i2, int i3)
    {
        if((i1>=i2&&i1<=i3)||(i1==i2&&i1==i3)||(i2>i2&&i1<i3))return "%d is the median\n";
        else if((i2>=i1&&i2<=i3)||(i2==i1&&i2==i3)||(i2>i1&&i2<i3))return "%d is the median\n";
        else if((i3>=i2&&i3<=i1)||(i3==i2&&i3==i1)||(i3>i2&&i3<i1))return "%d is the median\n";
        else return "";
    }
}
