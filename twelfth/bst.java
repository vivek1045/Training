import java.io.*;

class bst
{
    static int binomialCoeff(int n,int k)
    {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
    static int catalan( int n)
    {
        
        int c = binomialCoeff(2 * n, n);
        return c / (n + 1);
    }
    static int countBST( int n)
    {
        int count = catalan(n);
        return count;
    }
    public static void main (String[] args)
    {
        int count1,n = 5;
        count1 = countBST(n);
        System.out.println("Count of BST with "+n +" nodes is "+count1);
    }
}

