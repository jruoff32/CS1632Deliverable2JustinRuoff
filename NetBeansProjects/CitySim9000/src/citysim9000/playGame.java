
package citysim9000;

/**
 *
 * @author justinruoff
 */
public class playGame {
    
   
    private int carNumber;
    
    public playGame(int thenumber){
        
        int random = (int) (Math.random() * 2 + 1);
        
        
        
        for(int i = 0; i<5;i++){
            carNumber = i;
            if(random == 1){
                atMall(random);
            }else{
                atUniversity(random);
            }
        }
    }
    
    public int getRandom(int anumber){
        int random = (int) (Math.random() * 2 + 1);
        return random;
    }
        //returns true if it is a success
    public boolean atMall(int number){
        int random = getRandom(number);
        //route is 1 so go to bookstore on fourth
        if(random == 1){
            System.out.println("Driver "+carNumber+ " heading from Mall to Bookstore via Fourth Ave.");
            atBookstore(number);
            return true;
            //route is 2 so go to coffee down meow
        }else if(random == 2){
              System.out.println("Driver "+carNumber+ " heading from Mall to Coffee Shop via Meow St.");
              atCoffee(number);
              return true;
        }else{
            //something went wrong
            return false;
        }
        
   
    }
        //returns true if it is a success
    public Boolean atCoffee(int number){
         int random = getRandom(number);
        //route is 1 so go to bookstore on fourth
        if(random == 1){
            System.out.println("Driver "+carNumber+ " heading from Coffee Shop to Outside City via Fifth Ave.");
            outsideCity(number);
            return true;
            //route is 2 so go to coffee down meow
        }else if(random == 2){
              System.out.println("Driver "+carNumber+ " heading from Coffee Shop to Mall via Meow St.");
              atMall(number);
              return true;
        }else{
            //something went wrong
            return false;
        }
    }
    //returns true if it is a success
    public Boolean atBookstore(int number){
           int random = getRandom(number);
        //route is 1 so go to bookstore on fourth
        if(random == 1){
            System.out.println("Driver "+carNumber+ " heading from Bookstore to Outside City via Fourth Ave.");
            outsideCity(number);
            return true;
            //route is 2 so go to coffee down meow
        }else if(random == 2){
              System.out.println("Driver "+carNumber+ " heading from Bookstore to University via Chirp St.");
              atUniversity(number);
              return true;
        }else{
            //something went wrong
            return false;
        }
    }
      //returns true if it is a success
    public Boolean atUniversity(int number){
           int random = getRandom(number);
        //route is 1 so go to bookstore on fourth
        if(random == 1){
            System.out.println("Driver "+carNumber+ " heading from University to Coffee Shop via Fifth St.");
            atCoffee(number);
            return true;
            //route is 2 so go to coffee down meow
        }else if(random == 2){
              System.out.println("Driver "+carNumber+ " heading from University to Bookstore via Chirp St.");
              atBookstore(number);
              return true;
        }else{
            //something went wrong
            return false;
        }
    }
    
        //returns Boolean if it is a success
    public Boolean outsideCity(int number){
        System.out.println("Driver "+carNumber+ " has left the city!");
        System.out.println("-----------");
        return true;
    }
    
 
    
}
