import java.util.Scanner;

public class numbersToWords {

    static class Place {
        int unit;
        String name;

        public Place (int unit, String name) {
            this.unit = unit;
            this.name = name;
        }
    }

    static Place[] places = new Place[]{
        new Place(10000000, "crore"),
        new Place(100000, "lakh"),
        new Place(1000, "thousand"),
        new Place(100, "hundred")
    };

    static String[] tens = new String[]{"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    static String[] units = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    static String convertToWords(long amount){

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < places.length; i++) {
            Place place = places[i];
            int qty = (int)(amount / place.unit);
            if (qty > 0) {
                String toAdd = "";
                if (qty > 10) {
                    toAdd = convertToWords(qty)  + "-" + place.name;
                } else {
                    toAdd = units[qty] + "-" + place.name;
                }
                if (sb.length() > 0) {
                    sb.append("-");
                }
                sb.append(toAdd);
            }
            amount -= (long) qty * place.unit;
        }

        if (sb.length() > 0 && amount > 0) {
            sb.append("-and-");
        }

        int ten = (int)(amount / 10);
        boolean shouldAddAnd = false;
        if (ten > 1) {
            sb.append(tens[ten]);
            amount -= 10 * ten;
            shouldAddAnd = true;
        }

        if (amount > 0) {
            if (shouldAddAnd) {
                sb.append("-");
            }
            sb.append(units[(int)amount]);
        }

        return sb.toString();
    }

    static int isEqual(String A, String B){
        
        long amount = Long.parseLong(A);
        String converted = convertToWords(amount);

        if(converted.equals(B)) return 1;

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(isEqual(A, B));
        sc.close();
    }
}
