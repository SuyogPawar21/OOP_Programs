import java.util.Scanner;

public class in_main {
	public static void main(String[] args) {
		Vehicle v = new Bicycle();
	      
//          v.applyBarkes();
          Scanner input = new Scanner(System.in);
          int ch;
          do
          {
        	  System.out.println("1. Change gear :- up gear");
        	  System.out.println("2. Change gear :- down gear");
        	  System.out.println("3. speed up");
        	  System.out.println("4. break ");
        	  ch=input.nextInt();
        	  switch(ch)
        	  {
        	  case 1:
        		  v.changeGear(true);
        		  break;
        	  case 2:
        		  v.changeGear(false);
        		  break;
        	  case 3:
        		  v.speedUp();
        		  break;
        	  case 4:
        		  v.applyBarkes();
        	  }  
          }while(ch!=0);
}
/*
 * output
 * 1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
1
Bicycle Gear increased
Current Gear: 2
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
1
Bicycle Gear increased
Current Gear: 3
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
1
Bicycle Gear increased
Current Gear: 4
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
1
Can't increase gear, max value for gear reached
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
2
Bicycle Gear decreased
Current Gear: 3
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
2
Bicycle Gear decreased
Current Gear: 2
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
2
Bicycle Gear decreased
Current Gear: 1
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
2
Can't decrease gear, min value for gear reached
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
2
Can't decrease gear, min value for gear reached
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
2
Can't decrease gear, min value for gear reached
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 5
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 10
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 15
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 20
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 25
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 30
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 35
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 40
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 45
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 50
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 55
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Bicycle speed increased
Current Speed: 60
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Can't increase speed, bicycle is already at max speed
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
3
Can't increase speed, bicycle is already at max speed
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 55
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 50
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 45
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 40
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 35
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 30
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 25
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 20
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 15
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 10
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 5
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Bicycle speed decreased
Current Speed: 0
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
4
Can't decrease speed, bicycle is already stopped
1. Change gear :- up gear
2. Change gear :- down gear
3. speed up
4. break 
0*/
 */
