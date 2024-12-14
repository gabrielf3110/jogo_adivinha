import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Double randomNumber = new BigDecimal(random.nextDouble(100) + 1)
                .setScale(2, RoundingMode.HALF_UP)
                .doubleValue();

        Double num = 0.0;
        while(!num.toString().equals(randomNumber.toString())) {
            System.out.println("Tente adivinhar o número: ");
            num = sc.nextDouble();
            if(num > randomNumber) System.out.println("O número é menor");
            if(num < randomNumber) System.out.println("O número é maior");
        }
        System.out.println("Você acertoooou! O número era: " + randomNumber);
    }
}
