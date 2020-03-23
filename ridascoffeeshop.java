import java.util.ArrayList;
import java.util.Scanner;

public class ridascoffeeshop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        ArrayList<String> coffeeOrTea = new ArrayList<>();


            System.out.println("Do you want to order coffee or tea?  YES or NO ");

            String order = scanner.nextLine();



        while(true) {
            if (!(order.equals("yes") || (order.equals("no")))) {
                System.out.println("Invalid Answer");
                break;
            }

            if (order.equalsIgnoreCase("no")) {
                System.out.println("See you next time then! ");
                break;
            }


            if (order.equalsIgnoreCase("yes")) {

                System.out.println("COFFEE OR TEA ?");
                String options = scanner.nextLine().toLowerCase();

                if (options.equalsIgnoreCase("coffee")) {
                    System.out.print("What type of coffee do you want ? ");

                    System.out.println("Americanos, Cappuccinos, Expresso, Latte, Macchiatos, Mochas");
                    String type = scanner.nextLine().toLowerCase();


                    coffeeOrTea.add(type);
                    coffeeOrTea.add(options);

                    System.out.print("Choose your cup size: ");
                    System.out.println("Short,   Tall,  Grande,  Venti ");
                    String size = scanner.nextLine().toLowerCase();

                    coffeeOrTea.add(size);
                    System.out.println("Your order is: "+coffeeOrTea.get(0)+" "+ coffeeOrTea.get(1)+" "+coffeeOrTea.get(2) + " size.");
                    break;
                }

                if (options.equalsIgnoreCase("tea")) {

                    System.out.print("What type of tea do you want ? ");

                    System.out.println("Chai, Black, Rev Up, Green, Herbal, White");
                    String type = scanner.nextLine().toLowerCase();
                    coffeeOrTea.add(type);
                    coffeeOrTea.add(options);

                    System.out.print("Choose your cup size: ");
                    System.out.println("Short,   Tall,  Grande,  Venti ");
                    String size = scanner.nextLine().toLowerCase();

                    coffeeOrTea.add(size);
                    System.out.println("Your order is: "+coffeeOrTea.get(0)+" "+ coffeeOrTea.get(1)+" "+coffeeOrTea.get(2) + " size.");
                    break;
                }


            }

                }


            }


        }

