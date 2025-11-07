class j1
{
    public boolean sum(int x)
    {
        int rem=0,rev=0,temp=0;
        temp=x;
        while(x>0)
        {
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(rev==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        j1 o=new j1();
        boolean a = o.palindrome(121);
        System.out.println("Sum is "+a);
    }
}