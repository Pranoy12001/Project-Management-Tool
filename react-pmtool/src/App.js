import './App.css';
import Dashboard from './components/Dashboard';
import Header from './components/layout/Header';
import { BrowserRouter as Router, Route } from "react-router-dom"
import AddProject from './components/project/AddProject';
import { Provider } from "react-redux";
import store from "./store";

function App() {
  return (
    <Provider store={store}>
      <Router>
        <div className="App">
          <Header />
          <Route path="/dashboard" component={Dashboard} exact></Route>
          <Route path="/addProject" component={AddProject} exact></Route>
        </div>
      </Router>
    </Provider>
  );
}

export default App;
