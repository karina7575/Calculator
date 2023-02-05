public class Main
{
    public static void main (String[] args)
    {
        int a,b;
        String str1 = "X*X";
        try
        {
            if (str1.indexOf(43) != -1)
            {
                String[] strings = str1.split("\\+");
                if (((strings[0].indexOf(73) != -1) || (strings[0].indexOf(86) != -1) || (strings[0].indexOf(88) != -1)) && ((strings[1].indexOf(73) != -1) || (strings[1].indexOf(86) != -1) || (strings[1].indexOf(88) != -1))) {
                    a = RomToArabic(strings[0]);
                    b = RomToArabic(strings[1]);
                    System.out.println(a + b);
                } else {
                    a = Integer.parseInt(strings[0]);
                    b = Integer.parseInt(strings[1]);
                    System.out.println(a + b);
                }
            }
            else if (str1.indexOf(45) != -1)
            {
                String[] strings = str1.split("\\-");
                if (((strings[0].indexOf(73) != -1) || (strings[0].indexOf(86) != -1) || (strings[0].indexOf(88) != -1)) && ((strings[1].indexOf(73) != -1) || (strings[1].indexOf(86) != -1) || (strings[1].indexOf(88) != -1))) {
                    a = RomToArabic(strings[0]);
                    b = RomToArabic(strings[1]);
                    System.out.println(a - b);
                } else {
                    a = Integer.parseInt(strings[0]);
                    b = Integer.parseInt(strings[1]);
                    System.out.println(a - b);
                }
            }
            else if (str1.indexOf(42) != -1)
            {
                String[] strings = str1.split("\\*");
                if (((strings[0].indexOf(73) != -1) || (strings[0].indexOf(86) != -1) || (strings[0].indexOf(88) != -1)) && ((strings[1].indexOf(73) != -1) || (strings[1].indexOf(86) != -1) || (strings[1].indexOf(88) != -1))) {
                    a = RomToArabic(strings[0]);
                    b = RomToArabic(strings[1]);
                    System.out.println(a * b);
                }
                else
                {
                    a = Integer.parseInt(strings[0]);
                    b = Integer.parseInt(strings[1]);
                    System.out.println(a * b);
                }
            }
            else if (str1.indexOf(47) != -1)
            {
                String[] strings = str1.split("\\/");
                if (((strings[0].indexOf(73) != -1) || (strings[0].indexOf(86) != -1) || (strings[0].indexOf(88) != -1)) && ((strings[1].indexOf(73) != -1) || (strings[1].indexOf(86) != -1) || (strings[1].indexOf(88) != -1))) {
                    a = RomToArabic(strings[0]);
                    b = RomToArabic(strings[1]);
                    System.out.println(a / b);
                } else {
                    a = Integer.parseInt(strings[0]);
                    b = Integer.parseInt(strings[1]);
                    System.out.println(a / b);
                }
            }
        } catch (NumberFormatException e)
        {
            System.out.println("используются одновременно разные системы счисления");
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
    static <string> string ArabicToRom(int value)
    {
        
    }
}
