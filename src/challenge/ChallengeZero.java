package challenge;

public class ChallengeZero{
   /* 04:03:28
produce a system that can vary its output based upon a specific count.  This output should vary
depending on if the count is current at 2, 3 or 6 any number divisible thereby.  If the count is
not at a number divisible by 2, 3 or 6 it should print the counter, otherwise print foo when the
count is divisible by 2, print bar when its divisible by 3 or print baz when its divisible by 6.  This
cannot be hard coded, please generate a function that does this.  The system in theory counts
forever printing values, but you don’t have to worry about memory management or anything
like that.
    */
    //notes:
    //divisible by 2  = foo
    //divisible by 3 = bar
    //divisible by 6 = baz
    // Questions to ask for clarity - what if it is divisible by all 3? (technically all multiples of 6 so baz but could also print foo and bar?).
    // constraints : not technically named - in theory counts to infinity

    public static void printFooBarBaz(){
        double inf = Double.POSITIVE_INFINITY;
        for (int i = 1; i <=inf ; i++) {
            if (i % 6 == 0) {
               System.out.println("baz ");
           } else if (i % 2 == 0) {
               System.out.println("foo ");
           } else if (i % 3 == 0) {
               System.out.println("bar ");
           } else {
               System.out.println(i);
           }
       }
    }

    public static void main(String[] args) {
        printFooBarBaz();
    }
}
