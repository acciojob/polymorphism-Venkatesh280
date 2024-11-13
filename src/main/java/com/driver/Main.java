package com.driver;

public class Main {
        
      public static  class product{
       
            public int sum(int x,int y){
                return x+y;
                
            }
            public int sum(int x, int y, int z) {
                return x+y+z;

            }
            public double sum(double x, double y) {
                return x+y;

            }
        }
        public static void main(String args[]){
            product p=new product();

          System.out.println(p.sum(10,20));
          System.out.println(p.sum(20,10,30));
          System.out.println(p.sum(40,50,60));
        

        }
    }

