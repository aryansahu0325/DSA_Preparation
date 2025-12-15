public class nofvowels
{
    public static void main(String args[])
    {
        String st="Akanksha";
        st=st.toUpperCase();
        System.out.println(no_of_vowels(st));

    }
    public static int no_of_vowels(String st)
    {
        int c=0;
        return helper(st,c);
    }
    public static int helper(String st, int c)
    {
        if(c==st.length()){
            return 0;
        }
        char ch=st.charAt(c);
        if(ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            return 1+helper(st,c+1);
        }
        else
            return helper(st,c+1);
    }
}
