import React from 'react';
import { Link } from 'react-router';

class Layout extends React.Component {
    render() {
	return (
	    <div>
	    	<h1>KillerNews.net</h1>
		{this.props.children}
		<Link to="archives"><button>Archives</button></Link>
		<Link to="settings"><button class="btn btn-success">Settings</button></Link>
	    </div>
	);
    }
}

export default Layout;


