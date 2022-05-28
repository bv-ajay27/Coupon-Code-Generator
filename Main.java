package javaProjectCouponCode;
import java.util.*;


public class Main {
    public static String name = "",phNum = "";
    static Scanner sc = new Scanner(System.in);
    public static products product = new products();
    public static code_generator genCode = new code_generator();
    public static void Catageories(int opt){
        int productOpt;
        switch (opt) {
            case 1:
                product.HomeAppliances();
                System.out.println("choose product in the list");
                productOpt = sc.nextInt();
                if(productOpt > 0 && productOpt < 4)
                {
                    System.out.println("Enter your valid 10 Digits MobileNumber");
                    phNum = sc.next();
                    System.out.println("Enter your Name");
                    name = sc.next();

                    boolean check = genCode.codeGenerator(phNum,name);
                    if(check)
                    {
                        System.out.println("Here is the Coupon Code with couponWorth :)");
                        // int access = sc.nextInt();
                        String coupon = genCode.getCoupon();
                        int worth = genCode.getCouponWorth(coupon,opt);
                        System.out.println("yours coupon: " + coupon + "  & " + "worth : "+worth);
                        System.out.println();
                    }
                    else{
                        System.out.println("Try with another account/Enter a valid Mobile Number ThankYou..:)");
                        System.out.println();
                    }
                }
                else{
                    product.HomeAppliances();
                }
                break;
            case 2:
                product.ComputerAccessories();
                System.out.println("choose product in the list");
                productOpt = sc.nextInt();
                if(productOpt > 0 && productOpt < 4)
                {
                    System.out.println("Enter your valid 10 Digits MobileNumber");
                    phNum = sc.next();
                    System.out.println("Enter your Name");
                    name = sc.next();

                    boolean check = genCode.codeGenerator(phNum,name);
                    if(check)
                    {
                        System.out.println("Here is the Coupon Code with couponWorth :)");
                        // int access = sc.nextInt();
                        String coupon = genCode.getCoupon();
                        int worth = genCode.getCouponWorth(coupon,opt);
                        System.out.println("yours coupon: " + coupon + "  & " + "worth : "+worth);
                        System.out.println();
                    }
                    else{
                        System.out.println("Try with another account/Enter a valid Mobile Number ThankYou..:)");
                        System.out.println();
                    }
                }
                else{
                    product.ComputerAccessories();
                }
                break;
            case 3:
                product.watches();
                System.out.println("Choose from the list of products");
                productOpt = sc.nextInt();
                if(productOpt > 0 && productOpt < 4)
                {
                    System.out.println("Enter your valid 10 Digits MobileNumber");
                    phNum = sc.next();
                    System.out.println("Enter your Name");
                    name = sc.next();

                    boolean check = genCode.codeGenerator(phNum,name);
                    if(check)
                    {
                        System.out.println("Here is the Coupon Code with couponWorth :)");
                        // int access = sc.nextInt();
                        String coupon = genCode.getCoupon();
                        int worth = genCode.getCouponWorth(coupon,opt);
                        System.out.println("yours coupon: " + coupon + "  & " + "worth : "+worth);
                        System.out.println();
                    }
                    else{
                        System.out.println("Try with another account/Enter a valid Mobile Number ThankYou..:)");
                        System.out.println();
                    }
                }
                else{
                    product.watches();
                }
                break;
            case 4:
                product.Bikes();
                System.out.println("choose product in the list");
                productOpt = sc.nextInt();
                if(productOpt > 0 && productOpt < 4)
                {
                    System.out.println("Enter your valid 10 Digits MobileNumber");
                    phNum = sc.next();
                    System.out.println("Enter your Name");
                    name = sc.next();

                    boolean check = genCode.codeGenerator(phNum,name);
                    if(check)
                    {
                        System.out.println("Here is the Coupon Code with couponWorth :)");
                        // int access = sc.nextInt();
                        String coupon = genCode.getCoupon();
                        int worth = genCode.getCouponWorth(coupon,opt);
                        System.out.println("yours coupon: " + coupon + "  & " + "worth: "+worth);
                        System.out.println();
                    }
                    else{
                        System.out.println("Try with another account/Enter a valid Mobile Number ThankYou..:)");
                        System.out.println();
                    }
                }
                else{
                    product.Bikes();
                }
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {

        System.out.println("Welcome");

        int opt;
        
        do{
            System.out.println("Choose from Below Catageories..:)");
            System.out.println("Press 1 -> Home Appliances");
            System.out.println("Press 2 -> ComputerAccessories");
            System.out.println("Press 3 -> Watches");
            System.out.println("Press 4 -> Bikes");
            System.out.println("Press 0 to Exit");

            opt = sc.nextInt();

            if(opt > 0 && opt < 5)
            {
                Catageories(opt);
            }
            else if(opt > 4)
            {
                System.out.println("Please choose from the given options :(");
            }
            else{
                System.out.println("ThankYou visit again :)");
            }
        }
        while(opt != 0);
    }
}
