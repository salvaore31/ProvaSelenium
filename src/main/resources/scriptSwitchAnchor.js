var aTags = document.getElementsByTagName("a");
var searchText = "Betty Davis";
var found1;
var found2;
var temp;
    for (var i = 0; i < aTags.length; i++) {
        if ( aTags[i].textContent == searchText ) {
            found1 = aTags[i];
        }
        if ( aTags[i].textContent == "Harold Davis" ){
            found2=aTags[i];
        }
    }
    temp=found1.href;
    found1.href=found2.href;
    found2.href=temp;