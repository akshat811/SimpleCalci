//Simple calculator


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
       Calc obj = new Calc();
       obj.init();

    }
}

class Calc {
    int selected_value;
    double value1,value2,value3,value4;
    void init(){
        Scanner scan = new Scanner(System.in);
        System.out.println("................Calculator................");
        System.out.println("Enter 1 to sum");
        System.out.println("Enter 2 to sub");
        System.out.println("Enter 3 to mul");
        System.out.println("Enter 4 to div");
        System.out.println("Enter 5 to EXIT");
        try {
          selected_value =  scan.nextInt();
            switch (selected_value){

                case 1:{
                suminit();
                    break;
                }
                case 2:{
                    subinit();
                    break;
                }
                case 3:{
                    mulinit();
                    break;
                }
                case 4:{
                    divinit();
                    break;
                }
                default:{
                    System.out.println("Exit");
                }

            }
        }catch (Exception e){
            System.out.println("Please Enter correct value!!!!!\n\n");

            init();

        }


    }

    int flag=0;

    void suminit(){
        flag =1;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter 1 to sum 2 values");
       System.out.println("Enter 2 to sum 3 values");
       System.out.println("Enter 3 to sum 4 values");
       System.out.println("Enter 4 to go back");
       switch (scan.nextInt()){
           case 1:{
               System.out.println("Please enter value 1 : ");
               value1=scan.nextDouble();
               System.out.println("Please enter value 2 : ");
               value2=scan.nextDouble();
               System.out.println(value1+"+"+value2+"="+sum(value1,value2)+"\n\n");
               backmessage();
               break;
           }
           case 2:{
               System.out.println("Please enter value 1 : ");
               value1=scan.nextDouble();
               System.out.println("Please enter value 2 : ");
               value2=scan.nextDouble();
               System.out.println("Please enter value 3 : ");
               value3=scan.nextDouble();
               System.out.println(value1+"+"+value2+"+"+value3+"="+sum(value1,value2,value3)+"\n\n");
               backmessage();
               break;
           }
           case 3:{
               System.out.println("Please enter value 1 : ");
               value1=scan.nextDouble();
               System.out.println("Please enter value 2 : ");
               value2=scan.nextDouble();
               System.out.println("Please enter value 3 : ");
               value3=scan.nextDouble();
               System.out.println("Please enter value 4 : ");
               value4=scan.nextDouble();
               System.out.println(value1+"+"+value2+"+"+value3+"+"+value4+"="+sum(value1,value2,value3)+"\n\n");
               backmessage();
               break;
           }
           default:{
               init();
           }
       }
   }
    void subinit(){
        flag =2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to sub 2 values");
        System.out.println("Enter 2 to sub 3 values");
        System.out.println("Enter 3 to sub 4 values");
        System.out.println("Enter 4 to go back");
        switch (scan.nextInt()){
            case 1:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println(value1+"-"+value2+"="+sub(value1,value2)+"\n\n");
                backmessage();
                break;
            }
            case 2:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println("Please enter value 3 : ");
                value3=scan.nextDouble();
                System.out.println(value1+"-"+value2+"-"+value3+"="+sub(value1,value2,value3)+"\n\n");
                backmessage();
                break;
            }
            case 3:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println("Please enter value 3 : ");
                value3=scan.nextDouble();
                System.out.println("Please enter value 4 : ");
                value4=scan.nextDouble();
                System.out.println(value1+"-"+value2+"-"+value3+"-"+value4+"="+sub(value1,value2,value3)+"\n\n");
                backmessage();
                break;
            }
            default:{
                init();
            }
        }
    }
    void mulinit(){
        flag =3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to sub 2 values");
        System.out.println("Enter 2 to sub 3 values");
        System.out.println("Enter 3 to sub 4 values");
        System.out.println("Enter 4 to go back");
        switch (scan.nextInt()){
            case 1:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println(value1+" x "+value2+"="+mul(value1,value2)+"\n\n");
                backmessage();
                break;
            }
            case 2:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println("Please enter value 3 : ");
                value3=scan.nextDouble();
                System.out.println(value1+" X "+value2+" X "+value3+"="+mul(value1,value2,value3)+"\n\n");
                backmessage();
                break;
            }
            case 3:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println("Please enter value 3 : ");
                value3=scan.nextDouble();
                System.out.println("Please enter value 4 : ");
                value4=scan.nextDouble();
                System.out.println(value1+" X "+value2+" X "+value3+" X "+value4+"="+mul(value1,value2,value3)+"\n\n");
                backmessage();
                break;
            }
            default:{
                init();
            }
        }
    }
    void divinit(){
        flag =4;
        double ans1,ans2,ans3;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to sub 2 values");
        System.out.println("Enter 2 to sub 3 values");
        System.out.println("Enter 3 to sub 4 values");
        System.out.println("Enter 4 to go back");
        switch (scan.nextInt()){
            case 1:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                System.out.println(value1+" / "+value2+"="+div(value1,value2)+"\n\n");
                backmessage();
                break;
            }
            case 2:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();

                ans1 = value1/value2;

                System.out.println("Please enter value 3 : ");
                value3=scan.nextDouble();

                ans2 = ans1/value3;
                System.out.println(value1+" / "+value2+" / "+value3+"="+ans2+"\n\n");
                backmessage();
                break;
            }
            case 3:{
                System.out.println("Please enter value 1 : ");
                value1=scan.nextDouble();
                System.out.println("Please enter value 2 : ");
                value2=scan.nextDouble();
                ans1 = value1/value2;
                System.out.println("Please enter value 3 : ");
                value3=scan.nextDouble();
                ans2 = ans1/value3;
                System.out.println("Please enter value 4 : ");
                value4=scan.nextDouble();
                ans3 = ans2/value4;
                System.out.println(value1+" / "+value2+" / "+value3+" / "+value4+"="+ans3+"\n\n");
                backmessage();
                break;
            }
            default:{
                init();
            }
        }
    }

    double sum(double val1, double val2){
        return val1+val2;
    }
    double sum(double val1, double val2,double val3){
        return val1+val2+val3;
    }
    double sum(double val1, double val2,double val3,double val4){
        return val1+val2+val3+val4;
    }

    double sub(double val1, double val2){
        return val1-val2;
    }
    double sub(double val1, double val2,double val3){
        return val1-val2-val3;
    }
    double sub(double val1, double val2,double val3,double val4){
        return val1-val2-val3-val4;
    }

    double mul(double val1, double val2){
        return val1*val2;
    }
    double mul(double val1, double val2,double val3){
        return val1*val2*val3;
    }
    double mul(double val1, double val2,double val3,double val4){
        return val1*val2*val3*val4;
    }

    double div(double val1, double val2){
        return val1/val2;
    }


    void backmessage(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to back");
        System.out.println("Enter 2 to Main Menu");
        System.out.println("Enter 3 to exit");
        switch (scan.nextInt()){
            case 1:{

                if (flag==1){
                    suminit();
                }else if (flag==2){
                    subinit();
                }else if (flag==3){
                    mulinit();
                }else if (flag==4){
                    divinit();
                }


                break;
            }
            case 2:{
                init();
                break;
            }
            default:{
                System.out.println("Exit");
            }
        }
    }
}
