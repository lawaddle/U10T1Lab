public class Methods {
    public static void main(String[] args)
    {
        System.out.println(findFactorial(5));
    }

    public static int findFactorial(int num)
    {
        int ans = 1;
        for (int i = num; i >= 1; i--) {
            ans*=i;
        }
        return ans;
    }
}
