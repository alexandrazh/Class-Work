import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadingFromFile {


        public static void main(String[] args) throws Exception
        {
            // pass the path to the file as a parameter
            File file1 =
                    new File("C:\\Users\\Kostyantin\\Downloads\\transactionsLog_0.txt");
            Scanner sc1 = new Scanner(file1);

            File file2 =
                    new File("C:\\Users\\Kostyantin\\Downloads\\transactionsLog_1.txt");
            Scanner sc2 = new Scanner(file2);

            while (sc1.hasNextLine())
            while (sc2.hasNextLine())
                System.out.println(sc1.nextLine()+sc2.nextLine());






         

        }


    }



