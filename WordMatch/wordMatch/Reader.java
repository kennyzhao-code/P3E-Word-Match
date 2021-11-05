import java.net.*;
import java.io.*;
import java.util.ArrayList; 
public class Reader  
{

    static String threeWords = "http://www1.cs.columbia.edu/~kathy/cs4701/3.txt";
    static String fourWords = "https://gist.githubusercontent.com/paulcc/3799331/raw/74207b4ee400469ddbb61d297dbd62f31a3407ce/gistfile1.txt"; 
    static String fiveWords = "https://www-cs-faculty.stanford.edu/~knuth/sgb-words.txt";
    BufferedReader in;
    static String urlName = ""; 
    static ArrayList<String> words = new ArrayList<String>();  
    public Reader()
    {      
        
    }
    public static void readInto(int x) throws Exception {
        if(x == 3)
        {
            urlName = threeWords; 
        }
        URL url = new URL(urlName);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String word;
        while ((word = in.readLine()) != null)
        {
            words.add(word);
        }
        in.close(); 
    }
    public static ArrayList<String> readThree(char a, char b, char c)
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: words)
        {
            if(inputLine.charAt(0) == a)
            {
                if(inputLine.charAt(1) == b || inputLine.charAt(1) == c)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(2) == b || inputLine.charAt(2) == c)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
            else if(inputLine.charAt(0) == b)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == c)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(2) == b || inputLine.charAt(2) == c)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
            else if(inputLine.charAt(0) == c)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == b)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(2) == b || inputLine.charAt(2) == c)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
        }
        return arr; 
    }
    public static ArrayList<String> readFour(char a, char b, char c, char d) 
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: words)
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
    public static ArrayList<String> readFive(char a, char b, char c, char d, char e)
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: words)
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
