class Database():
    '''Esta clase manejará todos los datos que usará la API. Estos datos
    se perderán cada vez que el servidor se reinicie.'''
    def __init__(self):
        self.__cuiClients = []
        self.__clients = []
        self.__accounts = []
        self.__transfers = []

    def addClient(self, client):
        '''Añade un registro de un un nuevo cliente a la lista de clientes. Verificará que el CUI no este duplicado'''
        if not(client.getCui() in self.__cuiClients):
            self.__clients.append(client)
            self.__cuiClients.append(client.getCui())
            print(self.__clients)
            return True
        return False

    def getClient(self, cuiClient):
        '''Busca un cliente usando el cuidClient como referencia. Si no encuentra alguna coincidencia el resultado es None'''
        if int(cuiClient) in self.__cuiClients:
            for client in self.__clients:
                if client.getCui() == int(cuiClient):
                    return client
        return None
    
    def addAccount(self, account):
        '''Añade una cuenta a la lista de cuentas'''
        self.__accounts.append(account)
        return True
    
    def getAccount(self, uuidAccount):
        '''Recupera una cuenta de la lista de cuenta usando como referencia el identificador único de la cuenta'''
        for account in self.__accounts:
            if str(account.getUuid()) == uuidAccount:
                return account
        return None

    def addTransfer(self, transfer):
        '''Añade un registro de transferencia a la lista de transferencias'''
        # debe vericiar que ambas cuentas existan
        toAccountFlag = False
        fromAccountFlag = False
        for account in self.__accounts:
            if str(account.getUuid()) == transfer.getToAccount():
                toAccountFlag = True
            if str(account.getUuid()) == transfer.getFromAccount():
                fromAccountFlag = True
        if(not(toAccountFlag)):
            return ("la cuenta destino no existe", 404)
        if(not(fromAccountFlag)):
            return ("la cuenta de origen no existe", 404)
        # las cuentas deben ser diferente
        if (transfer.getFromAccount() == transfer.getToAccount()):
            return ("la cuenta de origen no puede ser la misma que la cuenta destino", 400)
        self.__transfers.append(transfer)
        return ("transferencia exitosa", 201)
    
    def getTransfers(self, uuidAccount):
        '''Recupera todas las transferencia que se han realizado desde y hacia una cuenta en específico'''
        transfersData = []
        for transfer in self.__transfers:
            if transfer.getToAccount() == uuidAccount or transfer.getFromAccount() == uuidAccount:
                transfersData.append(transfer)
        return transfersData

bankDatabase = Database()