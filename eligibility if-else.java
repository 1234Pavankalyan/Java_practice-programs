    

        //Placement -- Ready     maybe     No

   //WAP to accept   Assignement_score,  Mentors_feedback_score, C20 score

   //The learner should pass in all the 3 subjects and passmarks is 50 in each.
   //if the leaner got passed in 3 subjects then find out total score.
       //  ---> 70% from C20, 20% from Assignment , 10 % from Mentors_feedback

             //     90 , 78, 98

  // Based on total score dispaly "Ready" , "maybe" ,"No"
    
          // if Total_score >80   --> Ready
          //  50-80    --> Maybe
         // below 50  --> NO

// if learners got failed in any one of the subjects, display subject name along with score.

          // you got failed in assignemnts and your score is 40

          import java.util.*;
           class Simple{
             public static void main(String args[]){
               int as,mf,c20,sum;
               double per;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter marks as");
               as=sc.nextInt();
               System.out.println("enter marks mf");
               mf=sc.nextInt();
               System.out.println("enter marks c20");
               c20=sc.nextInt();
               sum=as+mf+c20;
               per=((as*100)/sum+(mf*100)/sum+(c20*100)/sum);
            
             if((as>=50)&&(mf>=50)&&(c20>=50)){
              if(sum>80){ 
                per=((70*90)/100+(70*90)/100+(70*90)/100);
               System.out.println("you are ready and your score is " +sum);
              }
               else if((as<=50)&&(mf<=50)&&(c20<=50)||((per<=50)&&(per>=80)))
                      {
                 System.out.println("you may be ready for placement");   
                   }
               else
               {
               System.out.println("you are not ready"); 
               }
             }
                else{
      if(as<50){
         System.out.println("failed in assignment " + as + " Score");
      }
    
      if (c20 < 50 ) {
        System.out.println("failed in c20 " + c20 + " Score");  
    } 
      if (mf<50){
      System.out.println("mentor assignment fail " + mf + " Score");
    }
    }   
  }
}
  