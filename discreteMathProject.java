package newProject;
import java.util.Scanner;
public class discreteMathProject {
	public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("enter value of |A|(if unknown enter unknown): ");// Prompt user for |A| and handle input as a string
        String inputA = scnr.nextLine();
        Integer A = null;
        
        System.out.print("enter value of |B|(if unknown enter unknown): ");// Prompt user for |B| and handle input as a string
        String inputB = scnr.nextLine();
        Integer B = null;
        
        System.out.print("enter value of |C|(if unknown enter unknown): ");// Prompt user for |C| and handle input as a string
        String inputC = scnr.nextLine();
        Integer C = null;
        
        System.out.print("enter value of |A∩B|(if unknown enter unknown): ");// Prompt user for |A∩B| and handle input as a string
        String inputAB = scnr.nextLine();
        Integer AB = null;
        
        System.out.print("enter value of |A∩C|(if unknown enter unknown): ");// Prompt user for |A∩C| and handle input as a string
        String inputAC = scnr.nextLine();
        Integer AC = null;
        
        System.out.print("enter value of |B∩C|(if unknown enter unknown): ");// Prompt user for |B∩C| and handle input as a string
        String inputBC = scnr.nextLine();
        Integer BC = null;
        
        System.out.print("enter value of |A∩B∩C|(if unknown enter unknown): ");// Prompt user for |A∩B∩C| and handle input as a string
        String inputABC = scnr.nextLine();
        Integer ABC = null;
        
