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

public class grade_95362737_013 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        grade_95362737_013 mainClass = new grade_95362737_013 ();
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
        FloatObj a = new FloatObj (), b = new FloatObj (), c =
            new FloatObj (), d = new FloatObj (), score = new FloatObj ();
        CharObj grade = new CharObj() ;
        output +=
            (String.format
             ("Enter thresholds for A, B, C, D\nin that order, decreasing percentages > "));
        a.value = scanner.nextFloat ();
        b.value = scanner.nextFloat ();
        c.value = scanner.nextFloat ();
        d.value = scanner.nextFloat ();
        output +=
            (String.format ("Thank you. Now enter student score (percent) >"));
        score.value = scanner.nextFloat ();
        grade(a, b, c, d, score, grade);
        if (true)
            return;;
    }

    public void grade (FloatObj a, FloatObj b, FloatObj c, FloatObj d, FloatObj score, CharObj grade) {
        if (score.value >= a.value) {
            output += (String.format ("Student has a A grade\n"));
            grade.value = 'A';
        } else if (score.value >= b.value && score.value < a.value) {
            output += (String.format ("Student has a B grade\n"));
            grade.value = 'B';
        } else if (score.value >= c.value && score.value < b.value) {
            output += (String.format ("Student has a C grade\n"));
            grade.value = 'C';
        } else if (score.value >= d.value && score.value < c.value) {
            output += (String.format ("Student has a D grade\n"));
            grade.value = 'D';
        } else {
            output += (String.format ("Student has failed the course\n"));
            grade.value = 'F';
        }

    }
}
