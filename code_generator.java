package javaProjectCouponCode;
import java.util.HashMap;

class user {
    String phNum;
    String name;
    user(String phNum,String name){
        this.name = phNum;
        this.phNum = name;
    }
}

public class code_generator {
    public static HashMap<String,user> customer;

    code_generator(){
        customer = new HashMap<>();
    }
    public boolean codeGenerator(String phNum,String name){
        user newUser = new user(phNum,name);
        if(phNum.length() != 10) return false;
        if(phNum.length() == 10)
        {
            for(int i=0;i<phNum.length();i++)
            {
                int asci = phNum.charAt(i);
                if(asci < 48 || asci > 58)
                {
                    System.out.println("Enter a valid 10 digits mobile Number--(characters not allowed)");
                    return false;
                }
            }
        }
        if(customer.containsKey(phNum)){
            System.out.println();
            System.out.println("sorry @ " + name + " you have already claimed the coupon :(");
            System.out.println();
            return false;
        }
        else
        {
            customer.put(phNum,newUser);
        }
       return true;
    }
    public String getCoupon()
    {
         String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789";
  
        StringBuilder sb = new StringBuilder(6);
  
        for (int i = 0; i < 6; i++) 
        {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
  
        return sb.toString();
    }
    public int getCouponWorth(String coup,int n)
    {
        int discount=0;
        int len=coup.length();
        for(int i=0;i<len;i++)
        {
            discount+=(int)coup.charAt(i);
        }
        
        if(n == 1)
        {
            discount*=6;
        }
        else if(n == 4)
        {
            discount*=9;
        }
        return discount*4;
    }
}
