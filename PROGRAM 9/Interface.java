import java.util.Scanner;
    interface Student {
        void getAcademicScore();
    }

    interface Sports {
        void getSportsScore();
    }

    class Result implements Student,Sports {
        Scanner sc=new Scanner(System.in);
        int accademicScore;
        int sportsScore;

        public void getAcademicScore() {
            System.out.print("\nEnter Academic score : ");
            accademicScore=sc.nextInt();
        }

        public void getSportsScore() {
            System.out.print("Enter sports score : ");
            sportsScore=sc.nextInt();
        }

        public void display() {
            getAcademicScore();
            getSportsScore();
            System.out.println("\nAcademic Score : " + accademicScore);
            System.out.println("Sports Score : " + sportsScore);
        }
    }

    class Interface {
        public static void main(String[] args) {
            Result result=new Result();
            result.display();
        }
    }
