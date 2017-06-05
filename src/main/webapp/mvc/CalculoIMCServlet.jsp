<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="../exemplo-css\meu-estilo.css">
    
    
<title>Calculo IMC </title>
  </head>
  

  <body>

    
<div class="col-md-7">
    <div class="modal-content">
      <form name="formulario">
        <h2 class="form-signin-heading">Calculo IMC</h2>
        
        <fieldset class="form-group">
        <form method="GET">

        <div class="Peso">
        <label for="peso" class="sr-only" >Peso :</label>
        <input type="text" name="peso" class="form-control" placeholder="Digite o peso" required autofocus/>
        

        <div class="Altura">
        <label for="atura" class="sr-only">Altura :</label>
       <input type="text"  name="altura" class="form-control" placeholder="Digite a altura" required/>
        

        <div class="Sexo">
            <label for="sexo" class="sr-only">Masculino</label>
            <input type="radio" name="sexo" required/>
             <label for="sexo" class="sr-only">Feminino</label>
             <input type="radio" name="sexo" required/>
        <br>
        <button class="btn btn-sm btn-primary">Calcular!</button>
        <p>
        
        
        

          
        </fieldset>



 
 
        </div>
       
       
      </form>
  
   </body>
</html>

        </div>


<div class="alert alert-success" role="alert" >${condicao}</div>
<div class="alert alert-success" role="alert" >O IMC é : ${calcularimc}</div> 
   
</div>
  </body>
</html>
