package asdfasdf;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What will you do?\n[1] ID Card Printer\n[2] Price Comparison\n"
				+ "[3] Classroom Ratios\n[4] Stock Purchase & CD Calculator\n"
				+ "[5] Marathon Race Time\n[6] Positive or Negative Number\n[7] Even or Odd Number\n"
				+ "[8] Letter Grade\n[9] Week Day\n[10] Savings Calculator\n[11] Tip Recommender\n"
				+ "[12] Kiosk Change Calculator\n[13] Date Formatter\n[14] Address Formatter\n"
				+ "[15] Password Generator\n[16] WordSearch\n[17] Acronym Printer\n[18] Number Formatter\n"
				+ "[19] Vowel Counter\n[20] Box Printer\n[21] Test Scores\n[22] News Ticker\n"
				+ "[23] Disease Epidemics\n[24] Advertising Sources\n[25] Show Poker Hand");
		String temp = scan.nextLine();
//		char choice = temp.charAt(0);
		int choice=Integer.parseInt(String.valueOf(temp));  
	
		
		switch (choice) {
		case 1:
			String name = scan.next(), id = scan.next(), state = scan.next(), date = scan.next();
			System.out.println("NAME: " + name + "\nID: " + id + "\nSTATE: " + state + "\nEXP. DATE: " + date);
		break;
		case 2:
			System.out.println("Comparing Prices for Laptops\n");
			int ourStore = 499, bestBuy = scan.nextInt(), amazon = scan.nextInt(), 
			diff = (ourStore - bestBuy), diffS = ourStore - amazon; 
			diff = (diff < 0)?diff:0;
			diffS = (diffS < 0)?diffS:0;
			System.out.println(
					"Our Store: $"+ourStore
					+"\nBest Buy: $"+bestBuy+"\n"
					+"*Save $"+Integer.toString(diff).substring(1)+"\n"
					+"Amazon: $"+amazon+"\n"
					+"*Save $"+Integer.toString(diffS).substring(1)+"\n");
		break;
		case 3:
			System.out.println("There are 11 boys and 16 girls in a class with one teacher and a teacher's assistant.\n"
					+ "What percent of the students are girls? What is the student-teacher ratio?\n");
			float answer = 16/27f, answer2 = 27/2f;

			answer *= 100;
			String answerAsString = String.format("%.3f", answer),
					answer2AsString = String.format("%.1f", answer2);
			System.out.println(answerAsString+"% of the class are girls.\n"
					+ "The student-Teacher ratio is "+answer2AsString);
		break;
		case 4:
			System.out.println("You are feeling lucky with a stock and want to go all in! You have $25,000 in savings and \n"
					+ "want to invest all of your money to buy a stock, and the remaining money in a CD account. The stock \n"
					+ "price is $989 per share. How many shares of this stock can you buy, and how much money will be left for the CD account?\n");
			int shares= 25000/989, cd = 25000%989;
			System.out.println("Buy "+shares+" shares of stock\nInvest $"+cd+" in CD account");
		break;
		case 5:
			System.out.println("In 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal in the men's 26.2-mile marathon race. The official "
					+ "timer tracked his race at 7724 seconds. What is his time in hours, minutes, and seconds?");
			int hours = 7724/3600, minutes = (7724%3600)/60, seconds = 7724%3600%60;
			float bonus = (7724/26.2f)/60;
			String averagePace = String.format("%.3f", bonus);
			System.out.println(hours + "hrs:" + minutes + "mins:" + seconds+"secs Average pace: "+averagePace);
		break;
		case 6:
			System.out.print("\nInput a number to check whether it's negative or positive\n");
			String posOrNotAnswer = (scan.nextInt()< 0)?"Negative":"Positive";
			System.out.println(posOrNotAnswer);
		case 7:
			System.out.print("\nInput a number to check whether it's or positive\n");
			String eOrO = (scan.nextInt()%2==0)?"Even":"Odd";
			System.out.println(eOrO);
			break;
		case 8:
			int grade = scan.nextInt();
			boolean[] grades = {(grade>=90),(grade>=80),(grade>=72),
					(grade>=64), (grade>=0)};

			if (!containsTrue(grades)){
				System.out.println("You've entered an invalid number.");
				break;
			}
			String letterGrades = "ABCDF";
			for (int i=0; i<grades.length; i++) {
			        if (grades[i] == true) {
			        	System.out.println(letterGrades.charAt(i));
			        	break;
			        }
			}
			break;
		case 9:
			int day = scan.nextInt();
			switch (day) {
				case 1:System.out.println("Sunday");
					break;
				case 2:System.out.println("Monday");
					break;
				case 3:System.out.println("Tuesday");
					break;
				case 4:System.out.println("Wednesday");
					break;
				case 5:System.out.println("Thursday");
					break;
				case 6:System.out.println("Friday");
					break;
				case 7:System.out.println("Saturday");
					break;
				default:System.out.println("You've entered an invalid number.");
					break;
			}
			break;
		case 10:
			System.out.print(savings(scan.nextInt(), scan.nextFloat(), scan.nextInt()));
			break;
		case 11:
			System.out.print(computeTip(scan.nextDouble(), scan.next()));
			break;
		case 12:
			System.out.println(returnChange(scan.nextDouble(), scan.nextDouble()));
			break;
		case 13:
			System.out.println(convertDate(scan.next()));
			break;
		case 14:
			System.out.println(convertAddress(scan.next()));
			break;
		case 15:
			System.out.print(generatePassword(scan.nextLine()));
			break;
		case 16:
			System.out.print(wordSearch(scan.nextLine(), scan.nextLine()));
			break;
		case 17:
			System.out.print(generateAcronym(scan.nextLine()));
			break;
		case 18:
			System.out.print(convertToNum(scan.next())+"\n");
			System.out.print(convertToString(scan.nextInt()));
			break;
		case 19:
			System.out.print(vowelCounter(scan.nextLine()));
			break;
		case 20:
			printBox(scan.nextInt(), scan.nextInt());
			break;
		case 21:
			int[] testScores = {79, 69, 87, 99, 60, 95, 93, 73, 100, 75, 74, 72, 96,  
			                  85, 98, 97, 86, 92, 89, 68, 83, 65, 63, 91, 90, 77, 62, 80, 84, 88 };
			int sum = 0;
			for (int i: testScores) {
				sum+=i;
			}
			double average = sum/testScores.length;
			System.out.print(average);
			break;
		case 22:
			String headlines[] = {"Enormous python tries to swallow bat whole as creatures fight to the"
					+"death while hanging from a tree",
					"Russian boy can remember previous life on Mars in astounding detail",
					"Sneezes can infect people up to 25ft away: Everything you need to"
					+"know about your winter cold",
					"Football pundit breaks chair live on air after leaning a little bit"
					+"too far back",
					"Family move into five-bedroom eco-house with secret past as Cold War"
					+"nuclear bunker"
			};
			for (String c: headlines) {
				String headline = c.substring(0, 49);
				String ticker = headline.substring(0, headline.lastIndexOf(" "))+ " ... ";
				System.out.print(ticker);
			}
			break;
		case 23:
			String[] cities = {"Warner, NH", "East Natchitoches, PA", "Lyon, WV", "Willow Run, IL",
					"Conyersville, AZ", "Mount Baker, NY", "Farmington Lake, OK", "Martins Corner, TX", 
					"Pickerel Narrows, MT", "Willaha, OH", "Center, MA", "Kalauao, SD", "Storms, TX", 
					"Ipswich, IA", "Momford Landing, IN", "North Knoxville, AL", "Emerson, MT", 
					"Longview, MA", "Hebron, AZ", "Scottsville, KS", "East Waterford, ME", "Mittenlane, TX",
					"Spring City, MS", "Center, MA", "Willaha, OH", "Hebron, AZ", "Ipswich, IA", "Coltman, WV"
			}, cholera = {"Warner, NH", "East Natchitoches, PA", "Lyon, WV", "Willow Run, IL",
					"Conyersville, AZ", "Mount Baker, NY", "Farmington Lake, OK", "Martins Corner, TX", 
					"Pickerel Narrows, MT", "Willaha, OH", "Center, MA"
			}, measles = {"Willow Run, IL", "Conyersville, AZ", "Mount Baker, NY", "Farmington Lake, OK",
					"Martins Corner, TX", "Scottsville, KS", "Hebron, AZ", "Longview, MA", "Emerson, MT",
					"North Knoxville, AL", "Momford Landing, IN", "Ipswich, IA", "Storms, TX", "Kalauao, SD"
			}, meningitis = {"Farmington Lake, OK", "Martins Corner, TX", "Pickerel Narrows, MT",
					"Willaha, OH", "Center, MA", "Spring City, MS", "Mittenlane, TX", "East Waterford, ME",
					"Coltman, WV", "Scottsville, KS", "Hebron AZ", "Longview, MA", "Emerson, MT"
			};
			HashSet<String> set1 = new HashSet<>(Arrays.asList(cities));
			HashSet<String> set2 = new HashSet<>(Arrays.asList(cholera));
			HashSet<String> set3 = new HashSet<>(Arrays.asList(measles));
			HashSet<String> set4 = new HashSet<>(Arrays.asList(meningitis));
			set1.retainAll(set2);
			set1.retainAll(set3);
			set1.retainAll(set4);
			System.out.println(set1);
			break;
		case 24:
			String[] sources = {"Google","Google","Direct","Social Media","Referral","Promotion",
					"Google","Direct","Social Media","Referral","Promotion","Referral","Promotion",
					"Google","Direct","Google","Direct","Social Media","Referral","Promotion","Google",
					"Google","Google","Direct","Social Media","Referral","Promotion","Direct",
					"Social Media","Referral","Promotion","Google","Direct","Social Media"
			}, sourceNames = {"Promotion", "Google", "Social Media", "Direct"};
			List<String> resultList = Arrays.asList(sources);
			String bestSource = "";
			int freq = 0, placeholder = 0, index=0;
			for (String c:sourceNames) {
				freq = Collections.frequency(resultList, sourceNames[index++]);
				if (freq > placeholder||placeholder==0) {
					placeholder = freq;
					bestSource = c;
				}
			}
			float proportion = ((float)(placeholder)/sources.length)*100;
			System.out.print(bestSource + "\n");
			System.out.printf("%.2f", proportion);
			System.out.print("%");
			break;
		case 25:
			int[] hand = {(int)(Math.random() * 52), (int)(Math.random() * 52), (int)(Math.random() * 52),
					(int)(Math.random() * 52), (int)(Math.random() * 52)};
			String suiteNum = " ";
			int div = 0, mod = 0, val = 0, num = 0, predicator = 0;
			char suit = ' ', face = ' ';
			for (int i: hand) {
				if (i >= 1 && i <= 13) {
					suit = 'S';
					predicator = 0;
				}
				else if (i <= 26 && i>= 14) {
					suit = 'C';
					predicator = 13;
				}
				else if (i >=27 && i <= 39) {
					suit = 'D';
					predicator = 26;
				}
				else if (i<=52 && i>=40) {
					suit = 'H';
					predicator = 39;
				}
				num = i-predicator+1;
				suiteNum = Integer.toString(num);
				switch (num) {
					case 13:
						System.out.print('K');
						break;
					case 14:
						System.out.print('A');
						break;
					case 12:
						System.out.print('Q');
						break;
					case 11: 
						System.out.print('J');
						break;
					case 10:
						System.out.print('T');
						break;
					default:
						System.out.print(suiteNum);
						break;
				}
				System.out.print(suit+"\n");
			}
		}
	}
	public static int printBox(int height, int width) {
		for (int i = 0; i<height; i++) {
			if (i ==0 || i == height-1) {
				for (int w = 0; w<width; w++) {
					System.out.print("*");
					if (w==width-1) {
						System.out.print("\n");
					}
				}
			}
			else {
				for(int w = 0; w < width; w++) {
					if (w==0 || w == width-1) {
						System.out.print("*");
						if (w == width-1) {
							System.out.print("\n");
						}
					}
					else {
						System.out.print(" ");
					}
				}
			}
		}
		return 0;
	}
	public static int vowelCounter(String phrase) {
		String vowels = "aeiou";
		phrase = phrase.toLowerCase();
		int iterator = 0;
		for (char c:phrase.toCharArray()) {
			if (vowels.indexOf(c)!=-1) {
				iterator++;
			}
		}
		return iterator;
	}
	public static int convertToNum(String number) {
		return Integer.parseInt(number.replaceAll("[,]", ""));
	}
	public static String convertToString(int number) {
		return NumberFormat.getNumberInstance(Locale.US).format(number);
	}
	public static String generateAcronym(String phrase) {
		String[] split = phrase.split(" ");
		String acronym = "";
        for(String val : split){
        	acronym+= Character.toUpperCase(val.charAt(0));
        }
		return acronym;
	}
	public static String wordSearch(String phrase, String search) {
		return phrase.contains(search)?"TRUE":"FALSE";
	}
	public static String  generatePassword(String name) {
		String pw = name.replaceAll("[\",]", "");
		String[] firstLast= pw.split(" ");
		char[] first = firstLast[0].toCharArray(), last = firstLast[1].toCharArray();
		pw = Character.toLowerCase(first[0]) 
				+ firstLast[1].substring(firstLast[1].length()-2).toUpperCase()
				+firstLast[0].length()+firstLast[0].charAt(firstLast[0].length()-1)+firstLast[1].charAt(0)+firstLast[1].length();
		return pw;
		
	}
	public static String convertAddress(String address) {
		String[] output = {"City: ", "\nState: ", "\nZIP: "}, input = address.split(", "), 
				staZip = input[1].split(" ");
		return output[0]+input[0] + output[1]+staZip[0]+output[2]+staZip[1];
	}
	public static String convertDate(String date) {
		String[] formatted = date.split("-"),
		months = {"January","February","March","April","May",
				"June","July","August","September","October","November","December"};
		return months[Integer.parseInt(formatted[0])-1] +" "+formatted[1]+", " + formatted[2];
	}
    public static int savings(int pv, float rate, int time) {
    	return (int) (pv*(1+(rate*.01*time)));
    }
    public static String computeTip(double price, String quality) {
    	double tipPercent = 0.34;
    	switch (quality) {
    	case "Great": tipPercent = 0.26;
    	break;
    	case "Good": tipPercent = 0.22;
    	break;
    	case "Poor": tipPercent = 0.16;
    	break;
    	default:
    		System.out.println("Not a valid type of quality.");
    		break;
    	}
    	return String.format("%.3f", (float)(price*tipPercent));
    }
    public static String returnChange(double price, double amount) {
    	double change = price%amount; 
		int quarters = (int)(change/.25), dimes = (int)(change%.25>=0.1?change%.25/.1:0), 
		nickles = (int)(change%.25%.10>=.05?change%.25%.10/.05:0), 
		pennies = (int)(change%.25%0.10%.05>=.01?change%.25%0.10%.05/0.01:0);
    	return "Quaters: "+quarters+"\nDimes: "+dimes+"\nNickles: "+nickles+"\nPennies: "+pennies;
    }
    public static boolean containsTrue(boolean[] array){
        for(boolean val : array){
            if(val)
                return true;
        }
        return false;
    }
}

