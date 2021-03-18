var myStorage = window.localStorage;
var arr=[];
for ( var i=1; i <= arguments[0];i++){
    arr.push(myStorage.getItem( i ));
}
return arr;