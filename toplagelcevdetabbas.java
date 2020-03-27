import java.util.Scanner;

public class toplagelcevdetabbas {
    public static void main(String[] args) {
        // bu kod yazilan bir stringi yada rakamida olabilir ekrana sirayla harflerini bastiriyo
        String cevo = "cevdetabbas";
        String result = "";
        String result2 = "";
        String result3 = "";
        System.out.println("ekrana sirayla harfleri toplayarak yazdir yazdir");
        for (int i = 0 ; i<cevo.length(); i++)
        {
            result=result+cevo.charAt(i);
            System.out.println(result);
        }
        // butun metinden harfleri birer birer cikart
        System.out.println("butun metinden harfleri birer birer cikart");
        for (int i = cevo.length() ; 0<i; i--)
        {
            String ressult = "";
            ressult=ressult+cevo.substring(0,i);
            System.out.println(ressult);
        }
        // teker teker harfleri yazdirmak icun
        System.out.println("harfleri teker teker alt alta yazdir");
        for (int j = 0 ; j<cevo.length(); j++)
        {
            result2 = cevo.substring(j,j+1);
            System.out.println(result2);
        }
        System.out.println("tersten yan yana yazdir");
        // tersten yazdirmak icun
        for (int k= cevo.length(); 0<k; k--)
        {
            result3 = cevo.substring(k-1,k);
            System.out.print(result3);
        }System.out.println("\n");
        System.out.println("tersten teker teker alt alta yazdir");
        for (int k= cevo.length(); 0<k; k--)
        {
            String result5;
            result5 = cevo.substring(k - 1, k);
            System.out.println(result5);
        }
        System.out.println("yazdirmak istedigin metni gir");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println("nasil yazdirmak istediginin rakamini yaz entera bas");
        System.out.println(" 1 - teker teker yan yana birer artan duzende");
        System.out.println(" 2 - teker teker yan yana birer azalan duzen");
        System.out.println(" 3 - teker teker alt alta duzden");
        System.out.println(" 4 - teker teker yan yana tersten");
        System.out.println(" 5 - teker teker yukardan asagiya tersten");

        int secenek = input.nextInt();

        switch (secenek)
        {
            case 1:
            for (int t = 0 ; t<=a.length(); t++)
            {
            String result7 = "";
            result7=result7+a.substring(0,t);
            System.out.println(result7);
            }
            break;
            case 2:
            for (int ii = a.length() ; 0<ii; ii--)
            {
                String resssult = "";
                resssult=resssult+a.substring(0,ii);
                System.out.println(resssult);
            }
            break;
            case 3:
                for (int jj = 0 ; jj<a.length(); jj++)
                {
                    String result222;
                    result222 = a.substring(jj,jj+1);
                    System.out.println(result222);
                }
                break;
            case 4:
                for (int kk= a.length(); 0<kk; kk--)
                {
                    result3 = a.substring(kk-1,kk);
                    System.out.print(result3);
                }System.out.println("\n");
                break;
            case 5:
                for (int kk= a.length(); 0<kk; kk--)
                {
                    String result55;
                    result55 = a.substring(kk - 1, kk);
                    System.out.println(result55);
                }
                break;
            default:
                System.out.println("adam gibi rakam girmedigin surece sana ekmek yok");
                break;


        }
    }
}
