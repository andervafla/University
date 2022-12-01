package Main;

import Train.Train;
/**
 * Клас для демонстрації функціональності класу Train.
 * функціонал: читання даних з консолі,виведення на екран масиву список поїздів, які прямують до заданого пункту призначення,
 *  виведення на екран масиву список поїздів, які прямують до заданого пункту призначення та
 * відправляються після заданої години,
 *  виведення на екран масиву список поїздів, які відправляються до заданого пункту
 * призначення та мають загальні місця.
 *
 * @author Pinzel Marian
 */


import java.util.Scanner;

public class Main {

    /**
     * Демонстрація методів.
     * @param args масив параметрів командного рядка
     */

    public static void main(String[] args) {
        Train[] train=createTrains();
        Scanner scanner = new Scanner(System.in);
        System.out.print("pointRecognition:");
        String pointRecognition=scanner.nextLine();

        getTrainByPointRecognition(train,pointRecognition);
        System.out.print("pointRecognition:");
        pointRecognition=scanner.nextLine();

        System.out.println("Enter the hours: ");
        int h = scanner.nextInt();
        System.out.println("Enter the minutes: ");
        int m = scanner.nextInt();

        getTrainByPointRecognitionTime(train,pointRecognition,h,m);

        System.out.print("pointRecognition:");
        scanner.nextLine();
        pointRecognition=scanner.nextLine();
        getTrainByPointRecognitionGeneral(train,pointRecognition);
    }

    /**
     * Метод для створення та заповнення масиву даними
     * @return масив об'єктів типу Train
     */

    public static Train[] createTrains()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size= scanner.nextInt();
        scanner.nextLine();
        Train[] trains=new Train[size];
        for (int i=0;i<size;i++)
        {
            Train train= new Train();

            System.out.println("pointRecognition:");
            train.setPointRecognition(scanner.nextLine());

            System.out.println("TrainNumber:");
            train.setTrainNumber(scanner.nextInt());

            System.out.println("timeArrivalH:");
            int temp = scanner.nextInt();
            while (temp>23 || temp <0)
            {
                System.out.println("Wrong time!\ntimeArrivalH:");
                temp = scanner.nextInt();
            }
            train.setStimeArrival(temp);

            System.out.println("timeArrivalH:");
            temp = scanner.nextInt();
            while (temp>59 || temp <0)
            {
                System.out.println("Wrong time!\ntimeArrivalM:");
                temp = scanner.nextInt();
            }
            train.setMtimeArrival(temp);

            System.out.println("timeSendH:");
            temp = scanner.nextInt();
            while (temp>23 || temp <0)
            {
                System.out.println("Wrong time!\ntimeSendH:");
                temp = scanner.nextInt();
            }
            train.setStimeSend(temp);

            System.out.println("timeSendM:");
            temp = scanner.nextInt();
            while (temp>59 || temp <0)
            {
                System.out.println("Wrong time!\ntimeSendM:");
                temp = scanner.nextInt();
            }
            train.setMtimeSend(temp);

            System.out.println("general:");
            train.setGeneral(scanner.nextInt());

            System.out.println("compartment:");
            train.setCompartment(scanner.nextInt());

            System.out.println("plac:");
            train.setPlac(scanner.nextInt());

            System.out.println("luxe:");
            train.setLuxe(scanner.nextInt());
            scanner.nextLine();
            trains[i]=train;
        }

        return trains;
    }

    /**
     * Метод для виведення масиву об'єктів типу Train які підходять під умову:
     *  список поїздів, які прямують до заданого пункту призначення;
     * @param trains масив об'єктів типу Train
     */

    public static void getTrainByPointRecognition (Train[] trains, String pointRecognition) {
        System.out.println("pointRecognition " + pointRecognition );
        for (Train train : trains) {
            if (train.getPointRecognition().equals(pointRecognition)) {
                System.out.print(train);
            }
        }
    }

    /**
     * Метод для виведення масиву об'єктів типу Train які підходять під умову:
     * список поїздів, які прямують до заданого пункту призначення та
     * відправляються після заданої години;
     * @param trains масив об'єктів типу Train
     */
    public static void getTrainByPointRecognitionTime (Train[] trains, String pointRecognition, int h, int m) {
        System.out.println("pointRecognition and timeSend " + pointRecognition +" "+ + h +":"+ m );
        for (Train train : trains) {
            if (train.getPointRecognition().equals(pointRecognition)) {
                if (train.getStimeSend() == h)
                {
                    if (train.getMtimeSend() > m)
                    {
                        System.out.print(train);
                    }
                }
                if (train.getStimeSend() > h)
                {
                    System.out.print(train);
                }

            }
        }
    }

    /**
     * Метод для виведення масиву об'єктів типу Train які підходять під умову:
     * список поїздів, які відправляються до заданого пункту
     * призначення та мають загальні місця.
     * @param trains масив об'єктів типу Train
     */
    public static void getTrainByPointRecognitionGeneral (Train[] trains, String pointRecognition) {
        System.out.println("pointRecognition " + pointRecognition );
        for (Train train : trains) {
            if (train.getPointRecognition().equals(pointRecognition) && train.getGeneral() > 0) {
                System.out.print(train);
            }
        }
    }


}