import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

				int inputNum = 0;
				boolean num = true;
				boolean isNum;
				Scanner scan = new Scanner(System.in);
				
				while (num == true) {
					System.out.println(" Please enter any number btween 1 - 100 ");
					do {

						
						if (scan.hasNextInt()) {
							inputNum = scan.nextInt();
							//scan.nextLine();
							isNum = true;
						}

						else {
							System.out.println(" Please enter a number between 1 -100 ");
							isNum = false;
							scan.nextInt();
						}
					} while (!(isNum));
					
					
					
					do{
						
					if (inputNum > 0 && inputNum <=100) {
								isNum = true;
						} 
					else 
						{
								System.out.println(" Please enter positive number and  number between 1 -100");
								isNum = false;
								inputNum = scan.nextInt();

							}
							
					} while(!(isNum));

					if (inputNum % 2 == 0) {
						
						if (inputNum >= 2 && inputNum <= 25) {
							System.out.println(inputNum + " Even and less than 25");
						}
						
						 else if( inputNum >= 26 && inputNum <= 60) { System.out.println(inputNum +
						 " Even. "); }
						
						else {
							System.out.println(inputNum + " Even.");
						}}
					 else {
						if (inputNum < 60) {
							System.out.println(inputNum + " Odd. ");
						} else {
							System.out.println(inputNum + " Odd and over 60.");
						}
					}
					System.out.println(" Do you want to continue ? (Y/N) ");
					String answer = scan.next();
						if (answer.equals("Y") || answer.equals("y")) {
						num = true;
						} 
						else {
						num = false;
						}
				}
				scan.close();
			}
		}

