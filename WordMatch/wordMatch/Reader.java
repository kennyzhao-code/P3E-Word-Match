import java.net.*;
import java.io.*;
import java.util.ArrayList; 
/**
 * @Ethan Woo and Kenny Zhao
 * @Fall 2021
 */
public class Reader  
{
    BufferedReader in;
    static String urlName = "https://raw.githubusercontent.com/first20hours/google-10000-english/master/google-10000-english-no-swears.txt"; //create URL object
    public static ArrayList<String> words = new ArrayList<String>();  //declare objects
    public Reader() //no constructor as we treated Reader as a holder of static methods
    {      
        
    }
    public static void readInto() throws Exception 
    {
        URL url = new URL(urlName);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); //read the URL
        String word;
        while ((word = in.readLine()) != null)
        {
            words.add(word); //put into the arrayList
        }
        in.close(); //close the reader
    }
    public static ArrayList<String> readNum(int x) //find the words with the right amount of letters
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: words) //for each string in the array of all words
        {
            if(inputLine.length() == x) //if they are equal to the amount of words
            {
                arr.add(inputLine); //add it to the new arraylist
            }
        }
        return arr; 
    }
    
    //These next three methods (readThree, readFour, readFive) are supposed to find which words are appropriate the random new characters
    //They go through the readNum() arrayList, and find if that word has the right character. IF it does add it to the arrayList and after return it.
    public static ArrayList<String> readThree(ArrayList<String> array, char a, char b, char c, char d, char e, char f, char g, char h, char i, char j, char k)
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: array)
        {
            if(inputLine.charAt(0) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c || inputLine.charAt(0) == d || inputLine.charAt(0) == e || inputLine.charAt(0) == f || inputLine.charAt(0) == g || inputLine.charAt(0) == h || inputLine.charAt(0) == i || inputLine.charAt(0) == j || inputLine.charAt(0) == k)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == d || inputLine.charAt(1) == e || inputLine.charAt(1) == f || inputLine.charAt(1) == g || inputLine.charAt(1) == h || inputLine.charAt(1) == i || inputLine.charAt(1) == j || inputLine.charAt(1) == k)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(2) == b || inputLine.charAt(2) == c || inputLine.charAt(2) == d || inputLine.charAt(2) == e || inputLine.charAt(2) == f || inputLine.charAt(2) == g || inputLine.charAt(2) == h || inputLine.charAt(2) == i || inputLine.charAt(2) == j || inputLine.charAt(2) == k)
                    {
                        arr.add(inputLine); 
                    }
                }
            }
        }
        return arr; 
    }
    public static ArrayList<String> readFour(ArrayList<String> array, char a, char b, char c, char d, char e, char f, char g, char h, char i, char j, char k)
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: array)
        {
            if(inputLine.charAt(0) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c || inputLine.charAt(0) == d || inputLine.charAt(0) == e || inputLine.charAt(0) == f || inputLine.charAt(0) == g || inputLine.charAt(0) == h || inputLine.charAt(0) == i || inputLine.charAt(0) == j || inputLine.charAt(0) == k)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == d || inputLine.charAt(1) == e || inputLine.charAt(1) == f || inputLine.charAt(1) == g || inputLine.charAt(1) == h || inputLine.charAt(1) == i || inputLine.charAt(1) == j || inputLine.charAt(1) == k)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(2) == b || inputLine.charAt(2) == c || inputLine.charAt(2) == d || inputLine.charAt(2) == e || inputLine.charAt(2) == f || inputLine.charAt(2) == g || inputLine.charAt(2) == h || inputLine.charAt(2) == i || inputLine.charAt(2) == j || inputLine.charAt(2) == k)
                    {
                        if(inputLine.charAt(3) == a || inputLine.charAt(3) == b || inputLine.charAt(3) == c || inputLine.charAt(3) == d || inputLine.charAt(3) == e || inputLine.charAt(3) == f || inputLine.charAt(3) == g || inputLine.charAt(3) == h || inputLine.charAt(3) == i || inputLine.charAt(3) == j || inputLine.charAt(3) == k)
                        {
                            arr.add(inputLine); 
                        } 
                    }   
                }
            }
        }
        return arr; 
    }
    public static ArrayList<String> readFive(ArrayList<String> array, char a, char b, char c, char d, char e, char f, char g, char h, char i, char j, char k)
    {
        ArrayList<String> arr = new ArrayList<String>(); 
        for(String inputLine: array)
        {
            if(inputLine.charAt(0) == a || inputLine.charAt(0) == b || inputLine.charAt(0) == c || inputLine.charAt(0) == d || inputLine.charAt(0) == e || inputLine.charAt(0) == f || inputLine.charAt(0) == g || inputLine.charAt(0) == h || inputLine.charAt(0) == i || inputLine.charAt(0) == j || inputLine.charAt(0) == k)
            {
                if(inputLine.charAt(1) == a || inputLine.charAt(1) == b || inputLine.charAt(1) == c || inputLine.charAt(1) == d || inputLine.charAt(1) == e || inputLine.charAt(1) == f || inputLine.charAt(1) == g || inputLine.charAt(1) == h || inputLine.charAt(1) == i || inputLine.charAt(1) == j || inputLine.charAt(1) == k)
                {
                    if(inputLine.charAt(2) == a || inputLine.charAt(2) == b || inputLine.charAt(2) == c || inputLine.charAt(2) == d || inputLine.charAt(2) == e || inputLine.charAt(2) == f || inputLine.charAt(2) == g || inputLine.charAt(2) == h || inputLine.charAt(2) == i || inputLine.charAt(2) == j || inputLine.charAt(2) == k)
                    {
                        if(inputLine.charAt(3) == a || inputLine.charAt(3) == b || inputLine.charAt(3) == c || inputLine.charAt(3) == d || inputLine.charAt(3) == e || inputLine.charAt(3) == f || inputLine.charAt(3) == g || inputLine.charAt(3) == h || inputLine.charAt(3) == i || inputLine.charAt(3) == j || inputLine.charAt(3) == k)
                        {
                            if(inputLine.charAt(4) == a || inputLine.charAt(4) == b || inputLine.charAt(4) == c || inputLine.charAt(4) == d || inputLine.charAt(4) == e || inputLine.charAt(4) == f || inputLine.charAt(4) == g || inputLine.charAt(4) == h || inputLine.charAt(4) == i || inputLine.charAt(4) == j || inputLine.charAt(4) == k)
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
