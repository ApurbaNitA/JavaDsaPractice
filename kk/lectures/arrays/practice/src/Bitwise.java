public class Bitwise {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4,4,5,5,7,7};
        int n = 7;
        System.out.println(magicNum(n));
        System.out.println(noOfDigits(n));
        System.out.println(powerOf2(n));
        System.out.println(power(n));
        System.out.println(setbit(n));
    }


    // find nth magic number
//    1 = 0 0 1 ( 0*5^3 0*5^2 1*5^1) = 5
//    2 = 0 1 0 ( 0*5^3 1*5^2 0*5^1) = 25
//    3 = 0 1 1 ( 0*5^3 1*5^2 1*5^1) = 30
//    4 = 1 0 0 ( 1*5^3 0*5^2 0*5^1) = 125
    private static int magicNum(int n) {
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }

    private static int noOfDigits(int n){
        int b=2;
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }

    private static boolean powerOf2(int n){
        if(n==0){
            return false;
        }
        return (n&(n-1))==0;
    }


    // calculate a^b
    private static int power(int base){
        int power=6;
        int ans = 1;
        while(power>0){
            if((power & 1) == 1){
                ans = ans * base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }

    // count of set bits
    private static int setbit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }


}
