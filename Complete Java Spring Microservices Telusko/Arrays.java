public class Arrays {
    public static void main(String a[]) {
        Demo obj = new Demo();
        int num1 = 10;
        int num2 = 20;
        int result = obj.add(num1, num2);
        System.out.println(result);

        int arr_[] = {1, 2, 3, 4};
        System.err.println("This is array value at index zero: " + arr_[0]);

        int arr[] = new int[4];
        arr[0] = 10;
        System.err.println("This is array value at index zero: " + arr[0]);

        int[] arr_static = new int[4];
        // Initialize the array with values
        arr_static[0] = 1;
        arr_static[1] = 2;
        arr_static[2] = 3;
        arr_static[3] = 4;
        for (int i = 0; i < arr_static.length; i++) {
            System.out.println(arr_static[i]);
        }

        // Multidimensional Arrays
        int[][] array_mutliStatic = {{1, 2}, {3, 4}};
        System.out.println(array_mutliStatic);
        int[][] array_mutliDynamic = new int[2][2];
        array_mutliDynamic[0][0] = 44;
        array_mutliDynamic[0][1] = 43;
        array_mutliDynamic[1][1] = 42;
        array_mutliDynamic[1][0] = 41;
        for(int i = 0; i < array_mutliDynamic.length; i++)
        {
            for(int j = 0; j< array_mutliDynamic[i].length; j++)
            {
                System.out.println(" Element at index [i][j] is:" + array_mutliDynamic[i][j]);
            }

        }
//i = 0 length = 2 j = 0 length = 2 // 44
//i = 0 length = 2 j = 1 length = 2 // 43
//i = 0 length = 2 j = 2 length = 2 // leaves the loop
//i = 1 length = 2 j = 0 lenght =2 // 41
//i = 1 length = 2 j = 1 lenght =2 // 42
//i = 1 length = 2 j = 2 lenght =2 // leaves the loop
//i = 2 length = 2 j = 2 lenght =2 // leaves the loop the outer loop


        int[][][][] arr4D = {{{{1, 2}}}};  // 4D array with length 1
        System.out.println( "This is the 4D array with length one" +  " " + arr4D[0][0][0][1]);

        int[][] arrjagged = {{1, 2},{1,3,100}};  // jagged arrays: each row has irregular columns
        System.out.println( "This is the jagged array " + arrjagged[0][0] + " " + " " + arrjagged[1][2]);



        Students s1 = new Students();
        s1.name = "Saif";
        s1.rollno= 10;
        s1.marks = 50;

        Students s2 = new Students();
        s2.name = "Saify";
        s2.rollno= 100;
        s2.marks = 500;

        Students [] students = new Students[2];
        students[0] = s1;
        students[1] = s2;
        System.out.println(students[0]);// if there is no @overide tostring this will give hashcode
        System.out.println(students[1]);

        System.out.println(students[0].name + " " + students[0].marks+ " " +students[0].rollno);
        System.out.println(students[1].name + " " + students[1].marks+ " " +students[1].rollno);

        System.out.println(s1.name + " " + s1.marks + " " + s1.rollno);// this will print data directly
        System.out.println(s2.name + " " + s2.marks + " " + s2.rollno);
    }
}

class Students{
String name;
int rollno;
int marks;
@Override
public String toString() {
return "Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks;

}}


class Demo {
    int a;
    int b;

    public int add(int y, int z) {
        System.out.println("Addition is: " + (y + z));
        return y + z;
    }
}
