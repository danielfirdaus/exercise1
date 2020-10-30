/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resume;

/**
 *
 * @author Danielfirdaus
 */
public class cgpa {double cgpa1 = 3.63;
    double gpa[] ={3.6,3.5,3.3,3.8};
    double sum=0;
    double fincgpa=0;
    
    public void printgpa(){
         System.out.println("< Semester GPA result >");
         System.out.println("Sem 1: " +gpa[0]);
         System.out.println("Sem 2: " +gpa[1]);
         System.out.println("Sem 3: " +gpa[2]);
         System.out.println("Sem 4: " +gpa[3]);
       
    }
    public double calCGPA(){
        
        for (int i=0; i<gpa.length; i++){
            sum+=gpa[i];
    }
       
        fincgpa = sum/gpa.length;
        return fincgpa;
    }
}

