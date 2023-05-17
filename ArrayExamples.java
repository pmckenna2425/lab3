

public class ArrayExamples {

  // Changes the input array to be in reversed order
  /* The bug in the initial method was that as it went through the array setting the first elements to the 
   * last elements, it didn't also replace the last elements with the first elements. So by the time I was more than halfway
   * through the array, the earlier elements for it to be sent to had already been changed. 
   */

  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int num = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = num; 
    }
  } 
  
  /* 
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  } */


  // Returns a *new* array with all the elements of the input array in reversed
  // order
  /* The problem with the initial method was merely the order of the for loop body. It put arr[i] on the left 
  of the = sign, marking arr[i] as the value to be changed to newArr[arr.length - 1 - i] (which was 0 because 
  newArr had just been initialized). 
   */
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[arr.length - i - 1] = arr[i];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