        System.out.print("enter value of |AUBUC|(if unknown enter unknown): ");// Prompt user for |AUBUC| (union of all three sets)
        String inputAUBUC = scnr.nextLine();
        Integer AUBUC = null;
        
        
        if (inputA.equals("unknown")) {// Parse |A| or set to null if "unknown"
            A = null;
        }
        else {
            try {
                A = Integer.parseInt(inputA);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputB.equals("unknown")) {// Parse |B| or set to null if "unknown"

            B = null;
        }
        else {
            try {
                B = Integer.parseInt(inputB);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputC.equals("unknown")) {// Parse |C| or set to null if "unknown"
            C = null;
        }
        else {
            try {
                C = Integer.parseInt(inputC);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputAB.equals("unknown")) {// Parse |A∩B| or set to null if "unknown"
            AB = null;
        }
        else {
            try {
                AB = Integer.parseInt(inputAB);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputAC.equals("unknown")) {// Parse |A∩C| or set to null if "unknown"
            AC = null;
        }
        else {
            try {
                AC = Integer.parseInt(inputAC);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputBC.equals("unknown")) {// Parse |B∩C| or set to null if "unknown"
            BC = null;
        }
        else {
            try {
                BC = Integer.parseInt(inputBC);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputABC.equals("unknown")) {// Parse |A∩B∩C| or set to null if "unknown"
            ABC = null;
        }
        else {
            try {
                ABC = Integer.parseInt(inputABC);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
        if (inputAUBUC.equals("unknown")) {// Parse |AUBUC| or set to null if "unknown"
            AUBUC = null;
        }
        else {
            try {
                AUBUC = Integer.parseInt(inputAUBUC);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer or unknown.");
                return; 
            }
        }
        
     // Solve for unknown values based on conditions
        if((A == null) && (B != null) && (C != null) && (AB != null) && (AC != null) && (BC != null) &&
        		(ABC != null) && (AUBUC != null)) {
        	Integer problem = B+C-AB-AC-BC+ABC;// Solve for |A| using inclusion-exclusion principle
        	Integer solveA = AUBUC-problem;
        	System.out.println("Unknown |A| is "+solveA);
        }
        else if((A != null) && (B == null) && (C != null) && (AB != null) && (AC != null) && (BC != null) &&
        		(ABC != null) && (AUBUC != null)) {
        	Integer problem = A+C-AB-AC-BC+ABC;
        	Integer solveB = AUBUC-problem;// Solve for |B|
        	System.out.println("Unknown |B| is "+solveB);
        }
        else if((A != null) && (B != null) && (C == null) && (AB != null) && (AC != null) && (BC != null) &&
        		(ABC != null) && (AUBUC != null)) {
        	Integer problem = A+B-AB-AC-BC+ABC;
        	Integer solveC = AUBUC-problem;// Solve for |C|
        	System.out.println("Unknown |C| is "+solveC);
        }
        else if((A != null) && (B != null) && (C != null) && (AB == null) && (AC != null) && (BC != null) &&
        		(ABC != null) && (AUBUC != null)) {
        	Integer problem = A+B+C-AC-BC+ABC;
        	Integer solveAB = AUBUC-problem;// Solve for |A∩B|
        	System.out.println("Unknown |A∩B| is "+solveAB);
        }
        else if((A != null) && (B != null) && (C != null) && (AB != null) && (AC == null) && (BC != null) &&
        		(ABC != null) && (AUBUC != null)) {
        	Integer problem = A+B+C-AB-BC+ABC;
        	Integer solveAC = AUBUC-problem;// Solve for |A∩C|
        	System.out.println("Unknown |A∩C| is "+solveAC);
        }
        else if((A != null) && (B != null) && (C != null) && (AB != null) && (AC != null) && (BC == null) &&
        		(ABC != null) && (AUBUC != null)) {
        	Integer problem = A+B+C-AB-AC+ABC;
        	Integer solveBC = AUBUC-problem;// Solve for |B∩C|
        	System.out.println("Unknown |B∩C| is "+solveBC);
        }
        else if((A != null) && (B != null) && (C != null) && (AB != null) && (AC != null) && (BC != null) &&
        		(ABC == null) && (AUBUC != null)) {
        	Integer problem = A+B+C-AB-AC;
        	Integer solveABC = AUBUC-problem;// Solve for |A∩B∩C|
        	System.out.println("Unknown |A∩B∩C| is "+solveABC);
        }
        else if((A != null) && (B != null) && (C != null) && (AB != null) && (AC != null) && (BC != null) &&
        		(ABC != null) && (AUBUC == null)) {
        	Integer problem = A+B+C-AB-AC-BC+ABC;// Solve for |A∪B∪C|
        	System.out.println("Unknown |AUCUC| is "+problem);
        }
        else if((A != null) && (B != null) && (C == null) && (AB != null) && (AC == null) && (BC == null) &&
        		(ABC == null) && (AUBUC == null)) {
        	Integer problem = A+B-AB;// Solve for |A∪B| when only A,B, and A∩B are known
        	System.out.print("|AUB| is "+problem);
        }
        else if((A != null) && (B != null) && (C == null) && (AB == null) && (AC == null) && (BC == null) &&
        		(ABC == null) && (AUBUC == null)) {// Calculate the maximum and minimum values for |A∪B| when only |A| and |B| are known
        	Integer max = A+B;
        	System.out.println("Maximum of |AUB| is "+max);
        	if(A>B) {
        		System.out.print("Minimum of |AUB| is "+A);
        	}
        	else if(B>A) {
        		System.out.print("Minimum of |AUB| is "+B);
        	}
        	else {
        		System.out.print("Minimum of |AUB| is "+A);
        	}
        }
        else if((A != null) && (B == null) && (C != null) && (AB == null) && (AC != null) && (BC == null) &&
        		(ABC == null) && (AUBUC == null)) {
        	Integer problem = A+C-AC;// Solve for |A∪C| when only A,C, and A∩C are known
        	System.out.print("|AUC| is "+problem);
        }
        else if((A != null) && (B == null) && (C != null) && (AB == null) && (AC == null) && (BC == null) &&
        		(ABC == null) && (AUBUC == null)) {// Calculate the maximum and minimum values for |A∪C|
        	Integer max = A+C;
        	System.out.print("|AUB| is "+max);
        	System.out.println("Maximum of |AUC| is "+max);
        	if(A>C) {
        		System.out.print("Minimum of |AUC| is "+A);
        	}
        	else if(C>A) {
        		System.out.print("Minimum of |AUC| is "+C);
        	}
        	else {
        		System.out.print("Minimum of |AUC| is "+A);
        	}
        }
        else if((A == null) && (B != null) && (C != null) && (AB == null) && (AC == null) && (BC != null) &&
        		(ABC == null) && (AUBUC == null)) {
        	Integer problem = B+C-BC;// Solve for |B∪C| when only B,C, and B∩C are known
        	System.out.print("|BUC| is "+problem);
        }
        else if((A == null) && (B != null) && (C != null) && (AB == null) && (AC == null) && (BC == null) &&
        		(ABC == null) && (AUBUC == null)) {// Calculate the maximum and minimum values for |B∪C|
        	Integer max = B+C;
        	System.out.println("Maximum of |BUC| is "+max);
        	if(B>C) {
        		System.out.print("Minimum of |BUC| is "+B);
        	}
        	else if(C>B) {
        		System.out.print("Minimum of |BUC| is "+C);
        	}
        	else {
        		System.out.print("Minimum of |BUC| is "+B);
        	}
        }
        else {// Catch-all for cases not handled by the program
        	System.out.print("Program is not equiped to handle your problem");
        }
        
        
        
    }
}

