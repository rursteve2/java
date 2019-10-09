public class Calculation{
    
    public static void main(String[] args) throws IOException { 
        double g,i,l,m;
        // The assigned variables are declared doubles and have their purposes
        // along the program.
        Scanner input= new Scanner(System.in);
        // The Scanner will allow the user to press anything on the keyboard.
        File F1= new File("Calculation.txt");
        // The name of the will create a text file named "Calculation".
        FileWriter L= new FileWriter(F1);
        // File Writer is created to identify what goes
        PrintWriter G= new PrintWriter(L);
        // This is a print statement gets sent to the text file "Calculation"
        
        System.out.println("Please Enter a number between 1-6: ");
        m=input.nextDouble();
        for (int t=1;t<=5;t++){
        if (m==1){
        System.out.println("You have selected option 1: Addition"+ " " + "\nNow Enter two numbers with decimals");
        g=input.nextDouble();
        i=input.nextDouble();
        l=Calculate(m,g,i);  
        System.out.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
        G.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
        G.close();
       }   
        else if (m==2){
        System.out.println("You have selceted option 2: Subtraction"+" " + "\nNow Enter two numbers with decimals");
         g=input.nextDouble();
         i=input.nextDouble();
         l=Calculate(m,g,i);
         System.out.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.close();
       }
        else if (m==3){
        System.out.println("You have selected option 3: Multiplication"+ " " +"\nNow Enter two numbers with decimals");  
         g=input.nextDouble();
         i=input.nextDouble();
         l=Calculate(m,g,i);
         System.out.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.close();
       }
        else if (m==4){
        System.out.println("You have selected option 4: Division"+ " " +"\nNow Enter two numbers with decimals");
         g=input.nextDouble();
         i=input.nextDouble();
         l=Calculate(m,g,i);
         System.out.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.close();
       }
        else if (m==5){
        System.out.println("You have selected option 5: Average"+ " " + "\nNow Enter two numbers with decimals");
         g=input.nextDouble();
         i=input.nextDouble();
         l=Calculate(m,g,i);
         System.out.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f", l);
         G.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.close();
       }
        else if (m==6){
        System.out.println("You have selected option 6: Maximum"+ " " + "\nNow Enter two numbers with decimals");
         g=input.nextDouble();
         i=input.nextDouble();
         l=Calculate(m,g,i);
         System.out.printf("\nThe Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.printf("The Result of "+ g+ " "+ i + " "+ "is"+" "+"%.2f",l);
         G.close();
       }
        else if(m>6||m<1){
        System.out.println("I said 1-6");
        G.println("I said 1-6");
        break;
    }
        System.out.println("\nPlease Enter a Number Between 1-6: ");
        m=input.nextDouble();
    }
 }
    public static double Calculate(double z, double x, double y){
        if (z==1){
            return(x+y);
    }   
        else if (z==2){
            return(x-y);
    }
        else if (z==3){
            return (x*y);
     }
        else if (z==4){
            return(x/y);
     }
        else if (z==5){
            return((x+y)/2);
     }
        else if(z==6){
            return (Math.max(x,y));
     }
        return 0;
    }
 }   
