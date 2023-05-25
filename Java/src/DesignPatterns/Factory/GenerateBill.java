package DesignPatterns.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory=new GetPlanFactory();
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String planNameInput=bufferedReader.readLine();

        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(bufferedReader.readLine());

        Plan plan= planFactory.getPlan(planNameInput);
        System.out.print("Bill amount for "+planNameInput+" of  "+units+" units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
