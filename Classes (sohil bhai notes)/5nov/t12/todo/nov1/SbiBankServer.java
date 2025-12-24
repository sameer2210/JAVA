/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+12 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	@copyright  surendra 2020
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */
  //@author  Surendra  sbi DEVELOPER
  //Date  01/11/2020
 public class SbiBankServer{ 
      SbiUser[] userListDB= {
    		  new SbiUser("s1001","1234",52000F),
    		  new SbiUser("s1002","4321",5000F),
    		  new SbiUser("s1003","5555",4000F),
    		  new SbiUser("s1004","2234",10000F),
    		  new SbiUser("s1005","1356",4000F),
    		  new SbiUser("s1006","5436",91000F,true),
      };
	 
	 
	 public boolean withdraw(String givenAcNumber,String givenPinNo,float amount)
	 throws AccountNotFoundException
	       ,AccountBlockedException
	       , InvalidPinException
	       , AmountInsufficientException
	       , AccountLimiteException{
		 
		 //search  account    
		 SbiUser foundUser =null;
		 for(SbiUser user: userListDB){
			 if(user.getAc().equalsIgnoreCase(givenAcNumber)){
				 foundUser =user;
				 break;
			 }
		 }
		 if(foundUser==null){
			 String errMsg="Given Account NO "+givenAcNumber +" NOT Found";
			 throw new AccountNotFoundException(errMsg);
		 }
		 
		 //here come mean user found
		 //check is blocked or not
		 if(foundUser.isBlocked()==true){
			 String errMsg="Given Account NO "+givenAcNumber +" Is BLOCKED";
			 throw new AccountBlockedException(errMsg);
		 }
		 
		 //check pin
		 if(foundUser.getPin().equals(givenPinNo)==false){
			 String errMsg="Invalid Pin ";
			 InvalidPinException e =  new InvalidPinException(errMsg);
			 throw e;
		 }
		 //else pin matched
		 //check balance
		 if(amount>foundUser.getAmount()){
			 String errorDetails="Insufficient balance";
			throw new AmountInsufficientException(errorDetails);
		 } 
		 
		 if(amount>20000){
			 String errorDetails="Limit Exceed : only 20000 /rs withrow..";
			throw new AccountLimiteException(errorDetails);
		 }
		 
		 float remainAmount = foundUser.getAmount()-amount;
		 foundUser.setAmount(remainAmount);
		 
		 //if all check pass
		 return true;
	 }
	 
 }//End of class 
