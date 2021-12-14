const square = x => x*x;
const double = x => x*2;
const compose= (f,f1) => x => f(f1(x));

let f = compose(square, double)
console.log(f(5)); 
let f2 = compose(double, square)
console.log(f2(5)); 