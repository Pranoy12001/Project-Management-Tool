import React, { Component } from 'react'
import Header from './layout/Header';
import ProjectItem from './project/ProjectItem'
import "bootstrap/dist/css/bootstrap.min.css";
import CreateProjectButton from './project/CreateProjectButton';

class Dashboard extends Component {
    render() {
        return (
            <div className="projects">
                <div className="container">
                    <div className="row">
                        <div className="col-md-12">
                            <h1 className="display-4 text-center">Projects</h1>
                            <br />
                            <CreateProjectButton />
                            <br />
                            <hr />
                            <ProjectItem />
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Dashboard;
