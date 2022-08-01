import './App.css';
import React from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Navbar from './components/nav/Navbar';
//import Inicio from './components/pages/Inicio';
//import Pokemon from './components/pages/Pokemon';
//import Items from './components/pages/Items';
//import Covid from './components/pages/Covid';

function App() {
 
  return (
    <div className="App">
      
    <Router>
      <Navbar/>
     


    </Router>



    </div>
  );
}

export default App;
