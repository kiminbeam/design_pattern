package ch05;

import ch05.teacher.FlutterTeacher;
import ch05.teacher.HTMLTeacher;
import ch05.teacher.JavaTeacher;
import ch05.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        JavaTeacher t1 = new JavaTeacher();
        System.out.println("((자바 선생님))");
        t1.수업하기();
        System.out.println("------------");

        System.out.println("((파이썬 선생님))");

        PythonTeacher t2 = new PythonTeacher();
        t2.수업하기();
        System.out.println("------------");

        System.out.println("((HTML 선생님))");

        HTMLTeacher t3 = new HTMLTeacher();
        t3.수업하기();

        System.out.println("------------");

        System.out.println("((플러터 선생님))");

        FlutterTeacher t4 = new FlutterTeacher();
        t4.수업하기();

        System.out.println("------------");

        /*
        t1.입장하기();
        t1.출석부르기();
        t1.자바강의하기();
        t1.퇴장하기();
        */
    }
}
