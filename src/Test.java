import java.util.Scanner;

record Alien (int id, String name){ }

class Test
{
    public static void main(String [] args)
    {
        Alien a1 = new Alien(1,"abc");
        Alien a2 = new Alien(2,"xyz");
        System.out.println(a1.equals(a2));
        System.out.println(a2);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

    }
}

