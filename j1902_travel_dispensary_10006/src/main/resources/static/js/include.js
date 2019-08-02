$(function () {
    $.get("header.html",function (data) {
        $("#header").html(data);
    });
    $.get("header1.html",function (data) {
        $("#headerss").html(data);
    });
    $.get("footer.html",function (data) {
        $("#footer").html(data);
    });
    $.get("order_header.html",function (data) {
        $("#orderheader").html(data);
    });
    $.get("comments.html",function (data) {
        $("#comments").html(data);
    });
});