package RecursiveMethods;

public class Main {
    static int sumOf100(int i)
    {
        if(i==1)
            return 1;
        return sumOf100(i-1)+i;
    }
    static int sumOfOdds(int i)
    {
        if(i==1)
            return 1;
        if(i%2==1)
            return sumOfOdds(i-2)+i;
        return sumOfOdds(i-1);
    }
    static long productOf20(int i)
    {
        if(i==1)
            return 1;
        return productOf20(i-1)*i;
    }
    static int divisibleBy3(int i){
        if(i==0)
            return 0;
        if(i%3==1)
            return divisibleBy3(i-1);
        if(i%3==2)
            return divisibleBy3(i-2);
        return divisibleBy3(i-3)+i;
    }
    static String reverse(String s)
    {
        if(s.length()==0)
            return "";
        return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }
    public static void main(String[] args) {
        System.out.println(sumOf100(100));
        System.out.println(sumOfOdds(100));
        System.out.println(productOf20(20));
        System.out.println(divisibleBy3(100));
        System.out.println(reverse("java"));
    }
}
