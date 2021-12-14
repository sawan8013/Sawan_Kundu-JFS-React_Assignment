var arr=[1,2,3,4,5,6,7,8];
function reverse(arr){
    var l= arr.length;
    for(let i=l-1;i>=0;i--){
        document.write(arr[i]+" ");
    }
}
reverse(arr);