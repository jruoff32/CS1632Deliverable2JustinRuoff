
package citysim9000;

/**
 *
 * @author justinruoff
 */
public class CitySim9000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first check and make sure the correct arguments have been given
        if (args.length > 1){
            System.out.println("Sorry you must enter only one argument.");
            System.exit(0);
        }else if(args.length == 0){
            System.out.println("Please enter a number as a argument to continue.");
            System.exit(0);
        }else{
            String thenum = args[0];
            //not a valid integer
            if (isInteger(thenum) == false){
                System.out.println("Please enter a valid number!");
                System.exit(0);
            }else
            //valid integer so proceed with seed
            {
                System.out.println("success");
                int theargument = Integer.parseInt(thenum);
                playGame thegame = new playGame(theargument);
                
            }
                    
        }
    }
    //check if it is a integer
 public static boolean isInteger(String s) {
      boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
 
         // s is a valid integer
 
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }
 
      return isValidInteger;
   }
 

}

