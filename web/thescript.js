function DisplayQuestions() {
   var Questions = new Array(20);
   Questions[0] = "Question #1";
   Questions[1] = "Question #2";
   Questions[2] = "Question #3";
   Questions[3] = "Question #4";
   Questions[4] = "Question #5";
   Questions[5] = "Question #6";
   Questions[6] = "Question #7";
   Questions[7] = "Question #8";
   Questions[8] = "Question #9";
   Questions[9] = "Question #10";
   Questions[10] = "Question #11";
   Questions[11] = "Question #12";
   Questions[12] = "Question #13";
   Questions[13] = "Question #14";
   Questions[14] = "Question #15";
   Questions[15] = "Question #16";
   Questions[16] = "Question #17";
   Questions[17] = "Question #18";
   Questions[18] = "Question #19";
   Questions[19] = "Question #20";
   var QCount = 0;
   var QNumbers= 0;
                 
      QNumbers++;
      
      
   while (QCount < 20) 
   {
  
      QNumber = Math.round(20 * Math.random());
      if (null != Questions[QNumber]) 
      {
      
	document.getElementById("startprogram").innerHTML = Questions[QNumber];
  
	 QCount++;    
	 Questions[QNumber] = null; // Dump this question - it's been displayed
      }
      
   }
   
   
   
   
   
}



function ValidateTrueOrFalse()
{
var points = document.getElementById("totalscore").value;
	
}



score = 0;

easy = 20;

intermediate = 15;

hard = 10;

var gameover = "Game over! please restart the game";

      
      function Greet()
			{
			
				
			
				pic1 = document.getElementById('assassinscreed').id;
				var Check1 = document.getElementById('Giveanswer1').value;
		
			  
        
				if(Check1 == pic1)
				{
					score += 5;
    	document.getElementById("totalscore").innerHTML = score;
					document.getElementById("Greeting1").innerHTML = "Correct!";
					document.getElementById("Greeting1").style.color = "black";
					document.getElementById("Greeting1").style.fontSize = "50px";
				 
				
				}
				
			 	
				else
				{


easy -= 1;
  document.getElementById("totalguesses1").innerHTML = easy;
  intermediate -= 1;
  document.getElementById("totalguesses2").innerHTML = intermediate;
  hard -= 1;
  document.getElementById("totalguesses3").innerHTML = hard;
				

if(easy <=  5)
{
  document.getElementById("totalguesses1").innerHTML = easy;
document.getElementById("totalguesses1").style.color = "Red";

}
if(intermediate <=  5)
{

  document.getElementById("totalguesses2").innerHTML = intermediate;
document.getElementById("totalguesses2").style.color = "Red";

}
if(hard <=  5)
{

  document.getElementById("totalguesses3").innerHTML = hard;
document.getElementById("totalguesses3").style.color = "Red";

}

if(easy ==  0)
{


  alert('The game is over for EASY MODE. Your score is ' + score);
 

}
if(intermediate ==  0)
{    
  alert('The game is over for INTERMEDIATE MODE. Your score is ' + score);


}
if(hard ==  0)
{       
  alert('The game is over for EXPERT MODE. Your score is ' + score);


}


	


					document.getElementById("Greeting1").innerHTML = "Wrong! Please try again";
					document.getElementById("Greeting1").style.color = "red";
					document.getElementById("Greeting1").style.fontSize = "20px";
					
				
				}
				
	
			}
			


function shuffle()

{
 	var iIndex;
				
				iIndex = Math.floor(Math.random() * 10);
    
       	document.getElementById("assassinscreed").src = arrNames[iIndex];
        
        
        
        
        
      //  document.getElementById("Image2").src = arrNames[iIndex];
       
        
				
				
			//	document.getElementById("Image3").src = arrNames[iIndex];
			//	document.getElementById("Image4").src = arrNames[iIndex];
			//	document.getElementById("Image5").src = arrNames[iIndex];
			//	document.getElementById("Image6").src = arrNames[iIndex];
			//	document.getElementById("Image7").src = arrNames[iIndex];
			//	document.getElementById("Image8").src = arrNames[iIndex];
			//	document.getElementById("Image9").src = arrNames[iIndex];
			//	document.getElementById("Image10").src = arrNames[iIndex];
				
			  // String[] split = aw.split("/");
		    var str="How are you doing today?";
          var n=str.split(" ");
        //one =  document.getElementById("Image1").src;
        
      //   var str= "images/nico.jpg";
 // var n=str.split("/",2);

//var a = n[1];
//var na = n[1].split(".",1);
        document.getElementById("aa").innerHTML = document.getElementById("assassinscreed").src;


}



			