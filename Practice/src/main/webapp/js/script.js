
var $ = function (id) {
    return document.getElementById(id);
};




window.onload = function () {



    $("showpass").onmousedown = function () {
        $("password").type = "text";
        $("showpass").src = "https://img.icons8.com/windows/32/000000/closed-eye.png";
    };

    $("showpass").onmouseup = function () {
        $("password").type = "password";
        $("showpass").src = "https://img.icons8.com/fluent-systems-filled/24/000000/visible.png";
    };




};
