import java.util.Scanner;
import java.text.DecimalFormat;

public class moneyConverter
{
    public static void main(String[] args)
    {
        //Variables
        double newCurrency;
        double fee;

        //Applying built-in functions
        Scanner sc = new Scanner(System.in); //---------------------------Enables user Input so you can store variables
        DecimalFormat nf = new DecimalFormat("#.##"); //------------------Limiting numbers to 2 decimal points

        System.out.print("Enter GBP amount: "); //------------------------Asking for GBP amount to convert
        double currency = sc.nextDouble(); //-----------------------------Storing GBP into a float variable 'currency' (float = double)

        System.out.println("GBP: " + currency); //------------------------printing out how much the agent has entered

        System.out.print(" USD (American)\n EUR (Euros)\n BRL (Brazilian Real)\n JPY (Japanese Yen)\n TRY (Turkish Lira)\n Choose Conversion Type: "); //---Asking for conversion type
        String ConversionType = sc.next(); //-----------------------------Storing conversion type that they chose into variable 'ConversionType'

        System.out.println("Converting GBP into " + ConversionType); //---Showing agent what they are converting their amount into


        //Fee:
        if(currency > 2000.0f)
            fee = currency * 0.015f;

        else if(currency > 1000.0f)
            fee = currency * 0.02f;
            /// Calculating their fee according to how much they entered
        else if(currency > 750.0f)
            fee = currency * 0.025f;

        else if(currency > 300.0f)
            fee = currency * 0.03f;

        else
            fee = currency * 0.035; //--------- the ‘else’ over here would be numbers up to 300 GBP


        //Converting:
        newCurrency = switch (ConversionType) {
            case "USD" -> currency * 1.40;
            case "EUR" -> currency * 1.14;
            case "BRL" ->
///Converting GBP into chosen currency type
                    currency * 4.77;
            case "JPY" -> currency * 151.05;
            default -> currency * 5.68;
        };

        //Calculating Total
        System.out.println("Fee : " + nf.format(fee));
        System.out.println("New Currency: " + nf.format(newCurrency));
        double Total = newCurrency - fee;
        System.out.println("Total: " + nf.format(Total));


    }
}


