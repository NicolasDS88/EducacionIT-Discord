import React, { useEffect, useState } from "react";
import "../../styles/Pokemon.css";

const Pokemon = () => {
    const [pokemon, setPokemon] = useState([]);

    const getPokemon = async () => {
        const res = await fetch("https://pokeapi.co/api/v2/pokemon?limit=151&offset=0");

        const data = await res.json();

        function createPokemonObject(results) {
            results.forEach(async (poke) => {
                const res = await fetch(`https://pokeapi.co/api/v2/pokemon/${poke.name}`);
                const data = await res.json();
                setPokemon((currentList) => [...currentList, data]);
                await pokemon.sort((a, b) => a.id - b.id);
            });
        }
        createPokemonObject(data.results);
        console.log(pokemon);
    };

    useEffect(() => {
        getPokemon();
    }, []);


    return <div className="app-container">
        <div className="pokemon-container">
        <div className="all-container">
            {pokemon.map((pekemonStats)=>(
                <PokemonCard key={pokemonStats.id}
                id={}
            ))}
            </div>
        </div>
    </div>
    

}

export default Pokemon