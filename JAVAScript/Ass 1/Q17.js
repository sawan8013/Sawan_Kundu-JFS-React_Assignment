var arr = [1, 2, 3, 4, 5, 6,7];

// Function to left rotate arr of size n by d 
function leftRotate(arr, d, n) {
    for (i = 0; i < d; i++) {
      leftRotatebyOne(arr, n);
    }
  }
  
  function leftRotatebyOne(arr, n) {
    var i, temp;
    temp = arr[0];
    for (i = 0; i < n - 1; i++) arr[i] = arr[i + 1];
    arr[n - 1] = temp;
  }
  
  //print an array 
  function printArray(arr, n) {
    for (i = 0; i < n; i++) {
      document.write(arr[i] + " ");
    }
  }

  leftRotate(arr, 2, 7);
  printArray(arr, 7);