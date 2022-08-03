public class Main {
    public static void main(String[] args) {

        int mass1[] = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
               if (i == mass1.length - 1)
               {System.out.println(mass1[i] + " ");}
               else {
                   System.out.print(mass1[i] + ",");
                }
            }
        for (int i = 2; i >= 0; i--) {
            if ( i > 0){
                System.out.print(mass1[i] + ",");}
            else {
                System.out.println(mass1[i]);
            }
        }

        {
            double mass2[] = {1.57, 7.654, 9.986};
            for (int i = 0; i < 3; i++){
                if (i == mass2.length - 1)
                {System.out.println(mass2[i] + " ");}
                else {
                    System.out.print(mass2[i] + ",");
                }}
            for (int i = 2; i >= 0; i--)
                if (i > 0) {
                    System.out.print(mass2[i] + ",");
                } else {
                    System.out.println(mass2[i]);
                }
        }


        {
            int mass3[] = new int[5];
            for (int i = 0; i < 5; i++) {
                if (i == mass3.length - 1)
                    System.out.println(mass3[i] + " ");
                else {
                    System.out.print(mass3[i] + ",");
                }
            }
            for (int i = mass3.length - 1; i >= 0; i--) {
                if ( i > 0){
                    System.out.print(mass3[i] + ",");}
                else {
                    System.out.println(mass3[i]);
                }
            }}
        for (int i = 0; i < 3;i++){
            if (mass1[i] % 2 != 0){
                mass1[i] = mass1[i] + 1;
                System.out.print(mass1[i]);
            }
            else {
                System.out.print(mass1[i]);
            }
        }
    }}