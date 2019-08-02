$(function () {
    temp();
})
function temp() {
    var city1 = $("#tem").val();
    var key = "982e69a9696df182a264a81b408df7e2";
    alert(city1);
    $.ajax({
        url:"weather",
        type:"post",
        data:{city:city1,key:key},
        success:function (data) {
            console.log(data);
            var aa = JSON.parse(data);
            console.log("11111111"+aa.result.realtime.temperature);
            //进行传值操作
            document.getElementById('r1').innerHTML="天气:"+aa.result.realtime.info;	//天气
            document.getElementById('r2').innerHTML="温度:"+aa.result.realtime.temperature+"℃";	//温度
            document.getElementById('r3').innerHTML="湿度:"+aa.result.realtime.humidity;	//湿度
            document.getElementById('r4').innerHTML="风力:"+aa.result.realtime.power;	//风力
        }
    }, 'json')
}