package com.company;

public class Problem9 {


    private void getresult() {


        for (int a = 1; a < 1000; a++) {


            for (int b = a + 1; b < 1000; b++) {

                double c_square = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.pow(c_square, 0.5);


                if (a + b + c == 1000) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    double result = a * b * c;
                    System.out.println(result);
                    break;
                }

            }

        }


    }

    public void execute() {
        getresult();
    }
}
