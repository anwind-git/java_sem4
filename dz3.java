// новая версия калькулятора

import java.util.Scanner;

public class dz3 {
    static String iScannerInt() {
        System.out.printf("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        String num = iScanner.nextLine();
        return num;
    }

    static String iScannerOperations() {
        System.out.printf("Введите оператор: ");
        Scanner op = new Scanner(System.in);
        String operations = op.nextLine();
        return operations;
    }
    

    public static void main(String[] args) {
        String stop = "no";
        String num1 = iScannerInt();
        int num11 =  Integer.parseInt(num1);
        int result = 0;
        String temporary = "";
        while (stop != "cancel") {
            String operations = iScannerOperations();
            if ("cancel".equals(operations)) {
                stop = "cancel";
                System.out.println(temporary);
            }else if (!"cancel".equals(operations)){
                String num2 = iScannerInt();
                if ("cancel".equals(num2)) {
                    stop = "cancel";
                    System.out.println(temporary);
                }else if (!"cancel".equals(num2)){
    
                    int num12 =  Integer.parseInt(num2);
                    if (operations.equals("+")) {
                        result = num11 + num12;
                    } else if (operations.equals("-")) {
                        result = num11 - num12;
                    } else if (operations.equals("*")) {
                        result = num11 * num12;
                    } else if (operations.equals("/")) {
                        result = num11 / num12;
                    }
            
                    System.out.println("Результат операции: " + result);
                    temporary = (num11+operations+num2+"="+result);
                    num11 = result;
                }
            }
        }
    }
}
