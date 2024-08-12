MyClass = function() {
    this.a= 'hello';
    this.b= 'world';
}
MyClass.prototype.a = 'John' ;
MyClass.prototype.c = 12;
obj = new MyClass();

console.log(obj.a);
console.log(obj.b);
console.log(obj.c);
console.log("===================");
console.log(obj.d);
