import java.util.Scanner ;
public class Exercise {
    public static void main(String[] args){
        float dozenEggs = 125.67f ; //this represent the price of the dozen eggs
        float individualEggs = 3.5f ; //this represent the price of individual eggs
        float dozenResult = 0 ; // this is a sum variable , responsible for summing the total of dozen eggs cost 
        float individualResult = 0 ; // this is a sum variable , responsible for summing the total of loose eggs cost 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many eggs did you buy:");
        int numberOfEggs = input.nextInt();

        if( numberOfEggs / 12 > 0 || numberOfEggs % 12 > 0 ){ 
            dozenResult =(numberOfEggs / 12)* dozenEggs  ; 
            individualResult = (numberOfEggs % 12) * individualEggs ;  
        }
        
        float result =  dozenResult + individualResult ;

        System.out.println( "you ordered " + numberOfEggs + " eggs. That's " + numberOfEggs / 12 + " dozen at R"+ dozenEggs + " per dozen and " + numberOfEggs % 12 + " loose eggs at R" + individualEggs +" for a total of R"+ result+ "." );

    }
    
}
