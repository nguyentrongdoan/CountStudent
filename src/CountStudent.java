import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        int size;
        int[] A;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhap size:");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Vuot qua kich co cua mang");
        }while (size > 30);

            A = new int[size];
        int i = 0;
        while (i < A.length){
            System.out.print("sinh vien vi tri thu: " + (i + 1) + ":");
            A[i] = input.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("in danh sach: ");
        for (int value : A) {
            System.out.print(value + "\t");
            if (value >= 5 && value <= 10)
                count++;
        }
        System.out.print("so hoc sinh vuot qua ki test la:" + count);
    }
}
