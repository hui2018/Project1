import java.util.Scanner;
public class Main extends Resource
{
    public static void main(String [] args)
    {
        boolean check = true;
        do {
            Main s = new Main();
            char[] characters = new char[s.word.length()];
            char[] test = new char[s.word.length()];
            for(int i = 0;i<s.word.length();++i)
            {
                test[i] = s.word.charAt(i);
                characters[i] = '_';
            }
            String checking = "";
            do {
                for(int i = 0;i<characters.length;++i) {
                    System.out.print(characters[i] + " ");
                }
                System.out.print("Enter a character: ");
                Scanner myObj = new Scanner(System.in);
                String answer = myObj.next();
                char testing = answer.charAt(0);
                for(int j = 0; j<characters.length; ++j)
                {
                   if(Character.toLowerCase(testing) == Character.toLowerCase(test[j]))
                   {
                       characters[j] = testing;
                   }
                }
                for (int x = 0; x < characters.length; ++x) {
                    checking = checking + characters[x];
                }
                checking.trim();
            }while(!checking.contentEquals(s.word));

            System.out.println("Another game? (y/n)");
            Scanner myObj = new Scanner(System.in);
            String answer = myObj.next();
            if(answer.contentEquals("y"))
                check = true;
            else
                check = false;
        }while(check);
    }
}
