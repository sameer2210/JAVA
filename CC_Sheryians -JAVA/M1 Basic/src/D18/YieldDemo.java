package D18;

public class YieldDemo {
    public static void main(String[] args) {

        int day = 2;
        String ans = switch (day) {
            case 1 -> {
                System.out.println("monday hai bahi");
                yield "monday";                             // yield use for when we want to add multi line in case...
            }
            case 2 -> {
//                System.out.println("tuesday hai bahi ");
                yield "tuesday";                            // if comment then automatic yield hide (work only multiline)
            }
            case 3 -> "wednesday";
            case 4 -> "tuesday";
            default -> "wrong input...";
        };
        System.out.println(ans);


    }
}
