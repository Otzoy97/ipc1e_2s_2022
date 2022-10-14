from flask import Blueprint, jsonify, request
from db.database import bankDatabase
from account.models.account_model import Account

account = Blueprint('account', __name__, url_prefix="/api/account")

@account.route('/create', methods=['POST'])
def create():
    '''Servicio para crear una cuenta y asociarla a un cliente'''
    body = request.get_json()
    try:
        if ("type" in body and "funds" in body and "cui" in body):
            client = bankDatabase.getClient(int(body["cui"]))           
            if (client != None):
                account = Account(int(body["cui"]), body["type"], float(body["funds"]))
                client.addAccount(account)
                bankDatabase.addAccount(account)
                return {'msg': f"cuenta id. '{account.getUuid()}' creada exitosamente"}, 201
            else:
                return {'msg': 'cliente con cui ingresado no existe'}, 404
        else:
            return {'msg': 'faltan campos en la petición'}, 400
    except:
        return {'msg': 'ocurrió un error en el servidor'}, 500

@account.route('/view/<account>', methods=['GET'])
def view(account):
    '''Servicio para recuperar información de una cuenta'''
    try:
        account = bankDatabase.getAccount(account)
        if (account != None):
            return account.getData(), 200
        else:
            return {'msg': 'No se encontró la cuenta'}, 404
    except:
        return {'msg': 'ocurrió un error en el servidor'}, 500
