import React, { Fragment, useState } from "react";
import { PhoneList } from "./components/PhoneList";
import { PhoneItem } from "./components/PhoneItem";
import PhoneInfo from "./components/PhoneInfo";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
  } from "react-router-dom"

export function App() {
    const [phones, setPhones] = useState([
        { id: 1, phone_name: "iPhone 7", manufacturer: "Apple", description: "Description 1", color: "black", price: 769, screen: "4,7 inch IPS", processor: "A10 Fusion", ram: 2 },
    ])

    const div1Style = {
        background: "MediumSlateBlue",
    };

    const title1Style = {
        marginLeft: "40%",
    };

    const title2Style = {
        marginLeft: "25%",
    };

    const div2Style = {
        marginLeft: "40%",
    };

    return ( 
        <Router>
            <Fragment>
                <div style={div1Style}>
                    <h1 style={title1Style}>Phone Catalog</h1>
                    <h2 style={title2Style}>You can see different phones below. Check your favourite and enjoy!</h2>
                </div>
                <div style={div2Style}>
                    <Link to="/phoneInfo"><PhoneList phones={phones}/></Link>
                    <Switch>
                        <Route exact path="/phoneInfo" component={PhoneInfo}/>
                    </Switch>
                </div>
            </Fragment>
        </Router>
    )
}