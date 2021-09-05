import React from 'react'
import { PhoneItem } from './PhoneItem'

export function PhoneList({ phones }) {
    return (
        <ul>
            {phones.map((phone) => (
                <PhoneItem phone={phone}/>
            ))}
        </ul>
    );
}