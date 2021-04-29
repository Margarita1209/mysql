1.-
Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.


  function array(){
    var arr=[];
    for (var i=1;i<256;i++){
      arr.push(i);
    }
    return arr;
 }
 z=array();
 
 console.log(z);
 

 2.-
 Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 -
  Puedes usar un operador de módulo para este ejercicio. 
 
 
  function sumaPares(){
    var sum=0;
    for(var i=1;i<1001;i++){
      if(i%2===0){
       // console.log(i);
        sum +=i;
      } 
    }
    return sum;
  }
  z=sumaPares();
  console.log(z);

3.-
Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999).

function sum_odd_5000(){
  var sum=0;
  for (var i=1;i<=5000;i++){
    if(i%2==1){
      sum=sum +i;

    }
  }
  return sum
}
z=sum_odd_5000();

console.log(z);

4.-
Itera un array: Escribe una función que devuelva 
la suma de todos los valores dentro de un array (ej: 
   [1,2,5] retorna 8. [-5,2,5,12] retorna 14). 

   function sumaValores(){
    var sum=[];
    for(var i=1;i<arr.length;i++){
      
        sum +=i;
     
    }
    return sum;
  }
  z=sumaValores([1,2,5]);
  console.log(z);

