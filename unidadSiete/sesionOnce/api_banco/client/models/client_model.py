class Client():
    def __init__(self, cui, name, lastName):
        self.__cui = cui
        self.__name = name
        self.__lastName = lastName
        self.__accounts = []

    def addAccount(self, account):
        self.__accounts.append(account)

    def getCui(self):
        return self.__cui

    def getName(self):
        return self.__name

    def getLastName(self):
        return self.__lastName
    
    def getAccount(self, uuidAccount):
        for account in self.__accounts:
            if account.getUuid() == uuidAccount:
                return account
        return None
    
    def getData(self):
        list_account = []
        for acc in self.__accounts:
            list_account.append(acc.getData())
        return {
            "cui": self.__cui,
            "name": self.__name,
            "lastName": self.__lastName,
            "accounts": list_account
        }