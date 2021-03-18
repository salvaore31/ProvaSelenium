var aTags = document.getElementsByTagName("a");
var searchText = "Betty Davis";
var found;

for (var i = 0; i < aTags.length; i++) {
    if ( aTags[i].textContent == searchText || aTags[i].textContent == "Harold Davis" ) {
        found = aTags[i];
        found.style.pointerEvents="none";
        found.style.cursor="default";
    }
}
