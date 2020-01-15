/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of items: ");
        int itemsCount = s.nextInt();

        ArrayList<Car> cars = new ArrayList();
        
        
        for (int i = 0; i < itemsCount; i++) {
            Car car;
            System.out.print("Enter type (t for Truck, f for Ford, s for Sedan) of item " + (i + 1) + ": ");
            char c = s.next().charAt(0);

            switch (c) {
                case 't':
                    car = new Truck();
                    System.out.println("Enter Weight of the Truck " + (i + 1) + ": ");
                    int weight = s.nextInt();
                    car.t.setWeight(weight);
                    System.out.println("Enter Speed of the Truck " + (i + 1) + ": ");
                    int speed = s.nextInt();
                    car.t.setSpeed(speed);
                    System.out.println("Enter Price of the Truck " + (i + 1) + ": ");
                    double price = s.nextDouble();
                    car.t.setRegularPrice(price);
                    cars.add(car);
                    break;
                case 'f':
                    car = new Ford();
                    System.out.println("Enter Year of the Ford " + (i + 1) + ": ");
                    int year = s.nextInt();
                    car.f.setYear(year);
                    System.out.println("Enter the Discount from the Manufacturer of the Ford " + (i + 1) + ": ");
                    int discount = s.nextInt();
                    car.f.setManufacturerDiscount(discount);
                    System.out.println("Enter Speed of the Ford " + (i + 1) + ": ");
                    speed = s.nextInt();
                    car.f.setSpeed(speed);
                    System.out.println("Enter Price of the Ford " + (i + 1) + ": ");
                    price = s.nextDouble();
                    car.f.setRegularPrice(price);
                    cars.add(car);
                    break;
                case 's':
                    car = new Sedan();
                    System.out.println("Enter the Length of the Sedan " + (i + 1) + ": ");
                    int length = s.nextInt();
                    car.ss.setLength(length);
                    System.out.println("Enter Speed of the Sedan " + (i + 1) + ": ");
                    speed = s.nextInt();
                    car.ss.setSpeed(speed);
                    System.out.println("Enter Price of the Sedan " + (i + 1) + ": ");
                    price = s.nextDouble();
                    car.ss.setRegularPrice(price);
                    cars.add(car);
                    break;
                default:
                    i--;
                    continue;
            }
        }
        System.out.println("");
        
        double totalDiscount = 0;
        
        for (int i = 0; i < cars.size(); i++) {
            
            Car car = cars.get(i);
            double regularPrice = car.getRegularPrice();
            double salePrice = car.getSalePrice();
            
            totalDiscount += regularPrice - salePrice;
             
             System.out.println("Car " + (i + 1)
                    + ": Type = " + car.getClass().getName()
                    + ", Regular price = " + regularPrice
                    + ", Sale price = " + salePrice);
        }
        
        System.out.println("Total discount = " + totalDiscount);
        }

    }
    

