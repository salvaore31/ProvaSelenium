function createH1Element(text) {
    var h = document.createElement("H1");
    var t = document.createTextNode(text);
    h.appendChild(t);
    document.body.appendChild(h);
}

var myStorage= window.localStorage;
var change = 0;
if ( Math.random() < 0.5 ) {
    change = Math.floor(Math.random() * 100) + 1;
	createH1Element( "Mutation:" + change );
    myStorage.setItem( arguments[arguments.length - 1] , change );
}
return change;