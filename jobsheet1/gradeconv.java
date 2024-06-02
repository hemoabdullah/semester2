package jobsheet1;

public class gradeconv {
        public static void main(String[] args) {
            double finalGrade = finalGradeCalc(70, 85, 90, 65);
            String letterGrade = letterConversion(finalGrade);
            boolean passed = finalDecission(letterGrade);
            System.out.println("Final Grade = "+finalGrade+" > "+letterGrade+" > "+passed);
        }
    
        static double finalGradeCalc(double assignment, double quiz, double mid, double fin){
            double result = 0;
            result = 0.2*assignment + 0.2*quiz + 0.3*mid + 0.4*fin;
            return result;
        }
        static String letterConversion(double finalGrade){
            String result = "";
            if (finalGrade > 80 && finalGrade <= 100){
                result = "A";
            }else if (finalGrade > 73 && finalGrade <= 80 ){
                result = "B+";
            }else if (finalGrade  > 65 && finalGrade <= 73){
                result = "B";
            }else if (finalGrade > 60 && finalGrade <= 65){
                result = "C+";
            }else if (finalGrade > 50 && finalGrade <= 60){
                result = "C";
            }else if (finalGrade > 39 && finalGrade <= 60){
                result = "D";
            }else{
                result = "E";
            }
            return result;
        }
        static boolean finalDecission(String letter){
            if(letter.equalsIgnoreCase("A") || 
                letter.equalsIgnoreCase("B+") ||
                letter.equalsIgnoreCase("B") ||
                letter.equalsIgnoreCase("C+") ||
                letter.equalsIgnoreCase("C") ){
                    return true;
                }else{
                    return false;
                }
        }
    
    }
