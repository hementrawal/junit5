public class StringManipulation {
    public int vowelCount(String name)
    {
        if(name==null)
            return 0;
        if(name.length()==0)
            return 0;
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||
                    name.charAt(i)=='u'||name.charAt(i)=='A'||name.charAt(i)=='E'||name.charAt(i)=='I'||
                    name.charAt(i)=='O'||name.charAt(i)=='U')
                count++;
        }
        return count;
    }

    public int characterCount(String name)
    {
        if(name==null)
            return 0;
        if(name.length()==0)
            return 0;
        int count=0;
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)!=' ')
                count++;
        }
        return count;
    }
}
