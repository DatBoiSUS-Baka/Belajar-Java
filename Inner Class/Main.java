import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int menu = 0;
        int x = 0;
        int y = 0;

        Calculator cal = new Calculator();
    System.out.println("masukkan menu");
        Scanner sc = new Scanner(System.in);
        try{
            menu = sc.nextInt();
        }catch(Exception e){}

        System.out.println("Masukkan x");
        try{
            x = sc.nextInt();
        }catch(Exception e){}

        System.out.println("Masukkan y");
        try{
            y = sc.nextInt();
        }catch(Exception e){}

        switch(menu){
            case 1:
            System.out.println(cal.getOpr().tambah(x,y));
            break;
            case 2:
            System.out.println(cal.getOpr().kurang(x,y));
            break;
            case 3:
            System.out.println(cal.getOpr().kali(x,y));
            break;
            case 4:
            System.out.println(cal.getOpr().bagi(x,y));
            break;

        }
    }
}
