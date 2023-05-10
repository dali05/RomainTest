import java.util.Scanner;

public class Romain {

    private final static String [] UNITE =    {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private final static String [] DIZZENE =  {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private final static String [] CENTAINE = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    private final static String [] MILlE =    {"","M","MM","MMM"};


    public static void main(String[] args) {
        System.out.println("saisir un chiffre arabe entre 1 et 3999");
        Scanner console = new Scanner(System.in);
        System.out.println("Resultat Romain : " + ArabToRomain(console.nextInt()));
    }


// 65 = 60 + 5 = LXV

    public static String  ArabToRomain(int n) {
        if (n>=0 && n<=9) return UNITE[n];
        if (n>=10 && n<=99) return DIZZENE[n / 10]+ UNITE[n % 10];
        if (n>=100 && n<=999) return CENTAINE[n / 100]+ DIZZENE[(n / 10) % 10]+ UNITE[n % 10];
        if (n>=1000 && n<=3999) return MILlE[n / 1000]+CENTAINE[(n / 100) % 10]+DIZZENE[(n / 10) % 10]+UNITE[n % 10];

        return "";
    }



}
