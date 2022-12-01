/**
 * власний пакет для класів Main і Luka
 * @author Пінзель Мар'ян
 */
package Luka;

import java.util.Scanner;

/**
 * основний клас Main
 * * @author Пінзель Мар'ян
 */
public class Main {
    /**
     * конструктор класу Main(за замовчуванням)
     */
    public Main()
    {
    }

    /**
     * метод вводу розміра масиву чисел Люка
     * @return розмір даного масиву
     */
    public static int Size()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scan.nextInt();

        if (size <= 0){
            size = size * -1;
        }
        return size;
    }
    /**
     * метод створення ,заповнення і виведення масиву класу {@link Luka} з параметрами номер  і значення числа Люка
     * @param size - розмір масиву
     * @return масив чисел Люка
     */
    public static Luka[] CreateArr(int size)
    {
        Luka[] Arr = new Luka[size];
        Arr[0] = new Luka(0, 2);
        Arr[1] = new Luka(1,1);

        for(int i = 2;i < size;i++)
        {
            Arr[i] = new Luka(i,Arr[i - 1].getData() + Arr[i-2].getData());

        }
        return Arr;
    }

    /**
     * метод знаходження N-е число Люка для заданого N≤-0
     * @param Arr масив чисел Люка
     * @param size розмір масиву Arr
     */
    public static void Solve(Luka[] Arr,int size) {
        int numb = Arr[size - 1].getData();
        int sum = (int) Math.pow(-1, size - 1) * numb;
        System.out.println("Luke numb:" + sum);
    }
    /**
     * основний метод класу Main
     * @param args значення командного рядку
     */
    public static void main(String[] args) {
        int s = Size();
        Luka[] Array = CreateArr(s);
        Solve(Array,s);
    }
}