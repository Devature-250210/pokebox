import * as axios from "axios";

export function Pokemon(id, name, spriteUrl) {
    this.id = id;
    this.name = name;
    this.spriteUrl = spriteUrl;
}

    const function pokePopulate(){
       let pokedexLength = 151

    let pokemonArray = new Array(pokedexLength)


    for (let i=1; i<=151; i++) {

        const getPokemon = async = () => {
            console.log("inside the for loop")
            try {
                let url = "https://pokeapi.co/api/v2/pokemon-form/" + i
                console.log("the url on iteration " + i + ": " + url)
                let thisPokemonFull = await axios.get(url)
                let id = thisPokemonFull.id
                let name = thisPokemonFull.name
                let spriteUrl = thisPokemonFull.sprites.front_default
                let thisPokemon = new Pokemon (id, name, spriteUrl)

                console.log(thisPokemon)

                pokemonArray.push(thisPokemon)


            } catch (error) {
                console.log("something went wrong with the API call for iteration " + i)
            }
        }
    }

    console.log(pokemonArray)
}




const getPokemon = async () => {
    console.log("inside the for loop")
    try {
        let url = "https://pokeapi.co/api/v2/pokemon-form/" + i
        console.log("the url on iteration " + i + ": " + url)
        let thisPokemonFull = await axios.get(url)
        let id = thisPokemonFull.id
        let name = thisPokemonFull.name
        let spriteUrl = thisPokemonFull.sprites.front_default
        let thisPokemon = new Pokemon (id, name, spriteUrl)

        console.log(thisPokemon)

        pokemonArray.push(thisPokemon)


    } catch (error) {
        console.log("something went wrong with the API call for iteration " + i)
    }
}