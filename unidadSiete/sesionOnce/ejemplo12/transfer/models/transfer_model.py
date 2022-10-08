import datetime

class Transfer():
    def __init__(self, toAccount, fromAccount, amount):
        self.__timestamp = datetime.datetime.now()
        self.__toAccount = toAccount
        self.__fromAccount = fromAccount
        self.__amount = amount 
    
    def getTimestamp(self):
        return self.__timestamp
        
    def getToAccount(self):
        return self.__toAccount

    def getFromAccount(self):
        return self.__fromAccount

    def getAmount(self):
        return self.__amount
    
    def getData(self):
        return {
            "timestamp": self.__timestamp,
            "toAccount": self.__toAccount,
            "fromAccount": self.__fromAccount,
            "amount": self.__amount
        }