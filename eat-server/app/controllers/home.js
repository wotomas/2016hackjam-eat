var express = require('express'),
  router = express.Router(),
  bodyParser = require('body-parser'),
  //request = require('request'),
  Article = require('../models/article');
var Connection = require('tedious').Connection;
var config = {
		username: 'sangyeop',
		password: 'Underdog!',
		server: 'sangyeop.database.windows.net',
		options: {encrypt: true, database: 'database'}
}

module.exports = function (app) {
  app.use('/', router);
};

router.get('/', function (req, res, next) {
  var articles = [new Article(), new Article()];
    res.render('index', {
      title: 'Generator-Express MVC',
      articles: articles
    });
});

router.post('/register', function(req, res, next){
	
});

router.get('/availableusers', function(req, res, next){
	var connection = new Connection(config);  
    connection.on('connect', function(err) {  
        if (err) {  
            console.log(err);
        }else {  
            console.log("Connected");
            executeStatement(); 
        }  
    });  
  
    var Request = require('tedious').Request;  
    var TYPES = require('tedious').TYPES;  
  
    function executeStatement() {  
        request = new Request("SELECT * FROM *", function(err) {  
        if (err) {  
            console.log(err);}  
        });  
        var result = "";  
        request.on('row', function(columns) {  
            columns.forEach(function(column) {  
              if (column.value === null) {  
                console.log('NULL');  
              } else {  
                result+= column.value + " ";  
              }  
            });  
            console.log(result);  
            result ="";  
        });  
  
        request.on('done', function(rowCount, more) {  
        	console.log(rowCount + ' rows returned');  
        });  
        connection.execSql(request);  
    }  
});