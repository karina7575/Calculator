public class Main
{
    public static void main (String[] args)
    {
        int a,b;
        String str1 = "II+4";
        if (str1.indexOf(43) != -1)
        {
            String[] strings = str1.split("\\+");
            a = RomToArabic(strings [0]);
            System.out.println(a);
            //a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a+b);
        }
        else if (str1.indexOf(45) != -1)
        {
            String[] strings = str1.split("\\-");
            a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a-b);
        }
        else if (str1.indexOf(42) != -1)
        {
            String[] strings = str1.split("\\*");
            a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a*b);
        }
        else if (str1.indexOf(47) != -1)
        {
            String[] strings = str1.split("\\/");
            a = Integer.parseInt (strings[0]);
            b = Integer.parseInt (strings[1]);
            System.out.println(a/b);
        }

    }
    static int RomToArabic(String value)
    {
        if (value.equals("I")) return 1;
        else if (value.equals("II")) return 2;
        else if (value.equals("III")) return 3;
        else if (value.equals("IV")) return 4;
        else if (value.equals("V")) return 5;
        else if (value.equals("VI")) return 6;
        else if (value.equals("VII")) return 7;
        else if (value.equals("VIII")) return 8;
        else if (value.equals("IX")) return 9;
        else if (value.equals("X")) return 10;
        return 0;
    }
}
