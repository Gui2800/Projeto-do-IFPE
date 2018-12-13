var express = require('express');
var cookieParser = require('cookie-parser');

var session = require('express-session');
var app = express();
//var alert["Bem vindo ao jogo"];

app.use(cookieParser());
app.use(session({secret: "Shh, its a secret!"}));

app.get('/', function(req, res){
   if(req.session.page_views){
      req.session.page_views++;
      res.send("Você já visitou esta página " + req.session.page_views + " vezes");
   } else {
      req.session.page_views = 1;
      res.send("Bem vindo a esta página pela primeira vez");
   }
});

app.get('/jogar', function(req, res) {
    if(req.session.page_views){
        req.session.page_views++;
        res.onload.send("Bem vindo ao jogo");
    }
    else{
        req.session.page_views = 1;
        res.onload.send("Você de novo aqui?");   
    }
});
app.listen(3000);
