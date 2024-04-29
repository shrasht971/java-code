
# ARRAY
## A collection of variables of the same data types

>An array in java is an object.
>An array variable references a group data.
>The Size of an array is fixed.

![alt text](single-dimensional-array-1.webp)
 
### CREATING ARRAYS
---
##### dataType[] arrayName; //null
##### arrayName = new dataType[10]; //Address of the 10
##### dataType[] arrayName = new dataType[10];

##### int[] numbers = new int[20];

### DEFAULT VALUES
#### When an array is created, its element are assigned the following default values:
1.0 for the numeric primitive data types

2.\u0000 for char types

3.false for boolean types

4.null for reference types
#### ACCESSING ARRAY ELEMENTS
>>    Use brackets and indices

int[] numbers = new int[5]; //{0,0,0,0,0}

numbers[0] = 5; //{5,0,0,0,0}

numbers[2] = 8; //{5,0,8,0,0}

numbers[4] = 10; //{5,0,8,0,10}

>> second way

int[] numbers = {5,0,8,0,10}; 

>> third way

int[] number;

numbers = {5,0,8,0,10};

###  PRINTING ARRAYS
int[] numbers = {5,0,8,0,10};

System.out.println(numbers); // ADDRESS

for(int i=0; i< numbers.length; i++)
   {
    System.out.print(numbers[i] + " ");
   }

> An array without a variable referencing it.

new Scanner(System.in).nextDouble();

new int[]{1,2,3,4};

printArray(new int[] {1,2,3,4});

> The indices must be between 0 and length-1

char[] chars = {'a','b','c','d'};

//Index -1 out of bounds for length 4
System.out.println(chars[-1]);

//Index 4 out of bounds for length 4
System.out.println(chars[4]);

ArrayIndexOutOfBoundsException

System.out.println(chars); //abcd

#### PASSING ARRAYS TO METHODS 

> Arrays are passed by reference

public static void main(String[] args){
   int[] numbers = {0,1};

   change(numbers);

   printsArray(numbers); //1 0
}

public static void change(int[] numbers){

   numbers[0] = 1; //{1,1}

   numbers[1] = 0; //{1,0}

}

public static  void printArray(int[] number){

   for(int i = 0; i < numbers.length; i++){

      System.out.print(numbers[i] + " "); 
   }
}

> Point is destroyed after this method is executed

public static void main(String[] args){

   Point p = getPoint();

   System.out.println(p);
}

public static Point getPoint(){

   return new Point(1,2);

}

> An object is destroyed when it is no longer reference by a variable

## What is ARRAY CLASS
##### A class that contains some static methods that are used with arrays

- Sorting
- Searching
- Comparing
- Filling
- Returning a string representation of an array

> SORTING ARRAYS(Using sort())

//sort(array): sorts the whole array

[Sorting Arrays program](sortingArrays.java)