//personaje de tv
let nombre = "wolverine";
let pelicula = "xmen";
let edad = 45
//los objetos de declaran con llaves
let personaje = { 
    nombre: "wolverine",
    pelicula: "xmen",
    edad: 45,
}; 
console.log(personaje);
console.log(personaje.nombre); //para ver una propiedad en especifico
console.log(personaje ["pelicula"]);

personaje.edad = 30 ; //para modificar propiedad

delete personaje.pelicula; //para eliminar propiedad

console.log(personaje); //para mostrar ;
