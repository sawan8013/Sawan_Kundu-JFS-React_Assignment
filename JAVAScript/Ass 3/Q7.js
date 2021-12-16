var str = '{"fname" : "Ananya", "lname" : "Biswas"}';

var obj=JSON.parse(str);

obj.lname="Kundu"
console.log(obj.fname + " , " + obj.lname); 