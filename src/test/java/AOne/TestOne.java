package AOne;


import java.util.*;

public class TestOne {
    // String str=" This is a book. That is a pencil.This is good, and that is bad.";
    public static void main(String[] args) {


        String str = "This is a book. That is a pencil.This is good, and that is bad.";
        Scanner scanner = new Scanner(str);
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        while(scanner.hasNextLine())
        {
            String line=scanner.nextLine();
            System.out.println(line);

            String[] lineWords=line.split("\\W+");

            Set<String> wordSet=hashMap.keySet();
            for(int i=0;i<lineWords.length;i++)
            {

                if(wordSet.contains(lineWords[i]))
                {
                    Integer number=hashMap.get(lineWords[i]);
                    number++;
                    hashMap.put(lineWords[i], number);
                }
                else
                {
                    hashMap.put(lineWords[i], 1);
                }
            }
            Iterator<String> iterator=hashMap.keySet().iterator();
            while(iterator.hasNext())
            {
                String word=iterator.next();

               System.out.printf("%-12s %d\n",word,hashMap.get(word));

            }



        }



        }


    }

