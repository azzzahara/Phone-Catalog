import React from 'react'

export function PhoneItem({ phone }) {
    const { id, phone_name, manufacturer, description, color, price, screen, processor, ram} = phone
    
    return <li>{phone_name}</li>
}
