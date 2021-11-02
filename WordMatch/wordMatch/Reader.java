import java.net.*;
import java.io.*;
import java.util.ArrayList; 
public class Reader  
{
    URL url; 
    URL threeWords; 
    BufferedReader in; 
    public Reader(int x) throws Exception
    {
       threeWords = new URL("http://www1.cs.columbia.edu/~kathy/cs4701/3.txt"); 
       if(x == 3)
       {
           url = threeWords; 
       }
       in = new BufferedReader(new InputStreamReader(url.openStream())); 
    }
    public ArrayList<String> readThree(int x, char a, char b, char c) throws Exception
    {
        String inputLine; 
        ArrayList<String> arr = new ArrayList<String>(); 
        while((inputLine = in.readLine()) != null)
        {
            if(inputLine.charAt(0) == a)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
            if(inputLine.charAt(0) == b)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == c)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
            if(inputLine.charAt(0) == c)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == b)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
        }
        return arr; 
    }
    public ArrayList<String> readFour(int x, char a, char b, char c, char d) throws Exception
    {
        String inputLine; 
        ArrayList<String> arr = new ArrayList<String>(); 
        while((inputLine = in.readLine()) != null)
        {
            if(inputLine.charAt(0) == a)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == d)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                        {
                            arr.add(inputLine);
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == b)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == c || inputLine.charAt(1) == d)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                        {
                            arr.add(inputLine);
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == c)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == a || inputLine.charAt(1) == d)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                        {
                            arr.add(inputLine);
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == d)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == a)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d)
                        {
                            arr.add(inputLine);
                        }
                    }
                }
            }
        }
        return arr; 
    }
    public ArrayList<String> readFive(int x, char a, char b, char c, char d, char e) throws Exception
    {
        String inputLine; 
        ArrayList<String> arr = new ArrayList<String>(); 
        while((inputLine = in.readLine()) != null)
        {
            if(inputLine.charAt(0) == a)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                        {
                            if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                            {
                                arr.add(inputLine);
                            }
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == b)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == c || inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                        {
                            if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                            {
                                arr.add(inputLine);
                            }
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == c)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == a || inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                        {
                            if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                            {
                                arr.add(inputLine);
                            }
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == d)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == a || inputLine.charAt(1) == e)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                        {
                            if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                            {
                                arr.add(inputLine);
                            }
                        }
                    }
                }
            }
            if(inputLine.charAt(0) == e)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == d || inputLine.charAt(1) == a)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                    {
                        if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                        {
                            if(inputLine.charAt(2) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c|| inputLine.charAt(1) == d || inputLine.charAt(1) == e)
                            {
                                arr.add(inputLine);
                            }
                        }
                    }
                }
            }
        }
        return arr; 
    }
}
