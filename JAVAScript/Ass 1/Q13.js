var arr=[1,2,3,4,5,6,7,8];
var sum=0;
//using for loop
function sumOfArray(arr){
    
    for(let i=0;i<arr.length;i++){
        sum += arr[i];
    }
}
sumOfArray(arr);
document.write("Sum of the array using For Loop : "+sum);

//using while loop
var s=0;
function sumUsingWhile(arr){
    i=0;
    while(i!=arr.length){
        s+= arr[i];
        i++;
    }
} 
sumUsingWhile(arr);
document.write("<br>")
document.write("Sum of the array using While Loop : "+s);

//using do-while loop
var s1=0;
function sumUsingDoWhile(arr){
    i=0;
    do {
        s1+=arr[i];
        i++;
    } while (i!=arr.length);
}
sumUsingDoWhile(arr);
document.write("<br>")
document.write("Sum of the array using Do-While Loop : "+s);