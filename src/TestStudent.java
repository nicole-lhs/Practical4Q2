/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicole
 */
public class TestStudent {
    public static void main(String[]args){
        
        Student s1 = new Student();
        Student s2 = new Student("W45678","Abu");
        
        s1.setStudentName("Ali");
        s1.setStudentId("W12345");
        
        s1.addQuiz(10);
        s2.addQuiz(8);
        
        System.out.printf("%-15s %3d %3d %5.2f\n",
                s1.getStudentName(),s1.getNoQuiz(),
                s1.getTotalScore(),s1.getAverageScore());
        
        System.out.printf("%-15s %3d %3d %5.2f\n",
                s2.getStudentName(),s2.getNoQuiz(),
                s2.getTotalScore(),s2.getAverageScore());
    }
    
}
