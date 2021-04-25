import './App.css';
import Dashboard from './components/Dashboard';
import Header from './components/layout/Header';
import { BrowserRouter as Router, Route } from "react-router-dom"
import AddProject from './components/project/AddProject';

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <Route path="/dashboard" component={Dashboard} exact></Route>
        <Route path="/addProject" component={AddProject} exact></Route>
      </div>
    </Router>
  );
}

export default App;
