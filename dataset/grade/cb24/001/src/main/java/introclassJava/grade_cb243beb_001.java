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

public class grade_cb243beb_001 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_cb243beb_001 mainClass = new grade_cb243beb_001 ();
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
        FloatObj score = new FloatObj (), A = new FloatObj (), B =
            new FloatObj (), C = new FloatObj (), D = new FloatObj ();
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        A.value = scanner.nextFloat ();
        B.value = scanner.nextFloat ();
        C.value = scanner.nextFloat ();
        D.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat ();
	gr(A,B,C,D,score);
        if (true)
            return;;
    }
public void gr(FloatObj A, FloatObj B, FloatObj C, FloatObj D, FloatObj score){
        if (score.value >= A.value) {
            output += (String.format ("Student has an A grade\n"));
        } else if (score.value < A.value && score.value >= B.value) {
            output += (String.format ("Student has an B grade\n"));
        } else if (score.value < B.value && score.value >= C.value) {
            output += (String.format ("Student has and C grade\n"));
        } else if (score.value < C.value && score.value >= D.value) {
            output += (String.format ("Student has an D grade\n"));
        } else {
            output += (String.format ("Student has failed the course\n"));
        }
}
}
