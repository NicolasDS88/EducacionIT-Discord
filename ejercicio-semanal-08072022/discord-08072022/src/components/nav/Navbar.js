import React from 'react'
import {Link} from 'react-router-dom'

const Navbar = () => {
    return (
        <div>            
            <nav className="">
                <div className="container">
                    <a className="navbarNav" href="#">Navbar</a>
                    <button className="navbar">
                        Titulo
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div className="navbar-nav">
                            <a className="nav-link active" aria-current="page" href="#">Home</a>
                            <a className="nav-link" href="#">Features</a>
                            <a className="nav-link" href="#">Pricing</a>
                            <a className="nav-link disabled">Disabled</a>
                        </div>
                    </div>
                </div>
            </nav>

        </div>
    )
}

export default Navbar