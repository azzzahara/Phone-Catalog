import React, { Fragment } from 'react'
import iphone7 from "../assets/img/iphone7.jpg"

export function PhoneItem({ phone }) {
    const { id, phone_name, manufacturer, description, color, price, screen, processor, ram} = phone
    
    return (
        <Fragment>
            <li>{phone_name}</li>
            <img src={iphone7} style={{width: "200px" , height: "100px", marginLeft: "-8%"}}/>
        </Fragment>
    )
}
