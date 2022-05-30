import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task01
{

    public static void main(String[] args) throws IOException

    {
        List<String> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/data.txt")))



        {
            String line;

            while ((line = br.readLine()) != null)
            {employees.add(line);}

        }
        catch (IOException e)
        {e.printStackTrace();}


        System.out.println("Size is : " +employees.size());

        System.out.println("@@-LOOOOOP-@@");

        for (int i = 0; i < employees.size(); i++)
        {System.out.println(employees.get(i));}

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        for (String employee:employees
        )
        {System.out.println(employee);}


        System.out.println("Iterator ");
        Iterator<String> itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}