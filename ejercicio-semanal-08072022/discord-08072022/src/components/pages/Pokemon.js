import React,{useState} from "react";
import { UseFetch } from "../UseFetch";

const Pokemon = () => {
    const [url,setUrl]=useState(`https://pokeapi.co/api/v2/pokemon`);
    const estado= UseFetch(url);
    const{cargando,data}=estado;
    cargando? console.log('cargando'):console.log(data.results)


    return (
        <div>
            <h1> Pagina de Pokemon</h1>

        </div>
    )

}

export default Pokemon