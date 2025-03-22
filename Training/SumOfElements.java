import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int odd = 0;
        int even = 0;
        int countOdd = 0;
        int countEven = 0;

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            list.add(num);
            total += num;
        }
        
        for (int number : list){
            if (number % 2 != 0){
                odd += number;
                countOdd += 1;
            }
            else{
                even += number;
                countEven += 1;
            }
        }
        System.out.println(list);
        System.out.println("Total Sum : " + total);
        System.out.println("Sum of odd elements : " + odd);
        System.out.println("Sum of even elements : " + even);
        System.out.println("Count of even elements : " + countEven);
        System.out.println("Count of even elements : " + countOdd);
        
        sc.close();
    }
}