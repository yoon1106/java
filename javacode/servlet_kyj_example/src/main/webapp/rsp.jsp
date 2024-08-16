<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   
    <style type="text/css">
        body{
            height: 100vh;
            display: flex;
            flex-direction:column;
            justify-content: space-between;
           
        }
    </style>
    <script>
        $(document).ready( () => {
           
            function ComputerRspPlayer(yourRsp){
                this.rsp = ['가위', '바위', '보'];
                this.img = ['가위.png', '바위.png', '보.png'];
                

                console.log(Math.floor(Math.random() * 3));
                this.computerRsp = this.rsp[Math.floor(Math.random() * 3)];
                this.getResult = function() {

                    console.log(this.computerRsp + "::::" + yourRsp);
                    let result = "비겼습니다.";
                    if(this.computerRsp == yourRsp )
                        return result;

                    if(this.computerRsp == "가위"){

                        if(yourRsp == "바위")
                            result = "당신이 이겻습니다.";
                        else if(yourRsp == "보")
                            result = "당신이 졋습니다";
                           
                    }else if(this.computerRsp == "바위"){

                        if(yourRsp == "보")
                            result = "당신이 이겼습니다.";
                        else if(yourRsp == "가위")
                            result = "당신이 졌습니다";

                    }else if(this.computerRsp == "보"){

                        if(yourRsp == "가위")
                            result = "당신이 이겻습니다.";
                        else if(yourRsp == "바위")
                            result = "당신이 졌습니다";
                    }
                    return result;                  
                }


            };

            $(".your-rsp").each(function (index, item) {
               
                $(this).click( () => {

                    console.log($(this).text().trim())
                    let rspPlayer = new ComputerRspPlayer($(this).text().trim());
                    let result = rspPlayer.getResult();
                    console.log(result);
                   
                    $("#rsp-result").text(result);
                    $("#rsp-img-your").attr("src","./img/" + $(this).text().trim() + ".png");
                    $("#rsp-img-computer").attr("src","./img/" + rspPlayer.computerRsp + ".png");
                    $("#rsp-btn-computer").text(rspPlayer.computerRsp);
                });

            });
        });    
    </script>
   

</head>
<body>
<header>
     <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
        <a class="navbar-brand" href="#">게임</a>
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
          <li class="nav-item active">
            <a class="nav-link" href="start_input.jsp">가위바위보(input) <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="lotto.jsp">로또</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="lotto2.jsp">로또2</a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
   </header>
   <main>  
      <div class="container">
      <div class="row">
        <div class="col-md-4 d-flex justify-content-center">
          <div class="card" style="width: 18rem;">
              <img id="rsp-img-your" src="https://taegon.kim/wp-content/uploads/2018/05/image-5.png" class="card-img-top" alt="...">
              <div class="card-body text-center">
                <h5 class="card-title">당신</h5>
                <button class="btn btn-primary m-2 your-rsp" >가위</a>
                <button class="btn btn-primary m-2 your-rsp">바위</a>
                <button class="btn btn-primary m-2 your-rsp">보</a>
              </div>
            </div>
        </div>
        <div class="col-md-4 d-flex justify-content-center">
            <div class="card" style="width: 18rem;">
              <img src="https://taegon.kim/wp-content/uploads/2018/05/image-5.png" class="card-img-top" alt="...">
              <div class="card-body text-center">
                <h5 class="card-title ">결과</h5>
                <p id="rsp-result">당신이 이겼습니다.^^</p>
              </div>
            </div>
        </div>
        <div class="col-md-4 d-flex justify-content-center">
            <div class="card" style="width: 18rem;">
              <img id="rsp-img-computer" src="https://taegon.kim/wp-content/uploads/2018/05/image-5.png" class="card-img-top" alt="...">
              <div class="card-body text-center">
                <h5 class="card-title ">컴퓨터</h5>
                <button id="rsp-btn-computer" class="btn btn-primary m-2">가위</a>
              </div>
            </div>
        </div>
 
      </div>
    </div>
   </main>
     
    <footer class="text-center">
   <hr />  
      <p> Company 2017-2018</p>
    </footer>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
   
   
   
    -->
</body>
</html>