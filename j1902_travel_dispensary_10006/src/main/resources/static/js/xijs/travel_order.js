var num_jia = document.getElementById("num-jia");
var num_jian = document.getElementById("num-jian");
var input_num = document.getElementById("input-num");

num_jia.onclick = function() {
    input_num.value = parseInt(input_num.value) + 1;
}
num_jian.onclick = function() {
    if(input_num.value <= 0) {
        input_num.value = 0;

    } else {
        input_num.value = parseInt(input_num.value) - 1;
    }
}

/*//数字加减框
 $("body").on("click",".num-jian",function (m) {
 var obj = $(this).closest("ul").find(".input-num");
 if (obj.val() <= 0) {
 obj.val(0);
 } else {
 obj.val(parseInt(obj.val()) - 1);
 }
 obj.change();
 });
 $("body").on("click",".num-jia",function (m) {
 var obj = $(this).closest("ul").find(".input-num");
 obj.val(parseInt(obj.val()) + 1);
 obj.change();
 });*/

layui.use('laydate', function(){
    var laydate = layui.laydate;
    laydate.render({
        elem: '#test6'
        ,range: true
    });
    laydate.render({
        elem: '#test9'
        ,type: 'time'
        ,range: true
    });
});
$("#conmitbut").click(function (v, r, i) {
    alert("aaaa");
    var input1 = {};
    $(".layui-input").each(function (value, row, index) {
        var key = row.valueOf().name;
        input1[key] = row.valueOf().value;
    })
    var inputs = JSON.stringify(input1)
    console.log(inputs);
    $.ajax({url:"cart/order_submit",
            type:"post",
            data:inputs,
            contentType: "application/json;charset=utf-8",
            success:function (msg) {
                alert(msg);
                window.location.href="traveldetail?msg="+msg;
            }
    })
})

