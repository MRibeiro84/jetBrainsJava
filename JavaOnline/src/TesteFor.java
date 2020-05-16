import java.util.IllegalFormatCodePointException;

public class TesteFor {
    public static void main(String[] args) {

        for (int i=1; i<21; i++)
        {
            System.out.println(i);
            if(i==5)
                break;
        }
    }
}
