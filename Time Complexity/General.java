Linear Search: 



1.
  No of operations: k1 + k2(n)
	  public static void func(int n)
	{
	    int sum=0;
	    for(int i=2;i<n;i+=2)
	        sum+=i;
	    System.out.println(sum);
	}

2.
  No of operations: k1 + k2(n^2)
	public static void func(int n)
{
    int sum=0;
    for(int i=1;i<n*n;i++)
        sum+=i;
    System.out.println(sum);
}

3.
Time complexity: O(n^2)
public static void func(int n)
{
    int sum=0;
    for(int i=1;i<n;i++)
        {
            for(;i<n*n;i++)
            {
                sum+=i;
            }
        }
    System.out.println(sum);
}

4.
Time complexity: O(n^3)
public static void func(int n)
{
    int sum=0;
    for(int i=1;i<n;i++)
        {
            for(int j=1;j<n*n;j++)
            {
                sum+=i;
            }
        }
    System.out.println(sum);
}

5.
Time complexity: O(n^2)
public static void func(int n)
{
    int sum=0;
    for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum+=i;
            }
        }
    System.out.println(sum);
}

6.
What is the time complexity for merging two sorted arrays?
size of arrays are n and m.
O(n+m)
  
7.
  What is the recurrence relation for merge sort :
T(n) = 2T(n/2) + O(n)
  
 8.
    Time Complexity: O(n)
  int multiplyRec(int m, int n){
    if(n == 1)
        return m;
    return m + multiplyRec(m,  n - 1);  
}

9.
  Time Complexity: O(logn)
  int sumOfDigits(int n){
        int sum;
        if(n < 10){
            return n;
        }
        sum = (n % 10) + sumOfDigits(n / 10);
        return sum;
}

10.
  Time complexity: O(2^n)
  long fib(int n){
    if(n == 0 || n == 1){
         return n;
    }
    return fib(n - 1) + fib(n - 2);
}

11.
  The space complexity for merge sort is : O(n)
    
12.
    The space complexity for finding nth fibonacci number using recursion is : O(n)
