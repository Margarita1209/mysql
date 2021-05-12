// Ya sea en el mismo archivo o en uno diferente, crea una prueba o función que devuelva la suma del número más grande
// y el más pequeño del array. Por ejemplo, sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y sumMaxMin([-2,-5,-10]) 
// debería devolver -2 + -10 = -12. Una vez que hayas escrito la prueba, ejecútala (sin escribir toda la función para 
// asegurarte de que fallen todas las pruebas), luego completa la función cerciorándote de que pase todas las pruebas.

function MaxMin(array) {
    var max = 0;
    var min = 0;
    for (i = 0; i < array.length; i++) {
        if (max < array[i]) {
            max = array[i];
        } else if (array[i] < min) {
            min = array[i];
        }
    }
    return max + min;
}

console.log(MaxMin([1, 5, 10, -2]))