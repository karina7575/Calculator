import java.io.IOException;

public class Main
{
    public static void main (String[] args) throws Exceptions {
        int a,b, result;
        String str1 = "I+I";

        try
        {
            if (str1.indexOf(43) != -1)
            {
                String[] strings = str1.split("\\+");
                if (((strings[0].indexOf(73) != -1) || (strings[0].indexOf(86) != -1) || (strings[0].indexOf(88) != -1)) && ((strings[1].indexOf(73) != -1) || (strings[1].indexOf(86) != -1) || (strings[1].indexOf(88) != -1))) {
                    a = RomToArabic(strings[0]);
                    b = RomToArabic(strings[1]);
                    result = a+b;
                    ArabicToRom(result);
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

                    result = a - b;
                    if (result < 0) throw new Exceptions("т.к. в римской системе нет отрицательных чисел");
                    ArabicToRom(result);
                }

                    else {
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
                    result = a*b;
                    ArabicToRom(result);
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
                    result = a/b;
                    ArabicToRom(result);
                } else {
                    a = Integer.parseInt(strings[0]);
                    b = Integer.parseInt(strings[1]);
                    System.out.println(a / b);
                }
            }
            else throw new Exceptions("т.к. строка не является математической операцией");
        } catch (NumberFormatException)
        {
            System.out.println("т.к. используются одновременно разные системы счисления");
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
    static void ArabicToRom(int result)
    {
        int des = result / 10, ed = result % 10;
        if (des <= 3)
        {
            for(int i = 0; i < des; i++)
                System.out.print("X");
        }
        else if (des == 4) System.out.print("XL");
        else if (des <= 8)
        {
            System.out.print("L");
            for(int i = 5; i < des; i++)
                System.out.print("X");
        }
        else if (des >= 9)
        {
            for(int i = 10; i > des; i--)
            {
                System.out.print("X");
            }
            System.out.print("C");
        }
        if (ed <= 3)
        {
            for(int i = 0; i < ed; i++)
                System.out.print("I");
        }
        else if (ed == 4) System.out.print("IV");
        else if (ed <= 8)
        {
            System.out.print("V");
            for(int i = 5; i < ed; i++)
                System.out.print("I");
        }
        else if (ed >= 9)
        {
            for(int i = 10; i > ed; i--)
            {
                System.out.print("I");
            }
            System.out.print("X");
        }
    }
}
