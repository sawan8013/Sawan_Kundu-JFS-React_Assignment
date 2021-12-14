const num = parseInt(window.prompt('Enter the number of terms: '));

function fibo(num){
    let n1= 1, n2=1, n3=0;
    for(let i=0;i<=num;i++){
        document.write(n1);
        document.write("<br>");
        n3=n1+n2;
        n1=n2;
        n2=n3;
    }
}
fibo(num);