package org.example.Class15;

public class MyException {
    static void checkAge(int age) throws ArithmeticException{
        if(age > 18){
            System.out.println("Your Eligible");
        }else{
            throw new ArithmeticException("Your Not Eligible for voting");
        }
    }
    static void main(String[] args) {
//            try{
//                int a = 10;
//
//                int result = a/2;
//
//                System.out.println(result);
//
//                int[] nums = {10, 20, 30};
//
//                System.out.println(nums[10]);
//            }catch(ArithmeticException e){
//                System.out.println("ArithmeticException occured");
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ArrayIndexOutOfBoundsException occured");
//            } catch (Exception e) {
//                System.out.println("Exception occured");
//            } finally {
//                System.out.println("finally Done..!");
//            }
        try{
            checkAge(16);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
