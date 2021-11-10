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
    BufferedReader in2;
    BufferedReader in3; 
    BufferedReader in4; 
    static String urlName = "https://raw.githubusercontent.com/first20hours/google-10000-english/master/google-10000-english-no-swears.txt"; //create URL object
    static String url2Name = "https://gist.githubusercontent.com/sirkets/7d89492826a0d245a086e8c5c56829a8/raw/307ef87315bf0360f682bf25821fdcf4fe71db8c/nouns.txt"; 
    static String url3Name = "https://gist.githubusercontent.com/sirkets/2b7c3122db8c0bc08aa9e82a35175b3e/raw/16f6c7296d21910ee28cfcd637a9176f093e0da6/verbs.txt";
    static String url4Name = "https://gist.githubusercontent.com/sirkets/2b7c3122db8c0bc08aa9e82a35175b3e/raw/16f6c7296d21910ee28cfcd637a9176f093e0da6/verbs.txt";
    
    public static ArrayList<String> words = new ArrayList<String>();  //declare objects
    public Reader() //no constructor as we treated Reader as a holder of static methods
    {      
        
    }
    public static void readInto() throws Exception 
    {
        URL url = new URL(urlName);
        URL url2 = new URL(url2Name);
        URL url3 = new URL(url3Name);
        URL url4 = new URL(url4Name);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); //read the URL
        String word;
        while ((word = in.readLine()) != null)
        {
            words.add(word); //put into the arrayList
        }
        in.close(); //close the reader
        BufferedReader in2 = new BufferedReader(new InputStreamReader(url2.openStream())); //read the URL
        String word2;
        while ((word2 = in2.readLine()) != null)
        {
            words.add(word2); //put into the arrayList
        }
        in2.close(); //close the reader
        BufferedReader in3 = new BufferedReader(new InputStreamReader(url3.openStream())); //read the URL
        String word3;
        while ((word3 = in3.readLine()) != null)
        {
            words.add(word3); //put into the arrayList
        }
        in3.close(); //close the reader
        BufferedReader in4 = new BufferedReader(new InputStreamReader(url4.openStream())); //read the URL
        String word4;
        while ((word4 = in4.readLine()) != null)
        {
            words.add(word4); //put into the arrayList
        }
        in4.close(); //close the reader
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
