import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {}
  }
  componentWillMount() {
    fetch("/hello")
      .then(res => res.json())
      .then(person => this.setState({person: person}));
  }
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          {this.state.person && <h1 className="App-title">Welcome {this.state.person.firstName} {this.state.person.lastName}</h1>}
        </header>
      </div>
    );
  }
}

export default App;
