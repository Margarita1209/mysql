
function restNegativo(arreglo){

    for(var i=0;i<arreglo.length;i++){

        if(arreglo[i]<0){
            arreglo[i]=0;
        }
    }
    return arreglo;
}

var arreglo = [1,2,-1,-3];
var salida = resetNegativos(arreglo);
console.log(salida);

Dado un array, mueve todos los valores un espacio de derecha a izquierda eliminando 
el primer valor y dejando un 0 para el último valor. Por ejemplo,
 moverAdelante([1,2,3]) debiera dar como resultado [2,3,0].

 function moverAdelante(arreglo) {

    var x =[1,2,3];

    for(var i=0;i<arreglo.length;i++){
      //  if([i]<[i+1]){}
        temp=x[x.length-2];
        x[x.length-2]=[0];

       // else()
    }

    //    for(var j=0;j<arreglo.length;i++){

    }

 }
var x =[1,2,3];
var temp=x[x.length-1];
 
x[x.length-1]=[0];
x[0]=tem;
console.log(x);



Configura un array para que el resultado sean los valores en el orden contrario. 
Por ejemplo, returnReverso([1,2,3]) debe dar [3,2,1].

var x =[1,2,3];
var temp=x[x.length-1];
 
x[x.length-1]=[0];
x[0]=tem;
console.log(x);


Crea una función que cambie un array repitiendo sus valores originales (manteniendo el mismo orden). 
Por ejemplo, repetirValores([4,”Ulysses”, 42, false]) debiera dar [4,4, “Ulysses”, “Ulysses”, 42, 42, false, false].

function repetirValores(arreglo) {
    
}