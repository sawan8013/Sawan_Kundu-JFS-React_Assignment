var arr= Array.from({length: 101}, () => Math.floor(Math.random() * 101));

//largetst number
function largestNumber(arr){
    var s = arr[0];
    for(var i=0;i<arr.length;i++){
        if(arr[i]>s){
            s=arr[i];
        }
    }
    document.write("The largest number is : "+s);
}
largestNumber(arr);


//smallest number
function smallestNumber(arr){
    var s = arr[0];
    for(var i=0;i<arr.length;i++){
        if(arr[i]<s){
            s=arr[i];
        }
    }
    document.write("<br>");
    document.write("The smallest number is : "+s);
}
smallestNumber(arr);

//no of even and odd
function countEvenAndOdd(arr){
    var i=0;
    var j=0;

    for(var k=0;k<arr.length;k++){
        if(arr[k]%2==0){
            i++;
        }
        else{
            j++;
        }
    }
    document.write("<br>");
    document.write("Total number of even no is: "+i+ " and Odd no is: "+j);
}
countEvenAndOdd(arr);


//find sum and avg
function sumAndAvg(arr){
    var s=0;
    for(var i=0;i<arr.length;i++){
        s+=arr[i];
    }
    document.write("<br>");
    document.write("Sum is : "+s);
    document.write("<br>");
    document.write("Avg is : "+ (s/arr.length));
}
sumAndAvg(arr);

