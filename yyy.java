
public class yyy {
    public static void main(String[] args) {
        int a, b, result;
        String[] strings = new String[3];
        String str1 = "1+5";
        System.out.print(str1);
        System.out.print(strings[0]);
        System.out.print(strings[1]);
        System.out.print(strings[2]);

        if (str1.indexOf(43) != -1) {
            strings = str1.split("\\+", 3);
            System.out.print(strings[0]);
            System.out.print(strings[1]);
            System.out.print(strings[2]);
            if (!(strings[2].isEmpty())) System.out.print("yeah");
        }
    }
}

