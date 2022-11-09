package TruthTable;

import java.util.Scanner;

public class TypesExpress {

    Scanner input = new Scanner(System.in);

    private String valueP;
    private String valueQ;
    private String result;

    public void value() {
        System.out.println("Value of P: V or F!");
        this.valueP = input.next();
        System.out.println("Value of Q: V or F!");
        this.valueQ = input.next();
    }

    public void negate() {
        if (this.valueP.contains("V".toLowerCase())) {
            this.valueP = "F";
            System.out.println("Value ~P: " + this.valueP);
        } else {
            this.valueP = "V";
            System.out.println("Value ~P: " + this.valueP);
        }

        if (this.valueQ.contains("F".toLowerCase())) {
            this.valueQ = "V";
            System.out.println("Value ~Q: " + this.valueQ);
        } else {
            this.valueQ = "F";
            System.out.println("Value ~Q: " + this.valueQ);
        }
    }

    public void conjunction() {
        if (this.valueP.contains("V".toLowerCase()) & this.valueQ.contains("V".toLowerCase())) {
            this.result = "V";
            System.out.println("Value of P^Q: " + result);
        } else {
            this.result = "F";
            System.out.println("Value of P^Q: " + this.result);
        }
    }

    public void disjunction() {
        if (this.valueP.contains("F".toLowerCase()) & this.valueQ.contains("F".toLowerCase())) {
            this.result = "F";
            System.out.println("Value of PvQ: " + result);
        } else {
            this.result = "V";
            System.out.println("Value of PvQ: " + this.result);
        }
    }

    public void conditional() {
        if (this.valueP.contains("V".toLowerCase()) & this.valueQ.contains("F".toLowerCase())) {
            this.result = "F";
            System.out.println("Value of P->Q: " + this.result);
        } else {
            this.result = "V";
            System.out.println("Value of P->Q: " + this.result);
        }
    }

    public void biconditional() {
        if (this.valueP.contains("V".toLowerCase()) & this.valueQ.contains("V".toLowerCase())) {
            this.result = "V";
            System.out.println("Value of P<->Q: " + this.result);
        } else if (this.valueP.contains("F".toLowerCase()) & this.valueQ.contains("F".toLowerCase())) {
            this.result = "V";
            System.out.println("Value of P<->Q: " + this.result);
        } else {
            this.result = "F";
            System.out.println("Value of P<->Q: " + this.result);
        }
    }

}
