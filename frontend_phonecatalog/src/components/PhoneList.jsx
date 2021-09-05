import React from 'react'
import { PhoneItem } from './PhoneItem'

export function PhoneList({ phones, info }) {
    return (
        <ul>
            {phones.map((phone) => (
                <PhoneItem phone={phone}/>
            ))}
        </ul>
    );
}
