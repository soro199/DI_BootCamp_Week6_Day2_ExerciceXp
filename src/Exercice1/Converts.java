package Exercice1;

public class Converts {
	
	
	public static String convertir(double grade) {
	    if (grade<=100 && grade >= 93) {
	      return "A";
	    } else if (grade<=92 && grade >= 90) {
	      return "A-";
	    } else if (grade<=89 && grade >= 87) {
	      return "B+";
	    } else if (grade<=86 && grade >= 83) {
	      return "B";
	    } else if (grade<=82 && grade >= 80) {
		  return "B-";
	    } else if (grade<=79 && grade >= 77) {
		  return "C+";
		 }else if (grade<=76 && grade >= 70) {
		  return "C";
		 }else if (grade<=69 && grade >= 60) {
		  return "D";
		 }else {
	      return "F";
	    }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] grades = {92, 84, 73, 55, 45};
	    for (double grade : grades) {
	      System.out.println(grade + ": " + convertir(grade));
	    }

	}

}
