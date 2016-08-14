var path = require('path');
var srcPath = path.join(__dirname, 'src');
var buildPath = path.join(__dirname, 'dist');

var config = {
    context: srcPath,
    entry: path.join(srcPath, 'js', 'client.js'),

    output: {
	path: buildPath,
	filename: 'bundle.js',
    },

    devServer: {
	inline: true,
	port: 8090
    },

    module: {
	loaders: [
	    {
		test: /\.jsx?$/,
		exclude: /node_modules/,
		loader: 'babel',
		query: {
		    presets: ['es2015', 'react']
		}

	    }
    	 ]
    }
}

module.exports = config;
	


