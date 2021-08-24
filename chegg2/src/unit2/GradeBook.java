/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit2;

/**
 *
 * @author HP
 */
public class GradeBook {

    private String courseName; // name of course this grade book represents

    private int grades[][]; // two-dimensional array of student grades

    public GradeBook(String name, int gradesArray[][]) {

        courseName = name; // initialize courseName

        grades = gradesArray; // store grades

    } // end two-argument GradeBook constructor

    public void setCourseName(String name) {

        courseName = name; // store the course name

    } // end method setCourseName

    public String getCourseName() {

        return courseName;

    } // end method getCourseName

    public void displayMessage() {

        System.out.printf("Welcome to the grade book for\n%s!\n\n",
                getCourseName());

    } // end method displayMessage

    public void processGrades() {

        outputGrades();

        System.out.printf("\n%s %d\n%s %d\n\n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        outputBarChart();

    } // end method processGrades

    public int getMinimum() {

        int lowGrade = grades[0][0];

        for (int studentGrades[] : grades) {

            for (int grade : studentGrades) {

                if (grade < lowGrade) {

                    lowGrade = grade;

                }

            } // end inner for

        } // end outer for

        return lowGrade; // return lowest grade

    } // end method getMinimum

    public int getMaximum() {

        int highGrade = grades[0][0];

        for (int studentGrades[] : grades) {

            for (int grade : studentGrades) {

                if (grade > highGrade) {

                    highGrade = grade;

                }

            } // end inner for

        } // end outer for

        return highGrade; // return highest grade

    } // end method getMaximum

    public double getAverage(int setOfGrades[]) {

        int total = 0; // initialize total

        for (int grade : setOfGrades) {

            total += grade;

        }

        return (double) total / setOfGrades.length;

    } // end method getAverage

    public void outputBarChart() {

        System.out.println("Overall grade distribution:");

        int frequency[] = new int[11];

        for (int studentGrades[] : grades) {

            for (int grade : studentGrades) {

                ++frequency[grade / 10];

            }

        } // end outer for

        for (int count = 0; count < grades.length; count++) {
            if (count == 10) {

                System.out.printf("%5d: ", 100);

            } else {

                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);

            }
            for (int stars = 0; stars < frequency[count]; stars++) {

                System.out.print("*");

            }

            System.out.println(); // start a new line of output

        } // end outer for

    } // end method outputBarChart

    public void outputGrades() {

        System.out.println("The grades are:\n");

        System.out.printf("%10s",""); // align column heads

        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("%6s %d","Test", test + 1);
        }

        System.out.printf("%9s\n","Average"); // student average column heading

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student]) // output student's grades
            {

                System.out.printf("%8d", test);

            }

            double average = getAverage(grades[student]);

            System.out.printf("%9.2f\n", average);

        } // end outer for

    } // end method outputGrades

} // end class GradeBook
