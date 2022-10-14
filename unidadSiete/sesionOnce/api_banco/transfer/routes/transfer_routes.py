from flask import Blueprint, jsonify, request
from db.database import bankDatabase
from transfer.models.transfer_model import Transfer

transfer = Blueprint('transfer',__name__, url_prefix='/api/transfer')

BODY_ATTR = ["account_from", "account_to", "amount"]

@transfer.route('/create', methods=['POST'])
def create():
    body = request.get_json()
    try:
        for attr in BODY_ATTR:
            if not(attr in body):
                return {'msg': 'faltan campos en el cuerpo de la petición'}, 400
        transfer = Transfer(body["account_to"], body["account_from"], float(body["amount"]))
        resTuple = bankDatabase.addTransfer(transfer)
        return {"msg": resTuple[0]}, resTuple[1]
    except:
        return {"msg": "el servidor no pudo completar la transacción"}, 500