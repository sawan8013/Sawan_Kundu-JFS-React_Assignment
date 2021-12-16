var str = '({"firstName" : "Ananya", "lastName" : "Kundu"})';
var obj = eval(str);
obj.lastName = "Biswas";
console.log(obj.firstName + " , " + obj.lastName);