/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicole
 */
public class Student {
    
    private String studentId;
    private String studentName;
    private int noQuiz;
    private int totalScore;
    
    public Student(){
        
    }
    
    public Student(String id,String name) {
        studentId = id;
        studentName = name;
    }
    
    public String getStdId(){
        return studentId;
    }
    
    public String getStudentName(){
        return studentName;
    }
    
    public int getNoQuiz(){
        return noQuiz;
    }
    
    public int getTotalScore(){
        return totalScore;
    }
    
    public void setStudentId(String id){
        studentName = id;
    }
    
    public void setStudentName(String name){
        studentName = name;
    }
    
    public void addQuiz(int score){
        if(score <0 || score >10){
            System.out.print("Error");
        }
        else{
         noQuiz ++;
         totalScore += score;
        }
    }
    
    public double getAverageScore(){
        return totalScore/(double)noQuiz;
        
    }
    
    
}
