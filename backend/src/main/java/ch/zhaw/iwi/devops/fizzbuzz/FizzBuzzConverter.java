package ch.zhaw.iwi.devops.fizzbuzz;

public class FizzBuzzConverter {

    public String convert(int i) {
        if (i%6==0) {
            return "Fizz";
        } else if (i%8==0) {
            return "Buzz";

        }
       
    return String.valueOf (i);        
        }
        
    }


