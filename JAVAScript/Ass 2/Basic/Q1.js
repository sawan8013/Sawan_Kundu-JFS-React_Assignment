var value = window.prompt("Enter a value: ");

function square(x){
    return x * x;
}
function double(x){
    return x * 2;
}

function composedValue(value)
{
    return square(double(value));
}

document.write("Composed Value : "+composedValue(value));