$("#btnIdsss").on("click",function (){
    //alert("aaaa");
    var id=$(this).attr("value");
    //alert(id);
    $(".pros_other").find('p').each(function (i, obj) {
        var text = $(obj).text();
        //alert(text);
    });

    $.ajax({
        url:"travelorder",
        type: "post",
        data:"id="+id,
        success:function (msg) {
            alert(msg);
            window.location.href = "travel_order.html";
        }
    });
});

function collection() {
    alert("bbbbb");
}