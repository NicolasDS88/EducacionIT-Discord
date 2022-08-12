import React from 'react'
import "../../styles/NavPokemon.css";
import pokeballBlack from "../../img/pokeballBlack.png"
import pokeball from "../../img/pokeball.png"

function NavPokemon() {
    return (
        <div className="title">
            <div className="title__left">
                <p>Pokedex</p>
                <div className="caught-seen">
                    <div className="caught">
                        <img
                            src={pokeball}
                            alt="Fig Pokebola"
                            style={{ widht:"30px", height:"30px",
                                     marginRight:"10px" }} />
                        <p>151</p>
                    </div>
                    <div className="seen">
                        <img
                            src={pokeballBlack}
                            alt="Fig Pokebal"
                            style={{ widht:"30px", height:"30px",
                                     marginRight:"10px" }} />
                        <p>000</p>
                    </div>
                </div>
            </div>
            <p style={{ color: "white" }}>A -&gt; Z</p>
        </div>
    );

}
export default NavPokemon;