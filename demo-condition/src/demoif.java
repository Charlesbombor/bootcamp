public class demoif {
    public static void main(String[] args)  {
        // double salary = 15000.0; // by default 15000.0 is double
        double salary = 15000.0d;
        if (salary > 14000) {
            System.out.println("salary > 14000");
        }
        if (salary >= 15000) { // double vs int
            System.out.println("salary > 15000");
        }
         if (salary <= 15000) {
            System.out.println("salary <= 15000");
        }
        if (salary < 17000){ // double vs int
            System.out.println("salary < 17000");
        }
        //if (salary <= 15000) {
            //System.out.println("salary <= 15000");
        //}

        char grade = 'A';
        if (grade != 'B') {
            System.out.println("grade=A");
        } else if (grade == 'A'){
            System.out.println("grade == B");
        } else if (grade == 'A'){
            System.out.println("grade == C");
        } else if (grade == 'D'){
            System.out.println("grade == D");
        } else if (grade == 'E'){
            System.out.println("grade == E");
        } else if (grade == 'F'){
            System.out.println("Fail");
        }
            
        int score = 55;
        int score2 = 0;
        // score and score2 >= 50, (score+score2) / 2 --> grade 
        // either score or score2 < 50 -> grade F
        // both score and score2 <50 -> grade F
        //if
        // >=90 -> A, >=80 and <90 -> B, 70 - 79 --> C, 60 - 69 -> D
        // 50 - 59 -> E, <50 -> F
        if (score <50 ){
        System.out.println("Grade=" + "F");
        } else if (score <=59 ) {
            System.out.println("Grade=" + "E");
        }   else if (score <= 69){
            System.out.println("Grade=" + "D");
        }else if (score <= 79){
            System.out.println("Grade=" + "C");
        }else if (score <= 89){
            System.out.println("Grade=" + "B");
        }else if (score <= 100){
            System.out.println("Grade=" + "A");
        }

        if (score >=90 ){
        System.out.println("Grade=" + "A");
        } else if (score >=80 ) {
            System.out.println("Grade=" + "B");
        }   else if (score >= 70){
            System.out.println("Grade=" + "C");
        }else if (score >= 60){
            System.out.println("Grade=" + "D");
        }else if (score >= 50){
            System.out.println("Grade=" + "E");
        }else if (score <50 ){
            System.out.println("Grade=" + "F");
        }
        

        
        if (score >= 90 && score <= 100){
            grade = 'A';
        }else if (score >= 80 && score < 90){  // this event has no overlap with
            grade = 'B';
        }else if (score >= 70 && score < 80){
            grade = 'C';
        }else if (score >= 60 && score < 70){
            grade = 'D';
        }else if (score >= 50 && score < 60){
            grade = 'E';
        }else {
            grade = 'F';
        }
        System.out.println("Grade=" + grade);
        

        score = 90;
        score2 = 98;
        int avgscore = (score+score2)/2;
        System.out.println(avgscore);

if (score <50 || score <50 || avgscore < 50 ){
        System.out.println("Grade=" + "F");
        } else if (avgscore <=59 ) {
            System.out.println("Grade=" + "E");
        }   else if (avgscore <= 69){
            System.out.println("Grade=" + "D");
        }else if (avgscore <= 79){
            System.out.println("Grade=" + "C");
        }else if (avgscore <= 89){
            System.out.println("Grade=" + "B");
        }else if (avgscore <= 100){
            System.out.println("Grade=" + "A");
        }


    }

}

