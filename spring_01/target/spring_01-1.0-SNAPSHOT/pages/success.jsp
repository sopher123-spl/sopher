<html>
<head>
    <title>Title</title>
    <script src="../js/jquery.min.js"></script>
    <script>
        $(function () {
            // 绑定点击事件
            $("#btn").click(function(){
                $.ajax({
                    url:"hehe",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"addressName":"aa","addressNum":100}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        alert(data);
                        alert(data.addressName);
                    }
                });
            });
        });

    </script>
</head>
<body>
<h2 id="btn">haha</h2>

</body>
</html>
