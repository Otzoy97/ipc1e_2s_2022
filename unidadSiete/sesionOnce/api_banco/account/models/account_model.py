from uuid import uuid4

class Account():

    def __init__(self, cui, type, funds):
        self.__uuid = uuid4()
        self.type = type
        self.__funds = funds
        self.__cui = cui

    def addFunds(self, amount):
        self.__funds += amount

    def getUuid(self):
        return self.__uuid
    
    def getFunds(self):
        return self.__funds
    
    def getData(self):
        return {
            "uuid": self.__uuid,
            "cui": self.__cui,
            "funds": self.__funds,
            "type": self.type
        }