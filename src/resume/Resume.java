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
public class Resume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("|  R E S U M E  |" );
        biodata r = new biodata();
        biodata s = new biodata();
        biodata t = new biodata();
        biodata u = new biodata();
        prog1 x = new prog1();
        cgpa v = new cgpa();
        work z = new work();
        talent a = new talent();
        r.printName();
        s.printAge();
        t.printAdd();
        u.printhp();
        x.printProg1();
        v.printgpa();
        System.out.println("Final CGPA result: " + v.calCGPA());
        z.printwork();
        a.printtalent();
    }
    
}
