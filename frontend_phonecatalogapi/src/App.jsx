import React from 'react'
import { PhoneList } from './components/PhoneList'

class App extends React.Component {

  constructor(props) {
    super(props)
    this.state = { phones: [] }
  }

  componentWillMount() {
    fetch('http://localhost:8080/phones/')
      .then((response) => {
        return response.json()
      })
      .then((phones) => {
        this.setState({ phones: phones })
      })
  }

  render() {
    if (this.state.phones.length > 0) {
      return (
        <div className="container-fluid">
          <PhoneList phones={this.state.phones} />
        </div>
      )
    } else {
      return <p className="text-center">Charging phones...</p>
    }
  }

}

export default App