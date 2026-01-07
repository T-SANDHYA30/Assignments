abstract class Account{
    accno:string
    accName:string
    ifsc:string
    constructor(accno:string,accName:string,ifsc:string){
        this.accno=accno;
        this.accName=accName;
        this.ifsc=ifsc
    }
}

class SavingAccount extends Account{
    balance:number
    constructor(accno:string,accName:string,ifsc:string,balance:number){
        super(accno,accName,ifsc)
        this.balance=balance
    }
}

let sa:SavingAccount=new SavingAccount("685863216","sandhya","icici89",96000);
console.log(sa)