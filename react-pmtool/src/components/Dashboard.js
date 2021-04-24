import React, { Component } from 'react'
import Header from './layout/Header';
import ProjectItem from './project/ProjectItem'
import "bootstrap/dist/css/bootstrap.min.css";

class Dashboard extends Component {
    render() {
        return (
            <div>
                <Header />
                <h1 className="alert alert-warning">Welcome to Dashboard</h1>
                <ProjectItem />
            </div>
        )
    }
}

export default Dashboard;
