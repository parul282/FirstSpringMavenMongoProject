package org.example.api;

public class Neha {

    static class A{
        protected void m1(){
            System.out.println("Am1");
        }
        protected static void m2(){
            System.out.println("Am2");
        }

    }
    static class B extends A{
        public void m1(){
            System.out.println("Bm1");
        }
        public static void m2(){
            System.out.println("Bm2");
        }

    }

    public static int main(String[] args) {
        A aA = new A();
        aA.m1();
        aA.m2();
        A aB = new B();
        aB.m1();
        aB.m2();

        B bB = new B();
        bB.m1();
        bB.m2();
        return 0;
    }

}
